package xprogrammer.wbc.dmn.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.apache.log4j.Logger;

public class DateUtil {
	private static Logger logger = Logger.getLogger(DateUtil.class);
	
	/**
	 * pattern으로 오늘날짜를 리턴한다.
	 * @param pattern
	 * @return
	 */
	public static String getCurrentDate(String pattern){
		String result = "";
		if("".contentEquals(pattern)) {
			pattern = "yyyyMMddHHmmss";
		}
		Calendar cal = Calendar.getInstance( );
        SimpleDateFormat sdf = new SimpleDateFormat( );
        sdf.applyPattern( pattern );
        result = sdf.format( cal.getTime( ) );
        return result;
	}
	
	public static String calculateGapTime(Date s, Date e) {
		logger.debug("calculateGapTime");
		String gap = "";
		long time;
		int secs, mins, hours, days;

		time = e.getTime() - s.getTime();
		days = (int) (time / 86400000);// 1000(ms)*60(S)*60(M)*24(H)
		time = time % 86400000;
		hours = (int) (time / 3600000);// 1000(ms)*60(S)*60(M)
		time = time % 3600000;
		mins = (int) (time / 60000);// 1000(ms)*60(S)
		time = time % 60000;
		secs = (int) (time / 1000);// 1000(ms)
		
		if(days>0){
			gap = days + "일 ";
		}
		
		if(hours>0){
			gap = gap + toStr(hours) + "시간";
		}
		
		if(mins>0){
			gap = gap + toStr(mins) + "분";
		}
		
		if(secs>0){
			gap = gap + toStr(secs) + "초";
		}
		
		return gap;
	}

	private static String toStr(int i) {
		if (i < 10)
			return "0" + i;
		else
			return i + "";
	}

	/**
	 * 입력된 날짜를 기준으로 금요일을 구한다.
	 * 
	 * @param date
	 * @return
	 */
	public static String getFriDay(String date) {
		String result = null;
		String yearParam = date.substring(0, 4);
		String monthParam = date.substring(5, 7);
		String dayParam = date.substring(8, 10);
		// logger.debug("yearParam:"+yearParam);
		// logger.debug("monthParam:"+monthParam);
		// logger.debug("dayParam:"+dayParam);
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, Integer.parseInt(yearParam));
		cal.set(Calendar.MONTH, Integer.parseInt(monthParam) - 1);
		cal.set(Calendar.DATE, Integer.parseInt(dayParam));
		int day_of_week = cal.get(Calendar.DAY_OF_WEEK);
		if (day_of_week == 2) {
			cal.add(Calendar.DATE, 4);
		} else if (day_of_week == 3) {
			cal.add(Calendar.DATE, 3);
		} else if (day_of_week == 4) {
			cal.add(Calendar.DATE, 2);
		} else if (day_of_week == 5) {
			cal.add(Calendar.DATE, 1);
		}
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		String monthStr = (month < 10 ? "0" + month : String.valueOf(month));
		int day = cal.get(Calendar.DATE);
		String dayStr = (day < 10 ? "0" + day : String.valueOf(day));
		result = String.valueOf(year) + "." + monthStr + "." + dayStr;
		// logger.debug("result:"+result);
		return result;
	}

	public static String getToday(String separator) {
		String result = null;
		if("".equals(separator)){
			separator=".";
		}
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		String monthStr = (month < 10 ? "0" + month : String.valueOf(month));
		int day = cal.get(Calendar.DATE);
		String dayStr = (day < 10 ? "0" + day : String.valueOf(day));
		result = String.valueOf(year) + separator + monthStr + separator + dayStr;
		// logger.debug("result:"+result);
		return result;
	}
	
	public static String getYesterday(String separator) {
		String result = null;
		if("".equals(separator)){
			separator=".";
		}
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		String monthStr = (month < 10 ? "0" + month : String.valueOf(month));
		int day = cal.get(Calendar.DATE);
		String dayStr = (day < 10 ? "0" + day : String.valueOf(day));
		result = String.valueOf(year) + separator + monthStr + separator + dayStr;
		// logger.debug("result:"+result);
		return result;
	}

	public static int getWeeksBetween(String startDate, String endDate) {

		String yearParamStart = startDate.substring(0, 4);
		String monthParamStart = startDate.substring(5, 7);
		String dayParamStart = startDate.substring(8, 10);
		logger.debug("yearParamStart:" + yearParamStart);
		logger.debug("monthParamStart:" + monthParamStart);
		logger.debug("dayParamStart:" + dayParamStart);
		String yearParamEnd = endDate.substring(0, 4);
		String monthParamEnd = endDate.substring(5, 7);
		String dayParamEnd = endDate.substring(8, 10);
		logger.debug("yearParamEnd:" + yearParamEnd);
		logger.debug("monthParamEnd:" + monthParamEnd);
		logger.debug("dayParamEnd:" + dayParamEnd);

		Calendar startCal = new GregorianCalendar(
				Integer.parseInt(yearParamStart),
				Integer.parseInt(monthParamStart),
				Integer.parseInt(dayParamStart));
		Calendar endCal = new GregorianCalendar(Integer.parseInt(yearParamEnd),
				Integer.parseInt(monthParamEnd), Integer.parseInt(dayParamEnd));
		int weeks = 0;
		while (startCal.getTime().before(endCal.getTime())) {
			// add another week
			startCal.add(Calendar.WEEK_OF_YEAR, 1);
			weeks++;
		}
		return weeks;
	}

	/**
	 * 입력된 날짜를 기준으로 월요일을 구한다.
	 * 
	 * @param date
	 * @return
	 */
	public static String getMonDay(String date) {
		String result = null;
		String yearParam = date.substring(0, 4);
		String monthParam = date.substring(5, 7);
		String dayParam = date.substring(8, 10);
		// logger.debug("yearParam:"+yearParam);
		// logger.debug("monthParam:"+monthParam);
		// logger.debug("dayParam:"+dayParam);
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, Integer.parseInt(yearParam));
		cal.set(Calendar.MONTH, Integer.parseInt(monthParam) - 1);
		cal.set(Calendar.DATE, Integer.parseInt(dayParam));
		int day_of_week = cal.get(Calendar.DAY_OF_WEEK);
		if (day_of_week == 2) {
			cal.add(Calendar.DATE, 7);
		} else if (day_of_week == 3) {
			cal.add(Calendar.DATE, 6);
		} else if (day_of_week == 4) {
			cal.add(Calendar.DATE, 5);
		} else if (day_of_week == 5) {
			cal.add(Calendar.DATE, 4);
		} else if (day_of_week == 6) {
			cal.add(Calendar.DATE, 3);
		} else if (day_of_week == 7) {
			cal.add(Calendar.DATE, 2);
		} else if (day_of_week == 1) {
			cal.add(Calendar.DATE, 1);
		}
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		String monthStr = (month < 10 ? "0" + month : String.valueOf(month));
		int day = cal.get(Calendar.DATE);
		String dayStr = (day < 10 ? "0" + day : String.valueOf(day));
		result = String.valueOf(year) + "." + monthStr + "." + dayStr;
		// logger.debug("result:"+result);
		return result;
	}
	
	/** 
     * 1년 전의 날을 구한다. 
     */  
    public static String getPreviousYear(String date) {  
    	SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA); 
        Calendar cal = Calendar.getInstance();  
        try {
			cal.setTime(dt.parse(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}  
        cal.add(Calendar.YEAR, -1);  
        return dt.format(cal.getTime());  
    }  

}
