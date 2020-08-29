package xprogrammer.wbc.dmn.crawler.biz;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.htmlcleaner.XPatherException;

import xprogrammer.wbc.dmn.cmn.constant.Letter;
import xprogrammer.wbc.dmn.cmn.exception.SvcException;
import xprogrammer.wbc.dmn.crawler.dvo.ItmInfDvo;
import xprogrammer.wbc.dmn.crawler.dvo.UrlInfDvo;
import xprogrammer.wbc.dmn.crawler.svc.CrawlerSvcIF;
import xprogrammer.wbc.dmn.crawler.svc.CrawlerSvcImpl;
import xprogrammer.wbc.dmn.dba.biz.DbaBiz;
import xprogrammer.wbc.dmn.util.CrawlerUtil;
import xprogrammer.wbc.dmn.util.DateUtil;

public class CrawlerBiz {
	private static Logger logger = Logger.getLogger(CrawlerBiz.class);
	
	@SuppressWarnings("deprecation")
	public static void crawling(String action, String mode) {
		long start = System.currentTimeMillis();
		DbaBiz dbaBiz = new DbaBiz();
		CrawlerSvcIF service = new CrawlerSvcImpl();
		
        Date spendTime1 = new Date(start);
        logger.info(" 시작시간 : "+(spendTime1.getHours()) + "시  "+spendTime1.getMinutes() + "분  "+spendTime1.getSeconds() + "초");
        
        // 1.수집할 URL목록을 가져온다.
        UrlInfDvo urlInfParam = new UrlInfDvo();
        urlInfParam.setUseYn("Y");	// 사용여부가 Y인 것만 추출
        List<UrlInfDvo> urlInfList;
		try {
			urlInfList = service.selectUrlInfList(urlInfParam);
	        // URL에서 추출할 항목의 수
	        for(int i=0;i<urlInfList.size();i++) {
	        	UrlInfDvo urlInfDvo = urlInfList.get(i);
	        	String urlInfSeq = urlInfDvo.getSeq();
	        	String url = urlInfDvo.getUrl();
	        	String paramPageNm = urlInfDvo.getParamPageNm();
	    		String startPage = urlInfDvo.getStartPage();
	    		String endPage = urlInfDvo.getEndPage();
	    		String tblId = urlInfDvo.getTblId();			// 입력할 테이블이름
	    		String cols = "";								// 입력할 컬럼이름
	    		String slctSqlTyp = urlInfDvo.getSlctSqlTyp();	// 임시테이블에서 데이터를 가져올 SQL타입
	        	for(int page = Integer.parseInt(endPage);page>=Integer.parseInt(startPage);page--) {
	        		// 추출할 item정보를 가져온다.
	        		String srcUrl = url + paramPageNm + Letter.EQUAL_MARK + page;
	        		// HTML을 가져온다.
	            	String html = CrawlerUtil.getHTMLContent(srcUrl);
	            	// HTMLCleaner
	                HtmlCleaner cleaner = new HtmlCleaner();
	                CleanerProperties props = cleaner.getProperties();
	                props.setOmitComments(true);
	                props.setOmitDoctypeDeclaration(true);
	                props.setOmitDeprecatedTags(true);
	                props.setOmitUnknownTags(true);
	                props.setOmitXmlDeclaration(true);
	                TagNode node = cleaner.clean(html);
	                // 추출해야할 데이터 목록을 가져온다.
	    	        ItmInfDvo itmInfParam = new ItmInfDvo();
	    	        itmInfParam.setUrlInfSeq(urlInfSeq);
	    	        List<ItmInfDvo> itmInfList = service.selectItmInfList(itmInfParam);
	    	        
	    	        for(int j=0;j<itmInfList.size();j++) {
	    	        	ItmInfDvo itmInf = itmInfList.get(j);
		        		switch (itmInf.getXtrctTyp()) {
							case "XTRCT_TYP_01": getXtrctTyp1(node, itmInf); break;
							case "XTRCT_TYP_02": getXtrctTyp2(node, itmInf); break;
							case "XTRCT_TYP_03": getXtrctTyp3(node, itmInf); break;
							case "XTRCT_TYP_04": getXtrctTyp4(node, itmInf); break;
							case "XTRCT_TYP_05": getXtrctTyp5(node, itmInf); break;
							default:break;
						}
	    	        }
	    	        
	        	} // 페이지반복
	        	
	        	// 테이블삭제
	        	dbaBiz.dropTbl(urlInfDvo);
	        	// 테이블생성
	        	dbaBiz.createTbl(urlInfDvo);
	        	// 결과입력
	        	dbaBiz.insertResult(urlInfDvo);
		        // 임시테이블삭제
		        dbaBiz.deleteTmpTbl();
		        // 사용여부변경
		        
	        }
		} catch (SvcException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
        Date spendTime2 = new Date(end);
        logger.info("종료시간 : "+(spendTime2.getHours()) + "시  "+spendTime2.getMinutes() + "분  "+spendTime2.getSeconds() + "초");
        long totlaTime = end-start;
        logger.info("======================================================================================================");
        logger.info("경과시간 :"+totlaTime);
        logger.info("경과시간 :"+DateUtil.calculateGapTime(spendTime1, spendTime2));
	}
	
	/**
	 * xpath expression을 통해 가져온  td의 텍스트데이터를 추출
	 * @param srcUrl
	 */
	private static void getXtrctTyp1(TagNode node, ItmInfDvo itmInf) {
		DbaBiz dbaBiz = new DbaBiz();
		try {
			Object[] nodeArray = node.evaluateXPath(itmInf.getXtrctXpath());
			if(nodeArray!=null) {
		    	for (Object obj: nodeArray) {
		    		TagNode htmlNode = (TagNode)obj;
		    		String value = htmlNode.getText().toString();
		    		if(!"&nbsp;".equals(value)){
		    			dbaBiz.inputTmpTbl(itmInf,value);
		    		}
		    	}
			} else {
				dbaBiz.inputTmpTbl(itmInf,"값없음");
			}
		} catch (XPatherException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 특정클래스를 가진 tr에서 특정 클래스를 가진 td의 텍스트 데이터를 추출
	 * 
	 * @param srcUrl
	 */
	private static void getXtrctTyp2(TagNode node, ItmInfDvo itmInf) {
		DbaBiz dbaBiz = new DbaBiz();
		try {
			Object[] nodeArray = node.evaluateXPath("//table//tbody//tr");
        	for (Object obj: nodeArray) {
        		TagNode htmlNode = (TagNode)obj;	// tr노드를 모두 가져온다.
        		String trClass = htmlNode.getAttributeByName("class");
        		if(itmInf.getXtrctNm().equals(trClass)) {	// 포함할 tr클래스명
        			Object[] nodeTd = htmlNode.evaluateXPath(itmInf.getXtrctXpath());	// 추출할 TD XPATH
        			for (Object obj2: nodeTd) {
        				TagNode htmlNodeTd = (TagNode)obj2;
        				String value = htmlNodeTd.getText().toString();
        				dbaBiz.inputTmpTbl(itmInf,value);
        			}
        		}
        	}
		} catch (XPatherException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 특정클래스를 가진 tr을 제거한 후 특정 클래스를 가진 td의 데이터를 추출
	 * @param node
	 * @param itmInf
	 */
	private static void getXtrctTyp3(TagNode node, ItmInfDvo itmInf) {
		DbaBiz dbaBiz = new DbaBiz();
		try {
			Object[] nodeArray = node.evaluateXPath("//table//tbody//tr");
        	for (Object obj: nodeArray) {
        		TagNode htmlNode = (TagNode)obj;	// tr노드를 모두 가져온다.
        		String trClass = htmlNode.getAttributeByName("class");
        		if(!itmInf.getXtrctNm().equals(trClass)) {	// 제외할 tr클래스명
        			Object[] nodeTd = htmlNode.evaluateXPath(itmInf.getXtrctXpath());	// 추출할 TD XPATH
        			for (Object obj2: nodeTd) {
        				TagNode htmlNodeTd = (TagNode)obj2;
	        			String value = htmlNodeTd.getText().toString();
	        			dbaBiz.inputTmpTbl(itmInf,value);
        			}
        		}
        	}
		} catch (XPatherException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 특정 클래스를 가진 td의 데이터를 추출
	 * 같은 이름의 클래스가 반복됨, index로 구분하여 필요한 데이터만 추출해야 함
	 * @param node
	 * @param itmInf
	 */
	private static void getXtrctTyp4(TagNode node, ItmInfDvo itmInf) {
		DbaBiz dbaBiz = new DbaBiz();
		try {
			Object[] nodeArray = node.evaluateXPath(itmInf.getXtrctXpath());
        	logger.debug("nodeArray Size:"+nodeArray.length);
        	int idx = 0;
        	for (Object obj: nodeArray) {
        		TagNode htmlNode = (TagNode)obj; //0
        		// 시작idx와 배수가맞을 경우
        		if(idx % Integer.valueOf(itmInf.getDataMod())==Integer.valueOf(itmInf.getDataIdx())) {
        			String value = htmlNode.getText().toString();
        			if(!"&nbsp;".equals(value)){
        				dbaBiz.inputTmpTbl(itmInf,value);
        			}
        		}
        		idx++;
        	}
		} catch (XPatherException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * xpath expression을 통해 가져온  Node에서 특정 어트리뷰트의 값을 가져온다.
	 * @param srcUrl
	 */
	private static void getXtrctTyp5(TagNode node, ItmInfDvo itmInf) {
		DbaBiz dbaBiz = new DbaBiz();
		try {
			Object[] nodeArray = node.evaluateXPath(itmInf.getXtrctXpath());
			if(nodeArray!=null) {
		    	for (Object obj: nodeArray) {
		    		TagNode htmlNode = (TagNode)obj;
		    		String value = htmlNode.getAttributeByName(itmInf.getXtrctNm());
		    		dbaBiz.inputTmpTbl(itmInf,value);
		    	}
			} else {
				dbaBiz.inputTmpTbl(itmInf,"값없음");
			}
		} catch (XPatherException e) {
			e.printStackTrace();
		}
	}
	
}
