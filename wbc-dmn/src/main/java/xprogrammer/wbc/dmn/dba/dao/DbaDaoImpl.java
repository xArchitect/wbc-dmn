package xprogrammer.wbc.dmn.dba.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import xprogrammer.wbc.dmn.cmn.exception.DaoException;
import xprogrammer.wbc.dmn.crawler.dvo.ItmInfDvo;
import xprogrammer.wbc.dmn.crawler.dvo.UrlInfDvo;
import xprogrammer.wbc.dmn.dba.dvo.DbaDvo;
import xprogrammer.wbc.dmn.dba.dvo.TmpTblDvo;

public class DbaDaoImpl implements DbaDaoIF {
	private SqlSessionFactory sqlSessionFactory = null;
	 
    public DbaDaoImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }
    
	@Override
	public List<UrlInfDvo> selectUrlInfList(UrlInfDvo dvo) throws DaoException {
		List<UrlInfDvo> result = null;
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	result = session.selectList("DbaMapper.selectUrlInfList",dvo);
        } finally {
            session.close();
        }
        return result;
	}

	@Override
	public List<ItmInfDvo> selectItmInfList(ItmInfDvo dvo) throws DaoException {
		List<ItmInfDvo> result = null;
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	result = session.selectList("DbaMapper.selectItmInfList",dvo);
        } finally {
            session.close();
        }
        return result;
	}

	@Override
	public int selectTmpTbl01Seq() throws DaoException {
		int result = 0;
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	result = session.selectOne("DbaMapper.selectTmpTbl01Seq");
        } finally {
            session.close();
        }
		return result;
	}

	@Override
	public int selectTmpTbl02Seq() throws DaoException {
		int result = 0;
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	result = session.selectOne("DbaMapper.selectTmpTbl02Seq");
        } finally {
            session.close();
        }
		return result;
	}

	@Override
	public int selectTmpTbl03Seq() throws DaoException {
		int result = 0;
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	result = session.selectOne("DbaMapper.selectTmpTbl03Seq");
        } finally {
            session.close();
        }
		return result;
	}

	@Override
	public int selectTmpTbl04Seq() throws DaoException {
		int result = 0;
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	result = session.selectOne("DbaMapper.selectTmpTbl04Seq");
        } finally {
            session.close();
        }
		return result;
	}

	@Override
	public int selectTmpTbl05Seq() throws DaoException {
		int result = 0;
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	result = session.selectOne("DbaMapper.selectTmpTbl05Seq");
        } finally {
            session.close();
        }
		return result;
	}
	
	@Override
	public int selectTmpTbl06Seq() throws DaoException {
		int result = 0;
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	result = session.selectOne("DbaMapper.selectTmpTbl06Seq");
        } finally {
            session.close();
        }
		return result;
	}

	@Override
	public int selectTmpTbl07Seq() throws DaoException {
		int result = 0;
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	result = session.selectOne("DbaMapper.selectTmpTbl07Seq");
        } finally {
            session.close();
        }
		return result;
	}

	@Override
	public int selectTmpTbl08Seq() throws DaoException {
		int result = 0;
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	result = session.selectOne("DbaMapper.selectTmpTbl08Seq");
        } finally {
            session.close();
        }
		return result;
	}

	@Override
	public int selectTmpTbl09Seq() throws DaoException {
		int result = 0;
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	result = session.selectOne("DbaMapper.selectTmpTbl09Seq");
        } finally {
            session.close();
        }
		return result;
	}

	@Override
	public int selectTmpTbl10Seq() throws DaoException {
		int result = 0;
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	result = session.selectOne("DbaMapper.selectTmpTbl10Seq");
        } finally {
            session.close();
        }
		return result;
	}

	@Override
	public int selectTmpTbl11Seq() throws DaoException {
		int result = 0;
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	result = session.selectOne("DbaMapper.selectTmpTbl11Seq");
        } finally {
            session.close();
        }
		return result;
	}

	@Override
	public int selectTmpTbl12Seq() throws DaoException {
		int result = 0;
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	result = session.selectOne("DbaMapper.selectTmpTbl12Seq");
        } finally {
            session.close();
        }
		return result;
	}

	@Override
	public int selectTmpTbl13Seq() throws DaoException {
		int result = 0;
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	result = session.selectOne("DbaMapper.selectTmpTbl13Seq");
        } finally {
            session.close();
        }
		return result;
	}

	@Override
	public int selectTmpTbl14Seq() throws DaoException {
		int result = 0;
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	result = session.selectOne("DbaMapper.selectTmpTbl14Seq");
        } finally {
            session.close();
        }
		return result;
	}

	@Override
	public int selectTmpTbl15Seq() throws DaoException {
		int result = 0;
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	result = session.selectOne("DbaMapper.selectTmpTbl15Seq");
        } finally {
            session.close();
        }
		return result;
	}
	
	@Override
	public int selectTmpTbl16Seq() throws DaoException {
		int result = 0;
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	result = session.selectOne("DbaMapper.selectTmpTbl16Seq");
        } finally {
            session.close();
        }
		return result;
	}

	@Override
	public int selectTmpTbl17Seq() throws DaoException {
		int result = 0;
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	result = session.selectOne("DbaMapper.selectTmpTbl17Seq");
        } finally {
            session.close();
        }
		return result;
	}

	@Override
	public int selectTmpTbl18Seq() throws DaoException {
		int result = 0;
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	result = session.selectOne("DbaMapper.selectTmpTbl18Seq");
        } finally {
            session.close();
        }
		return result;
	}

	@Override
	public int selectTmpTbl19Seq() throws DaoException {
		int result = 0;
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	result = session.selectOne("DbaMapper.selectTmpTbl19Seq");
        } finally {
            session.close();
        }
		return result;
	}

	@Override
	public int selectTmpTbl20Seq() throws DaoException {
		int result = 0;
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	result = session.selectOne("DbaMapper.selectTmpTbl20Seq");
        } finally {
            session.close();
        }
		return result;
	}
	
	@Override
	public void insertTmpTbl01(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.insert("DbaMapper.insertTmpTbl01",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void insertTmpTbl02(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.insert("DbaMapper.insertTmpTbl02",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void insertTmpTbl03(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.insert("DbaMapper.insertTmpTbl03",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void insertTmpTbl04(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.insert("DbaMapper.insertTmpTbl04",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void insertTmpTbl05(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.insert("DbaMapper.insertTmpTbl05",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}
	
	@Override
	public void insertTmpTbl06(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.insert("DbaMapper.insertTmpTbl06",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void insertTmpTbl07(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.insert("DbaMapper.insertTmpTbl07",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void insertTmpTbl08(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.insert("DbaMapper.insertTmpTbl08",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void insertTmpTbl09(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.insert("DbaMapper.insertTmpTbl09",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void insertTmpTbl10(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.insert("DbaMapper.insertTmpTbl10",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void insertTmpTbl11(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.insert("DbaMapper.insertTmpTbl11",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void insertTmpTbl12(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.insert("DbaMapper.insertTmpTbl12",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void insertTmpTbl13(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.insert("DbaMapper.insertTmpTbl13",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void insertTmpTbl14(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.insert("DbaMapper.insertTmpTbl14",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void insertTmpTbl15(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.insert("DbaMapper.insertTmpTbl15",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}
	
	@Override
	public void insertTmpTbl16(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.insert("DbaMapper.insertTmpTbl16",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void insertTmpTbl17(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.insert("DbaMapper.insertTmpTbl17",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void insertTmpTbl18(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.insert("DbaMapper.insertTmpTbl18",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void insertTmpTbl19(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.insert("DbaMapper.insertTmpTbl19",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void insertTmpTbl20(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.insert("DbaMapper.insertTmpTbl20",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}
	
	@Override
	public void deleteTmpTbl01(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.delete("DbaMapper.deleteTmpTbl01",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void deleteTmpTbl02(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.delete("DbaMapper.deleteTmpTbl02",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void deleteTmpTbl03(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.delete("DbaMapper.deleteTmpTbl03",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void deleteTmpTbl04(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.delete("DbaMapper.deleteTmpTbl04",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void deleteTmpTbl05(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.delete("DbaMapper.deleteTmpTbl05",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}
	
	@Override
	public void deleteTmpTbl06(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.delete("DbaMapper.deleteTmpTbl06",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void deleteTmpTbl07(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.delete("DbaMapper.deleteTmpTbl07",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void deleteTmpTbl08(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.delete("DbaMapper.deleteTmpTbl08",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void deleteTmpTbl09(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.delete("DbaMapper.deleteTmpTbl09",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void deleteTmpTbl10(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.delete("DbaMapper.deleteTmpTbl10",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void deleteTmpTbl11(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.delete("DbaMapper.deleteTmpTbl11",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void deleteTmpTbl12(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.delete("DbaMapper.deleteTmpTbl12",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void deleteTmpTbl13(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.delete("DbaMapper.deleteTmpTbl13",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void deleteTmpTbl14(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.delete("DbaMapper.deleteTmpTbl14",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void deleteTmpTbl15(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.delete("DbaMapper.deleteTmpTbl15",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}
	
	@Override
	public void deleteTmpTbl16(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.delete("DbaMapper.deleteTmpTbl16",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void deleteTmpTbl17(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.delete("DbaMapper.deleteTmpTbl17",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void deleteTmpTbl18(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.delete("DbaMapper.deleteTmpTbl18",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void deleteTmpTbl19(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.delete("DbaMapper.deleteTmpTbl19",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

	@Override
	public void deleteTmpTbl20(TmpTblDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.delete("DbaMapper.deleteTmpTbl20",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}
	
	@Override
	public void executeStrSql(DbaDvo dvo) throws DaoException {
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	session.delete("DbaMapper.executeStrSql",dvo);
        	session.commit();
        } finally {
            session.close();
        }
	}

}
