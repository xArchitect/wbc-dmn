package xprogrammer.wbc.dmn.cmn.dvo;

import java.io.Serializable;

public class BaseDvo implements Serializable {

	private static final long serialVersionUID = -439184075183988710L;
	
	private String seq			;
	
	private String lstSeq			;	// 정렬순서
    private String inptUsrId		;	// 입력한 회원
    private String inptDtm			;	// 입력일
    private String mdfyUsrId		;	// 수정한 회원
    private String mdfyDtm			;	// 수정일
    
	public String getLstSeq() {
		return lstSeq;
	}

	public void setLstSeq(String lstSeq) {
		this.lstSeq = lstSeq;
	}

	public String getInptUsrId() {
		return inptUsrId;
	}

	public void setInptUsrId(String inptUsrId) {
		this.inptUsrId = inptUsrId;
	}

	public String getInptDtm() {
		return inptDtm;
	}

	public void setInptDtm(String inptDtm) {
		this.inptDtm = inptDtm;
	}

	public String getMdfyUsrId() {
		return mdfyUsrId;
	}

	public void setMdfyUsrId(String mdfyUsrId) {
		this.mdfyUsrId = mdfyUsrId;
	}

	public String getMdfyDtm() {
		return mdfyDtm;
	}

	public void setMdfyDtm(String mdfyDtm) {
		this.mdfyDtm = mdfyDtm;
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}
	
	
}
