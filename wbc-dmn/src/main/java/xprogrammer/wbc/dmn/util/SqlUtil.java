package xprogrammer.wbc.dmn.util;

import xprogrammer.wbc.dmn.cmn.constant.Letter;

public class SqlUtil {
	
	public static String getSlctSql(String slctSqlTyp) {
		String sql = "";
		switch (slctSqlTyp) {
		case "SLCT_SQL_01": sql = getSlctSql04(); break;
		case "SLCT_SQL_02": sql = getSlctSql04(); break;
		case "SLCT_SQL_03": sql = getSlctSql03(); break;
		case "SLCT_SQL_04": sql = getSlctSql04(); break;
		case "SLCT_SQL_05": sql = getSlctSql05(); break;
		case "SLCT_SQL_06": sql = getSlctSql06(); break;
		case "SLCT_SQL_07": sql = getSlctSql07(); break;
		case "SLCT_SQL_08": sql = getSlctSql08(); break;
		case "SLCT_SQL_09": sql = getSlctSql09(); break;
		case "SLCT_SQL_10": sql = getSlctSql10(); break;
		case "SLCT_SQL_11": sql = getSlctSql11(); break;
		case "SLCT_SQL_12": sql = getSlctSql12(); break;
		case "SLCT_SQL_13": sql = getSlctSql13(); break;
		case "SLCT_SQL_14": sql = getSlctSql14(); break;
		case "SLCT_SQL_15": sql = getSlctSql15(); break;
		case "SLCT_SQL_16": sql = getSlctSql16(); break;
		case "SLCT_SQL_17": sql = getSlctSql17(); break;
		case "SLCT_SQL_18": sql = getSlctSql18(); break;
		case "SLCT_SQL_19": sql = getSlctSql19(); break;
		case "SLCT_SQL_20": sql = getSlctSql20(); break;
		default:break;
		}
		
		return sql;
	}
	
	private static String getSlctSql03(){
		String sql = "";
		sql += Letter.BLANK + "SELECT";
		sql += Letter.BLANK + "wbc_tmp_tbl01.COL_VAL AS COL01";
		sql += Letter.BLANK + ",wbc_tmp_tbl02.COL_VAL AS COL02";
		sql += Letter.BLANK + ",wbc_tmp_tbl03.COL_VAL AS COL03";
		sql += Letter.BLANK + "FROM wbc_tmp_tbl01";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl02 ON wbc_tmp_tbl01.SEQ = wbc_tmp_tbl02.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl03 ON wbc_tmp_tbl02.SEQ = wbc_tmp_tbl03.SEQ"; 
		return sql;
	}
	
	private static String getSlctSql04(){
		String sql = "";
		sql += Letter.BLANK + "SELECT";
		sql += Letter.BLANK + "wbc_tmp_tbl01.COL_VAL AS COL01";
		sql += Letter.BLANK + ",wbc_tmp_tbl02.COL_VAL AS COL02";
		sql += Letter.BLANK + ",wbc_tmp_tbl03.COL_VAL AS COL03";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL04";
		sql += Letter.BLANK + "FROM wbc_tmp_tbl01";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl02 ON wbc_tmp_tbl01.SEQ = wbc_tmp_tbl02.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl03 ON wbc_tmp_tbl02.SEQ = wbc_tmp_tbl03.SEQ"; 
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl04 ON wbc_tmp_tbl03.SEQ = wbc_tmp_tbl04.SEQ";
		return sql;
	}
	
	private static String getSlctSql05(){
		String sql = "";
		sql += Letter.BLANK + "SELECT";
		sql += Letter.BLANK + "wbc_tmp_tbl01.COL_VAL AS COL01";
		sql += Letter.BLANK + ",wbc_tmp_tbl02.COL_VAL AS COL02";
		sql += Letter.BLANK + ",wbc_tmp_tbl03.COL_VAL AS COL03";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL04";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL05";
		sql += Letter.BLANK + "FROM wbc_tmp_tbl01";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl02 ON wbc_tmp_tbl01.SEQ = wbc_tmp_tbl02.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl03 ON wbc_tmp_tbl02.SEQ = wbc_tmp_tbl03.SEQ"; 
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl04 ON wbc_tmp_tbl03.SEQ = wbc_tmp_tbl04.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl05 ON wbc_tmp_tbl04.SEQ = wbc_tmp_tbl05.SEQ";
		return sql;
	}
	
	private static String getSlctSql06(){
		String sql = "";
		sql += Letter.BLANK + "SELECT";
		sql += Letter.BLANK + "wbc_tmp_tbl01.COL_VAL AS COL01";
		sql += Letter.BLANK + ",wbc_tmp_tbl02.COL_VAL AS COL02";
		sql += Letter.BLANK + ",wbc_tmp_tbl03.COL_VAL AS COL03";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL04";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL05";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL06";
		sql += Letter.BLANK + "FROM wbc_tmp_tbl01";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl02 ON wbc_tmp_tbl01.SEQ = wbc_tmp_tbl02.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl03 ON wbc_tmp_tbl02.SEQ = wbc_tmp_tbl03.SEQ"; 
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl04 ON wbc_tmp_tbl03.SEQ = wbc_tmp_tbl04.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl05 ON wbc_tmp_tbl04.SEQ = wbc_tmp_tbl05.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl06 ON wbc_tmp_tbl05.SEQ = wbc_tmp_tbl06.SEQ";
		return sql;
	}
	
	private static String getSlctSql07(){
		String sql = "";
		sql += Letter.BLANK + "SELECT";
		sql += Letter.BLANK + "wbc_tmp_tbl01.COL_VAL AS COL01";
		sql += Letter.BLANK + ",wbc_tmp_tbl02.COL_VAL AS COL02";
		sql += Letter.BLANK + ",wbc_tmp_tbl03.COL_VAL AS COL03";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL04";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL05";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL06";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL07";
		sql += Letter.BLANK + "FROM wbc_tmp_tbl01";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl02 ON wbc_tmp_tbl01.SEQ = wbc_tmp_tbl02.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl03 ON wbc_tmp_tbl02.SEQ = wbc_tmp_tbl03.SEQ"; 
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl04 ON wbc_tmp_tbl03.SEQ = wbc_tmp_tbl04.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl05 ON wbc_tmp_tbl04.SEQ = wbc_tmp_tbl05.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl06 ON wbc_tmp_tbl05.SEQ = wbc_tmp_tbl06.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl07 ON wbc_tmp_tbl06.SEQ = wbc_tmp_tbl07.SEQ";
		return sql;
	}
	
	private static String getSlctSql08(){
		String sql = "";
		sql += Letter.BLANK + "SELECT";
		sql += Letter.BLANK + "wbc_tmp_tbl01.COL_VAL AS COL01";
		sql += Letter.BLANK + ",wbc_tmp_tbl02.COL_VAL AS COL02";
		sql += Letter.BLANK + ",wbc_tmp_tbl03.COL_VAL AS COL03";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL04";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL05";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL06";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL07";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL08";
		sql += Letter.BLANK + "FROM wbc_tmp_tbl01";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl02 ON wbc_tmp_tbl01.SEQ = wbc_tmp_tbl02.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl03 ON wbc_tmp_tbl02.SEQ = wbc_tmp_tbl03.SEQ"; 
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl04 ON wbc_tmp_tbl03.SEQ = wbc_tmp_tbl04.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl05 ON wbc_tmp_tbl04.SEQ = wbc_tmp_tbl05.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl06 ON wbc_tmp_tbl05.SEQ = wbc_tmp_tbl06.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl07 ON wbc_tmp_tbl06.SEQ = wbc_tmp_tbl07.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl08 ON wbc_tmp_tbl07.SEQ = wbc_tmp_tbl08.SEQ";
		return sql;
	}
	
	private static String getSlctSql09(){
		String sql = "";
		sql += Letter.BLANK + "SELECT";
		sql += Letter.BLANK + "wbc_tmp_tbl01.COL_VAL AS COL01";
		sql += Letter.BLANK + ",wbc_tmp_tbl02.COL_VAL AS COL02";
		sql += Letter.BLANK + ",wbc_tmp_tbl03.COL_VAL AS COL03";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL04";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL05";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL06";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL07";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL08";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL09";
		sql += Letter.BLANK + "FROM wbc_tmp_tbl01";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl02 ON wbc_tmp_tbl01.SEQ = wbc_tmp_tbl02.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl03 ON wbc_tmp_tbl02.SEQ = wbc_tmp_tbl03.SEQ"; 
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl04 ON wbc_tmp_tbl03.SEQ = wbc_tmp_tbl04.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl05 ON wbc_tmp_tbl04.SEQ = wbc_tmp_tbl05.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl06 ON wbc_tmp_tbl05.SEQ = wbc_tmp_tbl06.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl07 ON wbc_tmp_tbl06.SEQ = wbc_tmp_tbl07.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl08 ON wbc_tmp_tbl07.SEQ = wbc_tmp_tbl08.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl09 ON wbc_tmp_tbl08.SEQ = wbc_tmp_tbl09.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl20 ON wbc_tmp_tbl19.SEQ = wbc_tmp_tbl20.SEQ";
		return sql;
	}
	
	private static String getSlctSql10(){
		String sql = "";
		sql += Letter.BLANK + "SELECT";
		sql += Letter.BLANK + "wbc_tmp_tbl01.COL_VAL AS COL01";
		sql += Letter.BLANK + ",wbc_tmp_tbl02.COL_VAL AS COL02";
		sql += Letter.BLANK + ",wbc_tmp_tbl03.COL_VAL AS COL03";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL04";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL05";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL06";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL07";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL08";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL09";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL10";
		sql += Letter.BLANK + "FROM wbc_tmp_tbl01";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl02 ON wbc_tmp_tbl01.SEQ = wbc_tmp_tbl02.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl03 ON wbc_tmp_tbl02.SEQ = wbc_tmp_tbl03.SEQ"; 
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl04 ON wbc_tmp_tbl03.SEQ = wbc_tmp_tbl04.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl05 ON wbc_tmp_tbl04.SEQ = wbc_tmp_tbl05.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl06 ON wbc_tmp_tbl05.SEQ = wbc_tmp_tbl06.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl07 ON wbc_tmp_tbl06.SEQ = wbc_tmp_tbl07.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl08 ON wbc_tmp_tbl07.SEQ = wbc_tmp_tbl08.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl09 ON wbc_tmp_tbl08.SEQ = wbc_tmp_tbl09.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl10 ON wbc_tmp_tbl09.SEQ = wbc_tmp_tbl10.SEQ";
		return sql;
	}
	
	private static String getSlctSql11(){
		String sql = "";
		sql += Letter.BLANK + "SELECT";
		sql += Letter.BLANK + "wbc_tmp_tbl01.COL_VAL AS COL01";
		sql += Letter.BLANK + ",wbc_tmp_tbl02.COL_VAL AS COL02";
		sql += Letter.BLANK + ",wbc_tmp_tbl03.COL_VAL AS COL03";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL04";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL05";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL06";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL07";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL08";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL09";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL10";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL11";
		sql += Letter.BLANK + "FROM wbc_tmp_tbl01";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl02 ON wbc_tmp_tbl01.SEQ = wbc_tmp_tbl02.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl03 ON wbc_tmp_tbl02.SEQ = wbc_tmp_tbl03.SEQ"; 
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl04 ON wbc_tmp_tbl03.SEQ = wbc_tmp_tbl04.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl05 ON wbc_tmp_tbl04.SEQ = wbc_tmp_tbl05.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl06 ON wbc_tmp_tbl05.SEQ = wbc_tmp_tbl06.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl07 ON wbc_tmp_tbl06.SEQ = wbc_tmp_tbl07.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl08 ON wbc_tmp_tbl07.SEQ = wbc_tmp_tbl08.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl09 ON wbc_tmp_tbl08.SEQ = wbc_tmp_tbl09.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl10 ON wbc_tmp_tbl09.SEQ = wbc_tmp_tbl10.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl11 ON wbc_tmp_tbl10.SEQ = wbc_tmp_tbl11.SEQ";
		return sql;
	}
	
	private static String getSlctSql12(){
		String sql = "";
		sql += Letter.BLANK + "SELECT";
		sql += Letter.BLANK + "wbc_tmp_tbl01.COL_VAL AS COL01";
		sql += Letter.BLANK + ",wbc_tmp_tbl02.COL_VAL AS COL02";
		sql += Letter.BLANK + ",wbc_tmp_tbl03.COL_VAL AS COL03";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL04";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL05";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL06";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL07";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL08";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL09";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL10";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL11";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL12";
		sql += Letter.BLANK + "FROM wbc_tmp_tbl01";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl02 ON wbc_tmp_tbl01.SEQ = wbc_tmp_tbl02.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl03 ON wbc_tmp_tbl02.SEQ = wbc_tmp_tbl03.SEQ"; 
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl04 ON wbc_tmp_tbl03.SEQ = wbc_tmp_tbl04.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl05 ON wbc_tmp_tbl04.SEQ = wbc_tmp_tbl05.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl06 ON wbc_tmp_tbl05.SEQ = wbc_tmp_tbl06.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl07 ON wbc_tmp_tbl06.SEQ = wbc_tmp_tbl07.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl08 ON wbc_tmp_tbl07.SEQ = wbc_tmp_tbl08.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl09 ON wbc_tmp_tbl08.SEQ = wbc_tmp_tbl09.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl10 ON wbc_tmp_tbl09.SEQ = wbc_tmp_tbl10.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl11 ON wbc_tmp_tbl10.SEQ = wbc_tmp_tbl11.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl12 ON wbc_tmp_tbl11.SEQ = wbc_tmp_tbl12.SEQ";
		return sql;
	}
	
	private static String getSlctSql13(){
		String sql = "";
		sql += Letter.BLANK + "SELECT";
		sql += Letter.BLANK + "wbc_tmp_tbl01.COL_VAL AS COL01";
		sql += Letter.BLANK + ",wbc_tmp_tbl02.COL_VAL AS COL02";
		sql += Letter.BLANK + ",wbc_tmp_tbl03.COL_VAL AS COL03";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL04";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL05";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL06";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL07";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL08";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL09";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL10";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL11";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL12";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL13";
		sql += Letter.BLANK + "FROM wbc_tmp_tbl01";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl02 ON wbc_tmp_tbl01.SEQ = wbc_tmp_tbl02.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl03 ON wbc_tmp_tbl02.SEQ = wbc_tmp_tbl03.SEQ"; 
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl04 ON wbc_tmp_tbl03.SEQ = wbc_tmp_tbl04.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl05 ON wbc_tmp_tbl04.SEQ = wbc_tmp_tbl05.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl06 ON wbc_tmp_tbl05.SEQ = wbc_tmp_tbl06.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl07 ON wbc_tmp_tbl06.SEQ = wbc_tmp_tbl07.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl08 ON wbc_tmp_tbl07.SEQ = wbc_tmp_tbl08.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl09 ON wbc_tmp_tbl08.SEQ = wbc_tmp_tbl09.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl10 ON wbc_tmp_tbl09.SEQ = wbc_tmp_tbl10.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl11 ON wbc_tmp_tbl10.SEQ = wbc_tmp_tbl11.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl12 ON wbc_tmp_tbl11.SEQ = wbc_tmp_tbl12.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl13 ON wbc_tmp_tbl12.SEQ = wbc_tmp_tbl13.SEQ";
		return sql;
	}
	
	private static String getSlctSql14(){
		String sql = "";
		sql += Letter.BLANK + "SELECT";
		sql += Letter.BLANK + "wbc_tmp_tbl01.COL_VAL AS COL01";
		sql += Letter.BLANK + ",wbc_tmp_tbl02.COL_VAL AS COL02";
		sql += Letter.BLANK + ",wbc_tmp_tbl03.COL_VAL AS COL03";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL04";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL05";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL06";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL07";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL08";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL09";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL10";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL11";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL12";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL13";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL14";
		sql += Letter.BLANK + "FROM wbc_tmp_tbl01";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl02 ON wbc_tmp_tbl01.SEQ = wbc_tmp_tbl02.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl03 ON wbc_tmp_tbl02.SEQ = wbc_tmp_tbl03.SEQ"; 
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl04 ON wbc_tmp_tbl03.SEQ = wbc_tmp_tbl04.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl05 ON wbc_tmp_tbl04.SEQ = wbc_tmp_tbl05.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl06 ON wbc_tmp_tbl05.SEQ = wbc_tmp_tbl06.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl07 ON wbc_tmp_tbl06.SEQ = wbc_tmp_tbl07.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl08 ON wbc_tmp_tbl07.SEQ = wbc_tmp_tbl08.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl09 ON wbc_tmp_tbl08.SEQ = wbc_tmp_tbl09.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl10 ON wbc_tmp_tbl09.SEQ = wbc_tmp_tbl10.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl11 ON wbc_tmp_tbl10.SEQ = wbc_tmp_tbl11.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl12 ON wbc_tmp_tbl11.SEQ = wbc_tmp_tbl12.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl13 ON wbc_tmp_tbl12.SEQ = wbc_tmp_tbl13.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl14 ON wbc_tmp_tbl13.SEQ = wbc_tmp_tbl14.SEQ";
		return sql;
	}
	
	private static String getSlctSql15(){
		String sql = "";
		sql += Letter.BLANK + "SELECT";
		sql += Letter.BLANK + "wbc_tmp_tbl01.COL_VAL AS COL01";
		sql += Letter.BLANK + ",wbc_tmp_tbl02.COL_VAL AS COL02";
		sql += Letter.BLANK + ",wbc_tmp_tbl03.COL_VAL AS COL03";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL04";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL05";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL06";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL07";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL08";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL09";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL10";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL11";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL12";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL13";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL14";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL15";
		sql += Letter.BLANK + "FROM wbc_tmp_tbl01";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl02 ON wbc_tmp_tbl01.SEQ = wbc_tmp_tbl02.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl03 ON wbc_tmp_tbl02.SEQ = wbc_tmp_tbl03.SEQ"; 
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl04 ON wbc_tmp_tbl03.SEQ = wbc_tmp_tbl04.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl05 ON wbc_tmp_tbl04.SEQ = wbc_tmp_tbl05.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl06 ON wbc_tmp_tbl05.SEQ = wbc_tmp_tbl06.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl07 ON wbc_tmp_tbl06.SEQ = wbc_tmp_tbl07.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl08 ON wbc_tmp_tbl07.SEQ = wbc_tmp_tbl08.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl09 ON wbc_tmp_tbl08.SEQ = wbc_tmp_tbl09.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl10 ON wbc_tmp_tbl09.SEQ = wbc_tmp_tbl10.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl11 ON wbc_tmp_tbl10.SEQ = wbc_tmp_tbl11.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl12 ON wbc_tmp_tbl11.SEQ = wbc_tmp_tbl12.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl13 ON wbc_tmp_tbl12.SEQ = wbc_tmp_tbl13.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl14 ON wbc_tmp_tbl13.SEQ = wbc_tmp_tbl14.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl15 ON wbc_tmp_tbl14.SEQ = wbc_tmp_tbl15.SEQ";
		return sql;
	}
	
	private static String getSlctSql16(){
		String sql = "";
		sql += Letter.BLANK + "SELECT";
		sql += Letter.BLANK + "wbc_tmp_tbl01.COL_VAL AS COL01";
		sql += Letter.BLANK + ",wbc_tmp_tbl02.COL_VAL AS COL02";
		sql += Letter.BLANK + ",wbc_tmp_tbl03.COL_VAL AS COL03";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL04";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL05";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL06";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL07";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL08";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL09";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL10";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL11";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL12";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL13";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL14";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL15";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL16";
		sql += Letter.BLANK + "FROM wbc_tmp_tbl01";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl02 ON wbc_tmp_tbl01.SEQ = wbc_tmp_tbl02.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl03 ON wbc_tmp_tbl02.SEQ = wbc_tmp_tbl03.SEQ"; 
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl04 ON wbc_tmp_tbl03.SEQ = wbc_tmp_tbl04.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl05 ON wbc_tmp_tbl04.SEQ = wbc_tmp_tbl05.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl06 ON wbc_tmp_tbl05.SEQ = wbc_tmp_tbl06.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl07 ON wbc_tmp_tbl06.SEQ = wbc_tmp_tbl07.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl08 ON wbc_tmp_tbl07.SEQ = wbc_tmp_tbl08.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl09 ON wbc_tmp_tbl08.SEQ = wbc_tmp_tbl09.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl10 ON wbc_tmp_tbl09.SEQ = wbc_tmp_tbl10.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl11 ON wbc_tmp_tbl10.SEQ = wbc_tmp_tbl11.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl12 ON wbc_tmp_tbl11.SEQ = wbc_tmp_tbl12.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl13 ON wbc_tmp_tbl12.SEQ = wbc_tmp_tbl13.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl14 ON wbc_tmp_tbl13.SEQ = wbc_tmp_tbl14.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl15 ON wbc_tmp_tbl14.SEQ = wbc_tmp_tbl15.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl16 ON wbc_tmp_tbl15.SEQ = wbc_tmp_tbl16.SEQ";
		return sql;
	}
	
	private static String getSlctSql17(){
		String sql = "";
		sql += Letter.BLANK + "SELECT";
		sql += Letter.BLANK + "wbc_tmp_tbl01.COL_VAL AS COL01";
		sql += Letter.BLANK + ",wbc_tmp_tbl02.COL_VAL AS COL02";
		sql += Letter.BLANK + ",wbc_tmp_tbl03.COL_VAL AS COL03";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL04";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL05";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL06";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL07";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL08";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL09";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL10";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL11";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL12";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL13";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL14";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL15";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL16";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL17";
		sql += Letter.BLANK + "FROM wbc_tmp_tbl01";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl02 ON wbc_tmp_tbl01.SEQ = wbc_tmp_tbl02.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl03 ON wbc_tmp_tbl02.SEQ = wbc_tmp_tbl03.SEQ"; 
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl04 ON wbc_tmp_tbl03.SEQ = wbc_tmp_tbl04.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl05 ON wbc_tmp_tbl04.SEQ = wbc_tmp_tbl05.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl06 ON wbc_tmp_tbl05.SEQ = wbc_tmp_tbl06.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl07 ON wbc_tmp_tbl06.SEQ = wbc_tmp_tbl07.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl08 ON wbc_tmp_tbl07.SEQ = wbc_tmp_tbl08.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl09 ON wbc_tmp_tbl08.SEQ = wbc_tmp_tbl09.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl10 ON wbc_tmp_tbl09.SEQ = wbc_tmp_tbl10.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl11 ON wbc_tmp_tbl10.SEQ = wbc_tmp_tbl11.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl12 ON wbc_tmp_tbl11.SEQ = wbc_tmp_tbl12.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl13 ON wbc_tmp_tbl12.SEQ = wbc_tmp_tbl13.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl14 ON wbc_tmp_tbl13.SEQ = wbc_tmp_tbl14.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl15 ON wbc_tmp_tbl14.SEQ = wbc_tmp_tbl15.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl16 ON wbc_tmp_tbl15.SEQ = wbc_tmp_tbl16.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl17 ON wbc_tmp_tbl16.SEQ = wbc_tmp_tbl17.SEQ";
		return sql;
	}
	
	private static String getSlctSql18(){
		String sql = "";
		sql += Letter.BLANK + "SELECT";
		sql += Letter.BLANK + "wbc_tmp_tbl01.COL_VAL AS COL01";
		sql += Letter.BLANK + ",wbc_tmp_tbl02.COL_VAL AS COL02";
		sql += Letter.BLANK + ",wbc_tmp_tbl03.COL_VAL AS COL03";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL04";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL05";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL06";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL07";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL08";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL09";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL10";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL11";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL12";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL13";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL14";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL15";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL16";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL17";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL18";
		sql += Letter.BLANK + "FROM wbc_tmp_tbl01";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl02 ON wbc_tmp_tbl01.SEQ = wbc_tmp_tbl02.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl03 ON wbc_tmp_tbl02.SEQ = wbc_tmp_tbl03.SEQ"; 
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl04 ON wbc_tmp_tbl03.SEQ = wbc_tmp_tbl04.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl05 ON wbc_tmp_tbl04.SEQ = wbc_tmp_tbl05.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl06 ON wbc_tmp_tbl05.SEQ = wbc_tmp_tbl06.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl07 ON wbc_tmp_tbl06.SEQ = wbc_tmp_tbl07.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl08 ON wbc_tmp_tbl07.SEQ = wbc_tmp_tbl08.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl09 ON wbc_tmp_tbl08.SEQ = wbc_tmp_tbl09.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl10 ON wbc_tmp_tbl09.SEQ = wbc_tmp_tbl10.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl11 ON wbc_tmp_tbl10.SEQ = wbc_tmp_tbl11.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl12 ON wbc_tmp_tbl11.SEQ = wbc_tmp_tbl12.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl13 ON wbc_tmp_tbl12.SEQ = wbc_tmp_tbl13.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl14 ON wbc_tmp_tbl13.SEQ = wbc_tmp_tbl14.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl15 ON wbc_tmp_tbl14.SEQ = wbc_tmp_tbl15.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl16 ON wbc_tmp_tbl15.SEQ = wbc_tmp_tbl16.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl17 ON wbc_tmp_tbl16.SEQ = wbc_tmp_tbl17.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl18 ON wbc_tmp_tbl17.SEQ = wbc_tmp_tbl18.SEQ";
		return sql;
	}
	
	private static String getSlctSql19(){
		String sql = "";
		sql += Letter.BLANK + "SELECT";
		sql += Letter.BLANK + "wbc_tmp_tbl01.COL_VAL AS COL01";
		sql += Letter.BLANK + ",wbc_tmp_tbl02.COL_VAL AS COL02";
		sql += Letter.BLANK + ",wbc_tmp_tbl03.COL_VAL AS COL03";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL04";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL05";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL06";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL07";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL08";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL09";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL10";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL11";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL12";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL13";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL14";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL15";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL16";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL17";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL18";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL19";
		sql += Letter.BLANK + "FROM wbc_tmp_tbl01";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl02 ON wbc_tmp_tbl01.SEQ = wbc_tmp_tbl02.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl03 ON wbc_tmp_tbl02.SEQ = wbc_tmp_tbl03.SEQ"; 
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl04 ON wbc_tmp_tbl03.SEQ = wbc_tmp_tbl04.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl05 ON wbc_tmp_tbl04.SEQ = wbc_tmp_tbl05.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl06 ON wbc_tmp_tbl05.SEQ = wbc_tmp_tbl06.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl07 ON wbc_tmp_tbl06.SEQ = wbc_tmp_tbl07.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl08 ON wbc_tmp_tbl07.SEQ = wbc_tmp_tbl08.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl09 ON wbc_tmp_tbl08.SEQ = wbc_tmp_tbl09.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl10 ON wbc_tmp_tbl09.SEQ = wbc_tmp_tbl10.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl11 ON wbc_tmp_tbl10.SEQ = wbc_tmp_tbl11.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl12 ON wbc_tmp_tbl11.SEQ = wbc_tmp_tbl12.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl13 ON wbc_tmp_tbl12.SEQ = wbc_tmp_tbl13.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl14 ON wbc_tmp_tbl13.SEQ = wbc_tmp_tbl14.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl15 ON wbc_tmp_tbl14.SEQ = wbc_tmp_tbl15.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl16 ON wbc_tmp_tbl15.SEQ = wbc_tmp_tbl16.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl17 ON wbc_tmp_tbl16.SEQ = wbc_tmp_tbl17.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl18 ON wbc_tmp_tbl17.SEQ = wbc_tmp_tbl18.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl19 ON wbc_tmp_tbl18.SEQ = wbc_tmp_tbl19.SEQ";
		return sql;
	}
	
	private static String getSlctSql20(){
		String sql = "";
		sql += Letter.BLANK + "SELECT";
		sql += Letter.BLANK + "wbc_tmp_tbl01.COL_VAL AS COL01";
		sql += Letter.BLANK + ",wbc_tmp_tbl02.COL_VAL AS COL02";
		sql += Letter.BLANK + ",wbc_tmp_tbl03.COL_VAL AS COL03";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL04";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL05";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL06";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL07";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL08";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL09";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL10";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL11";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL12";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL13";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL14";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL15";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL16";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL17";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL18";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL19";
		sql += Letter.BLANK + ",wbc_tmp_tbl04.COL_VAL AS COL20";
		sql += Letter.BLANK + "FROM wbc_tmp_tbl01";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl02 ON wbc_tmp_tbl01.SEQ = wbc_tmp_tbl02.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl03 ON wbc_tmp_tbl02.SEQ = wbc_tmp_tbl03.SEQ"; 
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl04 ON wbc_tmp_tbl03.SEQ = wbc_tmp_tbl04.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl05 ON wbc_tmp_tbl04.SEQ = wbc_tmp_tbl05.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl06 ON wbc_tmp_tbl05.SEQ = wbc_tmp_tbl06.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl07 ON wbc_tmp_tbl06.SEQ = wbc_tmp_tbl07.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl08 ON wbc_tmp_tbl07.SEQ = wbc_tmp_tbl08.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl09 ON wbc_tmp_tbl08.SEQ = wbc_tmp_tbl09.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl10 ON wbc_tmp_tbl09.SEQ = wbc_tmp_tbl10.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl11 ON wbc_tmp_tbl10.SEQ = wbc_tmp_tbl11.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl12 ON wbc_tmp_tbl11.SEQ = wbc_tmp_tbl12.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl13 ON wbc_tmp_tbl12.SEQ = wbc_tmp_tbl13.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl14 ON wbc_tmp_tbl13.SEQ = wbc_tmp_tbl14.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl15 ON wbc_tmp_tbl14.SEQ = wbc_tmp_tbl15.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl16 ON wbc_tmp_tbl15.SEQ = wbc_tmp_tbl16.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl17 ON wbc_tmp_tbl16.SEQ = wbc_tmp_tbl17.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl18 ON wbc_tmp_tbl17.SEQ = wbc_tmp_tbl18.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl19 ON wbc_tmp_tbl18.SEQ = wbc_tmp_tbl19.SEQ";
		sql += Letter.BLANK + "INNER JOIN wbc_tmp_tbl20 ON wbc_tmp_tbl19.SEQ = wbc_tmp_tbl20.SEQ";
		return sql;
	}
	
	public String getInsrtSql(String slctSqlTyp) {
		String sql = "";
		
		return sql;
	}
}
