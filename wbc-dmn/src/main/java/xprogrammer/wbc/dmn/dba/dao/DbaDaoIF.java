package xprogrammer.wbc.dmn.dba.dao;

import java.util.List;

import xprogrammer.wbc.dmn.cmn.exception.DaoException;
import xprogrammer.wbc.dmn.crawler.dvo.ItmInfDvo;
import xprogrammer.wbc.dmn.crawler.dvo.UrlInfDvo;
import xprogrammer.wbc.dmn.dba.dvo.DbaDvo;
import xprogrammer.wbc.dmn.dba.dvo.TmpTblDvo;

public interface DbaDaoIF {
	public List<UrlInfDvo> selectUrlInfList(UrlInfDvo dvo) throws DaoException;

	public List<ItmInfDvo> selectItmInfList(ItmInfDvo dvo) throws DaoException;
	
	public int selectTmpTbl01Seq()throws DaoException;
	public int selectTmpTbl02Seq()throws DaoException;
	public int selectTmpTbl03Seq()throws DaoException;
	public int selectTmpTbl04Seq()throws DaoException;
	public int selectTmpTbl05Seq()throws DaoException;
	public int selectTmpTbl06Seq()throws DaoException;
	public int selectTmpTbl07Seq()throws DaoException;
	public int selectTmpTbl08Seq()throws DaoException;
	public int selectTmpTbl09Seq()throws DaoException;
	public int selectTmpTbl10Seq()throws DaoException;
	public int selectTmpTbl11Seq()throws DaoException;
	public int selectTmpTbl12Seq()throws DaoException;
	public int selectTmpTbl13Seq()throws DaoException;
	public int selectTmpTbl14Seq()throws DaoException;
	public int selectTmpTbl15Seq()throws DaoException;
	public int selectTmpTbl16Seq()throws DaoException;
	public int selectTmpTbl17Seq()throws DaoException;
	public int selectTmpTbl18Seq()throws DaoException;
	public int selectTmpTbl19Seq()throws DaoException;
	public int selectTmpTbl20Seq()throws DaoException;
	
	public void insertTmpTbl01(TmpTblDvo dvo) throws DaoException;
	public void insertTmpTbl02(TmpTblDvo dvo) throws DaoException;
	public void insertTmpTbl03(TmpTblDvo dvo) throws DaoException;
	public void insertTmpTbl04(TmpTblDvo dvo) throws DaoException;
	public void insertTmpTbl05(TmpTblDvo dvo) throws DaoException;
	public void insertTmpTbl06(TmpTblDvo dvo) throws DaoException;
	public void insertTmpTbl07(TmpTblDvo dvo) throws DaoException;
	public void insertTmpTbl08(TmpTblDvo dvo) throws DaoException;
	public void insertTmpTbl09(TmpTblDvo dvo) throws DaoException;
	public void insertTmpTbl10(TmpTblDvo dvo) throws DaoException;
	public void insertTmpTbl11(TmpTblDvo dvo) throws DaoException;
	public void insertTmpTbl12(TmpTblDvo dvo) throws DaoException;
	public void insertTmpTbl13(TmpTblDvo dvo) throws DaoException;
	public void insertTmpTbl14(TmpTblDvo dvo) throws DaoException;
	public void insertTmpTbl15(TmpTblDvo dvo) throws DaoException;
	public void insertTmpTbl16(TmpTblDvo dvo) throws DaoException;
	public void insertTmpTbl17(TmpTblDvo dvo) throws DaoException;
	public void insertTmpTbl18(TmpTblDvo dvo) throws DaoException;
	public void insertTmpTbl19(TmpTblDvo dvo) throws DaoException;
	public void insertTmpTbl20(TmpTblDvo dvo) throws DaoException;
	
	public void deleteTmpTbl01(TmpTblDvo dvo) throws DaoException;
	public void deleteTmpTbl02(TmpTblDvo dvo) throws DaoException;
	public void deleteTmpTbl03(TmpTblDvo dvo) throws DaoException;
	public void deleteTmpTbl04(TmpTblDvo dvo) throws DaoException;
	public void deleteTmpTbl05(TmpTblDvo dvo) throws DaoException;
	public void deleteTmpTbl06(TmpTblDvo dvo) throws DaoException;
	public void deleteTmpTbl07(TmpTblDvo dvo) throws DaoException;
	public void deleteTmpTbl08(TmpTblDvo dvo) throws DaoException;
	public void deleteTmpTbl09(TmpTblDvo dvo) throws DaoException;
	public void deleteTmpTbl10(TmpTblDvo dvo) throws DaoException;
	public void deleteTmpTbl11(TmpTblDvo dvo) throws DaoException;
	public void deleteTmpTbl12(TmpTblDvo dvo) throws DaoException;
	public void deleteTmpTbl13(TmpTblDvo dvo) throws DaoException;
	public void deleteTmpTbl14(TmpTblDvo dvo) throws DaoException;
	public void deleteTmpTbl15(TmpTblDvo dvo) throws DaoException;
	public void deleteTmpTbl16(TmpTblDvo dvo) throws DaoException;
	public void deleteTmpTbl17(TmpTblDvo dvo) throws DaoException;
	public void deleteTmpTbl18(TmpTblDvo dvo) throws DaoException;
	public void deleteTmpTbl19(TmpTblDvo dvo) throws DaoException;
	public void deleteTmpTbl20(TmpTblDvo dvo) throws DaoException;
	
	public void executeStrSql(DbaDvo dvo) throws DaoException;
}
