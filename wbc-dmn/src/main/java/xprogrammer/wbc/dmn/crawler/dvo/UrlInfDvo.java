package xprogrammer.wbc.dmn.crawler.dvo;

import java.io.Serializable;

import xprogrammer.wbc.dmn.cmn.dvo.BaseDvo;

public class UrlInfDvo extends BaseDvo implements Serializable {

	private static final long serialVersionUID = 3214848933130883049L;

	private String site			;
	private String url			;
	private String paramPageNm	;
	private String startPage	;
	private String endPage		;
	private String tblId		;
	private String tblNm		;
	private String slctSqlTyp	;
	private String useYn		;
	
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getParamPageNm() {
		return paramPageNm;
	}
	public void setParamPageNm(String paramPageNm) {
		this.paramPageNm = paramPageNm;
	}
	public String getStartPage() {
		return startPage;
	}
	public void setStartPage(String startPage) {
		this.startPage = startPage;
	}
	public String getEndPage() {
		return endPage;
	}
	public void setEndPage(String endPage) {
		this.endPage = endPage;
	}
	public String getTblId() {
		return tblId;
	}
	public void setTblId(String tblId) {
		this.tblId = tblId;
	}
	public String getTblNm() {
		return tblNm;
	}
	public void setTblNm(String tblNm) {
		this.tblNm = tblNm;
	}
	public String getSlctSqlTyp() {
		return slctSqlTyp;
	}
	public void setSlctSqlTyp(String slctSqlTyp) {
		this.slctSqlTyp = slctSqlTyp;
	}
	public String getUseYn() {
		return useYn;
	}
	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}
	
}
