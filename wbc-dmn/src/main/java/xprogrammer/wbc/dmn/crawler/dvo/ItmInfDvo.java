package xprogrammer.wbc.dmn.crawler.dvo;

import java.io.Serializable;

import xprogrammer.wbc.dmn.cmn.dvo.BaseDvo;

public class ItmInfDvo extends BaseDvo implements Serializable {

	private static final long serialVersionUID = -8320860631396525009L;

	private String urlInfSeq	;	// URL_INF 일련번호
	private String xtrctTyp		;	//
	private String xtrctXpath	;	// 추출할 XPATH EXPRESSION
	private String xtrctNm		;	// XTRCT_TYP_2: 포함할 클래스이름, XTRCT_TYP_3: 제거할 클래스이름, XTRCT_TYP_5: 추출할 어트리뷰트이름
	private String dataIdx		;
	private String dataMod		;
	private String tmpTbl		;	// 입력할 임시테이블 번호
	private String colId		;	// 입력할 테이블컬럼ID
	private String colNm		;	// 입력할 테이블컬럼이름
	
	public String getUrlInfSeq() {
		return urlInfSeq;
	}
	public void setUrlInfSeq(String urlInfSeq) {
		this.urlInfSeq = urlInfSeq;
	}
	public String getXtrctTyp() {
		return xtrctTyp;
	}
	public void setXtrctTyp(String xtrctTyp) {
		this.xtrctTyp = xtrctTyp;
	}
	public String getXtrctXpath() {
		return xtrctXpath;
	}
	public void setXtrctXpath(String xtrctXpath) {
		this.xtrctXpath = xtrctXpath;
	}
	public String getXtrctNm() {
		return xtrctNm;
	}
	public void setXtrctNm(String xtrctNm) {
		this.xtrctNm = xtrctNm;
	}
	public String getDataIdx() {
		return dataIdx;
	}
	public void setDataIdx(String dataIdx) {
		this.dataIdx = dataIdx;
	}
	public String getDataMod() {
		return dataMod;
	}
	public void setDataMod(String dataMod) {
		this.dataMod = dataMod;
	}
	public String getTmpTbl() {
		return tmpTbl;
	}
	public void setTmpTbl(String tmpTbl) {
		this.tmpTbl = tmpTbl;
	}
	public String getColId() {
		return colId;
	}
	public void setColId(String colId) {
		this.colId = colId;
	}
	public String getColNm() {
		return colNm;
	}
	public void setColNm(String colNm) {
		this.colNm = colNm;
	}
	
	
}
