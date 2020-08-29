package xprogrammer.wbc.dmn.cmn.exception;

public class DaoException extends Exception {

	private static final long serialVersionUID = 507234472723631423L;

	public DaoException(String errorMessage) {
        super(errorMessage);
    }

    public DaoException(Throwable e) {
    	super(e);
    }

}
