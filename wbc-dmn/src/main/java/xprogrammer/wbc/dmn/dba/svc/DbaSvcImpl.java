package xprogrammer.wbc.dmn.dba.svc;

import org.apache.log4j.Logger;

import xprogrammer.wbc.dmn.cmn.exception.SvcException;
import xprogrammer.wbc.dmn.cmn.mybatis.MyBatisFactory;
import xprogrammer.wbc.dmn.dba.dao.DbaDaoIF;
import xprogrammer.wbc.dmn.dba.dao.DbaDaoImpl;
import xprogrammer.wbc.dmn.dba.dvo.DbaDvo;
import xprogrammer.wbc.dmn.dba.dvo.TmpTblDvo;

public class DbaSvcImpl implements DbaSvcIF {
	private Logger logger = Logger.getLogger(DbaSvcImpl.class);
	
	private DbaDaoIF dao;

	public DbaSvcImpl() {
		this.dao = new DbaDaoImpl(MyBatisFactory.getSqlSessionFactory());
	}
	
	@Override
	public void insertTmpTbl01(TmpTblDvo dvo) throws SvcException {
		try {
			int seq = dao.selectTmpTbl01Seq();
			int lstSeq = -seq;
			dvo.setSeq(String.valueOf(seq));
			dvo.setLstSeq(String.valueOf(lstSeq));
			dao.insertTmpTbl01(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}

	@Override
	public void insertTmpTbl02(TmpTblDvo dvo) throws SvcException {
		try {
			int seq = dao.selectTmpTbl02Seq();
			int lstSeq = -seq;
			dvo.setSeq(String.valueOf(seq));
			dvo.setLstSeq(String.valueOf(lstSeq));
			dao.insertTmpTbl02(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}

	@Override
	public void insertTmpTbl03(TmpTblDvo dvo) throws SvcException {
		try {
			int seq = dao.selectTmpTbl03Seq();
			int lstSeq = -seq;
			dvo.setSeq(String.valueOf(seq));
			dvo.setLstSeq(String.valueOf(lstSeq));
			dao.insertTmpTbl03(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}

	@Override
	public void insertTmpTbl04(TmpTblDvo dvo) throws SvcException {
		try {
			int seq = dao.selectTmpTbl04Seq();
			int lstSeq = -seq;
			dvo.setSeq(String.valueOf(seq));
			dvo.setLstSeq(String.valueOf(lstSeq));
			dao.insertTmpTbl04(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}

	@Override
	public void insertTmpTbl05(TmpTblDvo dvo) throws SvcException {
		try {
			int seq = dao.selectTmpTbl05Seq();
			int lstSeq = -seq;
			dvo.setSeq(String.valueOf(seq));
			dvo.setLstSeq(String.valueOf(lstSeq));
			dao.insertTmpTbl05(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}

	@Override
	public void insertTmpTbl06(TmpTblDvo dvo) throws SvcException {
		try {
			int seq = dao.selectTmpTbl06Seq();
			int lstSeq = -seq;
			dvo.setSeq(String.valueOf(seq));
			dvo.setLstSeq(String.valueOf(lstSeq));
			dao.insertTmpTbl06(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}

	@Override
	public void insertTmpTbl07(TmpTblDvo dvo) throws SvcException {
		try {
			int seq = dao.selectTmpTbl07Seq();
			int lstSeq = -seq;
			dvo.setSeq(String.valueOf(seq));
			dvo.setLstSeq(String.valueOf(lstSeq));
			dao.insertTmpTbl07(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}

	@Override
	public void insertTmpTbl08(TmpTblDvo dvo) throws SvcException {
		try {
			int seq = dao.selectTmpTbl08Seq();
			int lstSeq = -seq;
			dvo.setSeq(String.valueOf(seq));
			dvo.setLstSeq(String.valueOf(lstSeq));
			dao.insertTmpTbl08(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}

	@Override
	public void insertTmpTbl09(TmpTblDvo dvo) throws SvcException {
		try {
			int seq = dao.selectTmpTbl09Seq();
			int lstSeq = -seq;
			dvo.setSeq(String.valueOf(seq));
			dvo.setLstSeq(String.valueOf(lstSeq));
			dao.insertTmpTbl09(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}

	@Override
	public void insertTmpTbl10(TmpTblDvo dvo) throws SvcException {
		try {
			int seq = dao.selectTmpTbl10Seq();
			int lstSeq = -seq;
			dvo.setSeq(String.valueOf(seq));
			dvo.setLstSeq(String.valueOf(lstSeq));
			dao.insertTmpTbl10(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}
	
	@Override
	public void insertTmpTbl11(TmpTblDvo dvo) throws SvcException {
		try {
			int seq = dao.selectTmpTbl11Seq();
			int lstSeq = -seq;
			dvo.setSeq(String.valueOf(seq));
			dvo.setLstSeq(String.valueOf(lstSeq));
			dao.insertTmpTbl11(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}

	@Override
	public void insertTmpTbl12(TmpTblDvo dvo) throws SvcException {
		try {
			int seq = dao.selectTmpTbl12Seq();
			int lstSeq = -seq;
			dvo.setSeq(String.valueOf(seq));
			dvo.setLstSeq(String.valueOf(lstSeq));
			dao.insertTmpTbl12(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}

	@Override
	public void insertTmpTbl13(TmpTblDvo dvo) throws SvcException {
		try {
			int seq = dao.selectTmpTbl13Seq();
			int lstSeq = -seq;
			dvo.setSeq(String.valueOf(seq));
			dvo.setLstSeq(String.valueOf(lstSeq));
			dao.insertTmpTbl13(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}

	@Override
	public void insertTmpTbl14(TmpTblDvo dvo) throws SvcException {
		try {
			int seq = dao.selectTmpTbl14Seq();
			int lstSeq = -seq;
			dvo.setSeq(String.valueOf(seq));
			dvo.setLstSeq(String.valueOf(lstSeq));
			dao.insertTmpTbl14(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}

	@Override
	public void insertTmpTbl15(TmpTblDvo dvo) throws SvcException {
		try {
			int seq = dao.selectTmpTbl15Seq();
			int lstSeq = -seq;
			dvo.setSeq(String.valueOf(seq));
			dvo.setLstSeq(String.valueOf(lstSeq));
			dao.insertTmpTbl15(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}

	@Override
	public void insertTmpTbl16(TmpTblDvo dvo) throws SvcException {
		try {
			int seq = dao.selectTmpTbl16Seq();
			int lstSeq = -seq;
			dvo.setSeq(String.valueOf(seq));
			dvo.setLstSeq(String.valueOf(lstSeq));
			dao.insertTmpTbl16(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}

	@Override
	public void insertTmpTbl17(TmpTblDvo dvo) throws SvcException {
		try {
			int seq = dao.selectTmpTbl17Seq();
			int lstSeq = -seq;
			dvo.setSeq(String.valueOf(seq));
			dvo.setLstSeq(String.valueOf(lstSeq));
			dao.insertTmpTbl17(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}

	@Override
	public void insertTmpTbl18(TmpTblDvo dvo) throws SvcException {
		try {
			int seq = dao.selectTmpTbl18Seq();
			int lstSeq = -seq;
			dvo.setSeq(String.valueOf(seq));
			dvo.setLstSeq(String.valueOf(lstSeq));
			dao.insertTmpTbl18(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}

	@Override
	public void insertTmpTbl19(TmpTblDvo dvo) throws SvcException {
		try {
			int seq = dao.selectTmpTbl19Seq();
			int lstSeq = -seq;
			dvo.setSeq(String.valueOf(seq));
			dvo.setLstSeq(String.valueOf(lstSeq));
			dao.insertTmpTbl19(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}

	@Override
	public void insertTmpTbl20(TmpTblDvo dvo) throws SvcException {
		try {
			int seq = dao.selectTmpTbl20Seq();
			int lstSeq = -seq;
			dvo.setSeq(String.valueOf(seq));
			dvo.setLstSeq(String.valueOf(lstSeq));
			dao.insertTmpTbl20(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}
	
	@Override
	public void deleteTmpTbl01(TmpTblDvo dvo) throws SvcException {
		try {
			dao.deleteTmpTbl01(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}
	
	@Override
	public void deleteTmpTbl02(TmpTblDvo dvo) throws SvcException {
		try {
			dao.deleteTmpTbl02(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}
	
	@Override
	public void deleteTmpTbl03(TmpTblDvo dvo) throws SvcException {
		try {
			dao.deleteTmpTbl03(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}
	
	@Override
	public void deleteTmpTbl04(TmpTblDvo dvo) throws SvcException {
		try {
			dao.deleteTmpTbl04(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}
	
	@Override
	public void deleteTmpTbl05(TmpTblDvo dvo) throws SvcException {
		try {
			dao.deleteTmpTbl05(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}
	
	@Override
	public void deleteTmpTbl06(TmpTblDvo dvo) throws SvcException {
		try {
			dao.deleteTmpTbl06(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}
	
	@Override
	public void deleteTmpTbl07(TmpTblDvo dvo) throws SvcException {
		try {
			dao.deleteTmpTbl07(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}
	
	@Override
	public void deleteTmpTbl08(TmpTblDvo dvo) throws SvcException {
		try {
			dao.deleteTmpTbl08(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}
	
	@Override
	public void deleteTmpTbl09(TmpTblDvo dvo) throws SvcException {
		try {
			dao.deleteTmpTbl09(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}
	
	@Override
	public void deleteTmpTbl10(TmpTblDvo dvo) throws SvcException {
		try {
			dao.deleteTmpTbl10(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}
	
	@Override
	public void deleteTmpTbl11(TmpTblDvo dvo) throws SvcException {
		try {
			dao.deleteTmpTbl11(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}
	
	@Override
	public void deleteTmpTbl12(TmpTblDvo dvo) throws SvcException {
		try {
			dao.deleteTmpTbl12(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}
	
	@Override
	public void deleteTmpTbl13(TmpTblDvo dvo) throws SvcException {
		try {
			dao.deleteTmpTbl13(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}
	
	@Override
	public void deleteTmpTbl14(TmpTblDvo dvo) throws SvcException {
		try {
			dao.deleteTmpTbl14(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}
	
	@Override
	public void deleteTmpTbl15(TmpTblDvo dvo) throws SvcException {
		try {
			dao.deleteTmpTbl15(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}
	
	@Override
	public void deleteTmpTbl16(TmpTblDvo dvo) throws SvcException {
		try {
			dao.deleteTmpTbl16(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}
	
	@Override
	public void deleteTmpTbl17(TmpTblDvo dvo) throws SvcException {
		try {
			dao.deleteTmpTbl17(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}
	
	@Override
	public void deleteTmpTbl18(TmpTblDvo dvo) throws SvcException {
		try {
			dao.deleteTmpTbl18(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}
	
	@Override
	public void deleteTmpTbl19(TmpTblDvo dvo) throws SvcException {
		try {
			dao.deleteTmpTbl19(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}
	
	@Override
	public void deleteTmpTbl20(TmpTblDvo dvo) throws SvcException {
		try {
			dao.deleteTmpTbl20(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}
	
	@Override
	public void executeStrSql(DbaDvo dvo) throws SvcException {
		try {
			dao.executeStrSql(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}

}
