package xprogrammer.wbc.dmn.dba.dvo;

import java.io.Serializable;

import xprogrammer.wbc.dmn.cmn.dvo.BaseDvo;

public class TmpTblDvo extends BaseDvo implements Serializable {

	private static final long serialVersionUID = 2014331228961199446L;
	
	private String urlInfSeq	;
	private String colNm		;
	private String colVal		;
	
	public String getUrlInfSeq() {
		return urlInfSeq;
	}
	public void setUrlInfSeq(String urlInfSeq) {
		this.urlInfSeq = urlInfSeq;
	}
	public String getColNm() {
		return colNm;
	}
	public void setColNm(String colNm) {
		this.colNm = colNm;
	}
	public String getColVal() {
		return colVal;
	}
	public void setColVal(String colVal) {
		this.colVal = colVal;
	}
	
	
}
