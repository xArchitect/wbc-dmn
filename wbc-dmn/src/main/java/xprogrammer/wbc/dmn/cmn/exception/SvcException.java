package xprogrammer.wbc.dmn.cmn.exception;

public class SvcException extends Exception {

	private static final long serialVersionUID = 3631879754034843463L;

    public SvcException(String errorMessage) {
    	
        super(errorMessage);
    }
    
    public SvcException(Throwable e) {
    	
    	super(e);
    }
}
