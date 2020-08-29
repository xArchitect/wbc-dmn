package xprogrammer.wbc.dmn.dba.biz;

import java.util.List;

import xprogrammer.wbc.dmn.cmn.constant.Letter;
import xprogrammer.wbc.dmn.cmn.exception.SvcException;
import xprogrammer.wbc.dmn.crawler.dvo.ItmInfDvo;
import xprogrammer.wbc.dmn.crawler.dvo.UrlInfDvo;
import xprogrammer.wbc.dmn.crawler.svc.CrawlerSvcIF;
import xprogrammer.wbc.dmn.crawler.svc.CrawlerSvcImpl;
import xprogrammer.wbc.dmn.dba.dvo.DbaDvo;
import xprogrammer.wbc.dmn.dba.dvo.TmpTblDvo;
import xprogrammer.wbc.dmn.dba.svc.DbaSvcIF;
import xprogrammer.wbc.dmn.dba.svc.DbaSvcImpl;
import xprogrammer.wbc.dmn.util.SqlUtil;

public class DbaBiz {

	/**
	 * 테이블삭제
	 * @param urlInfDvo
	 * @throws SvcException
	 */
	public void dropTbl(UrlInfDvo urlInfDvo) throws SvcException {
		CrawlerSvcIF crawlerService = new CrawlerSvcImpl();
		DbaSvcIF service = new DbaSvcImpl();
		// 추출해야할 데이터 목록을 가져온다.
        ItmInfDvo itmInfParam = new ItmInfDvo();
        itmInfParam.setUrlInfSeq(urlInfDvo.getSeq());
        List<ItmInfDvo> itmInfList = crawlerService.selectItmInfList(itmInfParam);
        
		String cols = "";
		
		String sql = "";
		sql += "DROP TABLE IF EXISTS" + Letter.BLANK + urlInfDvo.getTblId() + Letter.SEMICOLON;

		DbaDvo dvo = new DbaDvo();
		dvo.setSql(sql);
		service.executeStrSql(dvo);
	}
	
	/**
	 * 테이블생성
	 * @throws SvcException 
	 */
	public void createTbl(UrlInfDvo urlInfDvo) throws SvcException {
		CrawlerSvcIF crawlerService = new CrawlerSvcImpl();
		DbaSvcIF service = new DbaSvcImpl();
		// 추출해야할 데이터 목록을 가져온다.
        ItmInfDvo itmInfParam = new ItmInfDvo();
        itmInfParam.setUrlInfSeq(urlInfDvo.getSeq());
        List<ItmInfDvo> itmInfList = crawlerService.selectItmInfList(itmInfParam);
        
		String sql = "";
		sql += "CREATE TABLE" + Letter.BLANK + urlInfDvo.getTblId() + Letter.BLANK + Letter.LEFT_PARENTHESIS;
		sql += "SEQ			int(10) NOT NULL AUTO_INCREMENT,";
		for(int j=0;j<itmInfList.size();j++) {
        	ItmInfDvo itmInf = itmInfList.get(j);
        	sql += itmInf.getColId() + Letter.BLANK + "VARCHAR(255) NOT NULL,";
		}
		sql += "PRIMARY KEY(SEQ)";
		sql += Letter.RIGHT_PARENTHESIS + Letter.SEMICOLON;

		DbaDvo dvo = new DbaDvo();
		dvo.setSql(sql);
		service.executeStrSql(dvo);
	}
	
	/**
	 * 결과입력
	 * @throws SvcException 
	 */
	public void insertResult(UrlInfDvo urlInfDvo) throws SvcException {
		CrawlerSvcIF crawlerService = new CrawlerSvcImpl();
		DbaSvcIF service = new DbaSvcImpl();
		// 추출해야할 데이터 목록을 가져온다.
        ItmInfDvo itmInfParam = new ItmInfDvo();
        itmInfParam.setUrlInfSeq(urlInfDvo.getSeq());
        List<ItmInfDvo> itmInfList = crawlerService.selectItmInfList(itmInfParam);
        
		String cols = "";
		for(int j=0;j<itmInfList.size();j++) {
        	ItmInfDvo itmInf = itmInfList.get(j);
        	if(j>0 && j<itmInfList.size()) {
        		cols += ",";
        	}
        	cols += itmInf.getColId();
		}
		String sql = "";
		sql += "INSERT INTO";
		sql += Letter.BLANK + urlInfDvo.getTblId() + Letter.BLANK;
		sql += Letter.LEFT_PARENTHESIS + cols + Letter.RIGHT_PARENTHESIS;
		sql += SqlUtil.getSlctSql(urlInfDvo.getSlctSqlTyp());

		DbaDvo dvo = new DbaDvo();
		dvo.setSql(sql);
		service.executeStrSql(dvo);
	}
	
	/**
	 * 
	 * @param itmInf
	 * @param value
	 */
	public void inputTmpTbl(ItmInfDvo itmInf, String value) {
		DbaSvcIF service = new DbaSvcImpl();
		try {
			TmpTblDvo tmpTblDvo = new TmpTblDvo();
			tmpTblDvo.setUrlInfSeq(itmInf.getUrlInfSeq());
			tmpTblDvo.setColNm(itmInf.getColNm());
			tmpTblDvo.setColVal(value);
			switch (itmInf.getTmpTbl()) {
				case "01":service.insertTmpTbl01(tmpTblDvo);break;
				case "02":service.insertTmpTbl02(tmpTblDvo);break;
				case "03":service.insertTmpTbl03(tmpTblDvo);break;
				case "04":service.insertTmpTbl04(tmpTblDvo);break;
				case "05":service.insertTmpTbl05(tmpTblDvo);break;
				case "06":service.insertTmpTbl06(tmpTblDvo);break;
				case "07":service.insertTmpTbl07(tmpTblDvo);break;
				case "08":service.insertTmpTbl08(tmpTblDvo);break;
				case "09":service.insertTmpTbl09(tmpTblDvo);break;
				case "10":service.insertTmpTbl10(tmpTblDvo);break;
				case "11":service.insertTmpTbl11(tmpTblDvo);break;
				case "12":service.insertTmpTbl12(tmpTblDvo);break;
				case "13":service.insertTmpTbl13(tmpTblDvo);break;
				case "14":service.insertTmpTbl14(tmpTblDvo);break;
				case "15":service.insertTmpTbl15(tmpTblDvo);break;
				case "16":service.insertTmpTbl16(tmpTblDvo);break;
				case "17":service.insertTmpTbl17(tmpTblDvo);break;
				case "18":service.insertTmpTbl18(tmpTblDvo);break;
				case "19":service.insertTmpTbl19(tmpTblDvo);break;
				case "20":service.insertTmpTbl20(tmpTblDvo);break;
				default:break;
			}
		} catch (SvcException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 임시테이블을 비운다.
	 */
	public void deleteTmpTbl() {
		DbaSvcIF service = new DbaSvcImpl();
		try {
			TmpTblDvo tmpTblDvo = new TmpTblDvo();
			service.deleteTmpTbl01(tmpTblDvo);
			service.deleteTmpTbl02(tmpTblDvo);
			service.deleteTmpTbl03(tmpTblDvo);
			service.deleteTmpTbl04(tmpTblDvo);
			service.deleteTmpTbl05(tmpTblDvo);
			service.deleteTmpTbl06(tmpTblDvo);
			service.deleteTmpTbl07(tmpTblDvo);
			service.deleteTmpTbl08(tmpTblDvo);
			service.deleteTmpTbl09(tmpTblDvo);
			service.deleteTmpTbl10(tmpTblDvo);
			service.deleteTmpTbl11(tmpTblDvo);
			service.deleteTmpTbl12(tmpTblDvo);
			service.deleteTmpTbl13(tmpTblDvo);
			service.deleteTmpTbl14(tmpTblDvo);
			service.deleteTmpTbl15(tmpTblDvo);
			service.deleteTmpTbl16(tmpTblDvo);
			service.deleteTmpTbl17(tmpTblDvo);
			service.deleteTmpTbl18(tmpTblDvo);
			service.deleteTmpTbl19(tmpTblDvo);
			service.deleteTmpTbl20(tmpTblDvo);
		} catch (SvcException e) {
			e.printStackTrace();
		}
	}
	
}
