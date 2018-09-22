package com.sy.common.annotation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.log4j.Logger;

import com.sy.common.Exception.SyException;

public class DateUtil {

	private static Logger logger = Logger.getLogger(DateUtil.class);
	
	/**
	 * yyyy-MM-dd
	 */
	public final static String FORMAT_yyyy_MM_dd = "yyyy-MM-dd";

	/**
	 * yyyy-MM 
	 */
	public final static String FORMAT_yyyy_MM = "yyyy-MM";

	/**
	 * yyyy-MM-dd HH:mm:ss
	 */
	public final static String FORMAT_yyyy_MM_dd_HH_mm_ss = "yyyy-MM-dd HH:mm:ss";
	
	public final static String FORMAT_yyyy_MM_dd_T_HH_mm_ss = "yyyy-MM-dd'T'hh:mm:ss";

	/**
	 * yyyy/MM/dd同步老表使用
	 */
	public final static String fORMAT_OLD = "yyyy/MM/dd";
	/**
	 * yyyyMMdd同步老表使用
	 */
	public final static String fORMAT_Old = "yyyyMMdd";


	/**
	 * yyyy年MM月dd日
	 */
	public final static String FORMAT_yyyy_nian_MM_yue_mm_ri = "yyyy年MM月dd日";

	/**
	 * 功能说明：是否可以转换成日期，仅解析用/-.间隔的日期
	 * 		  dDate用于返回日期，改写dDate中已经存在的日期
	 * @param sDate java.util.String 类型字符串
	 * @param dDate java.util.Date 用于返回日期
	 * @return 是否可以转换成日期
	 */

	public static boolean isDate(String sDate){
		try {
			toSqlDate(sDate).getTime();
			return true;
		}
		catch (SyException ye) {
			return false;
		}
	}

	/**
	 * 功能说明：格式化日期函数；依据指定的日期格式。
	 * @param <T>
	 * @param date	日期参数
	 * @param format  格式化参数
	 * @return
	 */
	public static final  <T extends Date>String dateConvertStr(T date, String format){		
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}
	
	/**
	 * 功能说明：格式化日期函数；包含yyyy—MM-dd
	 * @param <T>
	 * @param date
	 * @return
	 */
	public static final  <T extends Date>String dateConvertStr(T date){		
		
		return dateConvertStr(date,DateUtil.FORMAT_yyyy_MM_dd);
	}

	/**
	 * 功能说明：返回给定日期所处会计期间
	 * @param dDate 日期
	 * @return int 会计期间
	 */
	public static int getTerm(Date dDate){
		return Integer.parseInt(DateUtil.formatDate(dDate, "yyyyMM"));
	}

	/**
	 * 功能说明：返回月末日
	 * @param year 年
	 * @param month 月
	 * @return 指定年、月的月末日
	 */
	public static int endOfMonth(int year, int month) {
		return new GregorianCalendar(year, month-1, 1).getActualMaximum(Calendar.DAY_OF_MONTH);
	}

	/**
	 * 将字符串转换成日期
	 * @param <T>
	 * @param strDate
	 * @param format
	 * @param clazz
	 * @return
	 * @throws Exception 
	 * @throws ParseException
	 */
	@SuppressWarnings("unchecked")
	public static final <T extends Date>T strConvertDate(String strDate,String format,Class<T> clazz) throws Exception 
	{
		T date=null;
		SimpleDateFormat sd=new SimpleDateFormat(format);
		if(clazz==Date.class)
			date=(T) sd.parse(strDate);
		else
			date=clazz.getConstructor(long.class).newInstance(sd.parse(strDate).getTime());
		return date;
	}

	//重构方法
	public static Date strConvertDate(String strDate) throws Exception{
		return strConvertDate(strDate,FORMAT_yyyy_MM_dd, Date.class);
	}

	/**
	 * 格式化时间
	 * @param date   字符串日期
	 * @param isTime 是否拼接时间
	 * @return
	 * @throws SyException
	 */
	public static String strConvertTime(String date, boolean isTime) throws SyException {
		
		String tmpDate = "";
		tmpDate = date.substring(0, 4) + "-" + date.substring(4, 6) + "-" + date.substring(6, 8);
		if (isTime) {
			if (date.length() >= 17) {
				tmpDate = tmpDate + " " + date.substring(9, 11) + ":" + date.substring(12, 14) + ":" + date.substring(15, 17);
			} else {
				tmpDate = tmpDate + " 00:00:00";
			}
			return tmpDate;
		} else {
			return tmpDate;
		}
	}
	
	/**
	 * 格式化时间
	 * @param date yyyy-MM-dd格式日期
	 * @return
	 * @throws SyException
	 */
	public static String strConvertTime(String date) throws SyException {
		return strConvertTime(date, false);
	}
	
	/**
	 * 功能说明：计算两个日期之间相差的天数
	 * @param dDate1：较小日期
	 * @param dDate2：较大日期
	 * @return 相差天数
	 */
	public static int dateDiff(java.util.Date dDate1, java.util.Date dDate2) {
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_yyyy_MM_dd);  
        try {
			dDate1 = sdf.parse(sdf.format(dDate1));  
			dDate2 = sdf.parse(sdf.format(dDate2));
		} catch (ParseException e) {
			logger.error(e);
		}
        
        Calendar cal = Calendar.getInstance();    
        cal.setTime(dDate1);
        long time1 = cal.getTimeInMillis();                 
        cal.setTime(dDate2);
        long time2 = cal.getTimeInMillis();
        long between_days = (time2-time1)/(1000*3600*24);  
            
        return Integer.parseInt(String.valueOf(between_days));   
	}
	
	/**
	 * 功能说明：通过只算年份和月份，获取月份差，不计四舍五入
	 * @param dDate1 Date：起始月日期
	 * @param dDate2 Date：终止月日期
	 * @return int：dDate2-dDate1的月份差
	 */
	public static int monthDiff(java.util.Date dDate1, java.util.Date dDate2){
		int year, month;
		GregorianCalendar cld = new GregorianCalendar();
		
		cld.setTime(dDate2);
		year = cld.get(Calendar.YEAR);
		month = cld.get(Calendar.MONTH);

		cld.setTime(dDate1);
		year -= cld.get(Calendar.YEAR);
		month -= cld.get(Calendar.MONTH);

		return year * 12 + month;
	}
	
	/**
	 * 功能说明：判断闰年
	 * @param year 传入得年份
	 * @return 是否为闰年;
	 */
	public static boolean isLeapYear(int year) {
		return new GregorianCalendar().isLeapYear(year);
	}
	
	/**
	 * 功能说明：返回给定日期当年天数
	 * @param dDate 日期
	 * @return int 年天数；平年365，闰年366。
	 * 
	 */
	public static int getYearDays(Date dDate) {
		return isLeapYear(getYear(dDate)) ? 366 : 365;
	}
	
	/**
	 * 功能说明：返回指定日期区间段呢包含2月29日的个数。
	 * 
	 * @param sDate：起始日期（含）
	 * @param eDate：结束日期（含）
	 * @return 2月29日的个数
	 * @throws Exception 
	 */
	public static int getLeapYears(Date sDate, Date eDate) throws Exception {
		int leapDays = 0;
		Date dDate;
		for (int i = getYear(sDate); i<= getYear(eDate); i++){
			if (isLeapYear(i)){
				dDate=strConvertDate(i + "-02-29");
				if (dateDiff(dDate,sDate)<=0 && dateDiff(dDate, eDate)>=0){
					leapDays++;
				}
			}
		}
		return leapDays;
	}
	
	/**
	 * 功能说明：依据类型返回日期中的元素
	 */
	public static int getDateItems(Date dDate, int field) {
		GregorianCalendar cl = new GregorianCalendar();
		cl.setTime(dDate);
		
		return cl.get(field);
	}
	
	/**
	 * 功能说明：返回给定日期的具体年份
	 * @param dDate 日期
	 * @return 
	 */
	public static int getYear(Date dDate){
		return getDateItems(dDate, Calendar.YEAR);
	}

	/**
	 * 功能说明：返回给定日期的具体月份
	 * @param dDate 日期
	 * @return int 月
	 */
	public static int getMonth(Date dDate) {
		return getDateItems(dDate, Calendar.MONTH) + 1;
	}
	
	/**
	 * 功能说明：返回给定日期为当月中具体日
	 * @param dDate 日期
	 * @return int 日
	 */
	public static int getDay(Date dDate) {
		return getDateItems(dDate, Calendar.DAY_OF_MONTH);
	}
	
	/**
	 * 功能说明：返回给定日期为星期几的标识位
	 * @param dDate 日期
	 * @return 星期几标识位
	 * 2：星期一
	 * 3：星期二
	 * 4：星期三
	 * 5：星期四
	 * 6：星期五
	 * 7：星期六
	 * 1：星期日
	 */
	public static int getWeekDay(Date dDate) {
		return getDateItems(dDate, Calendar.DAY_OF_WEEK);
	}
	
	/**
	 * 功能说明：返回给定日期所在季度的默认银行结息日期（每个季度的21日）
	 * @param dDate
	 * @return
	 * @throws Exception 
	 */
	public static Date getDefaultJxDay(Date dDate) throws SyException {
		String smonth = "";
		int dyear = getYear(dDate);
		int dmonth = getMonth(dDate);
		if (1<=dmonth && dmonth <=3) {
			smonth = "03";
		}else if (4<=dmonth && dmonth <=6) {
			smonth = "06";
		}else if (7<=dmonth && dmonth <=9) {
			smonth = "09";
		}else if (10<=dmonth && dmonth <=12) {
			smonth = "12";
		}
		try {
			return strConvertDate(dyear +"-"+ smonth +"-"+ "21");
		} catch (Exception e) {
			throw new SyException(e);
		}
	}
	
	/**
	 * 功能说明：根据参数条件加减日期
	 * @param 日期对象
	 * @param amount 增减数量
	 * @param field	 指定是年、月、日
	 * @return 变更后的日期
	 */
	public static Date addDate(Date dDate, int amount, int field) {
		GregorianCalendar cl = new GregorianCalendar();
		cl.setTime(dDate);
		cl.add(field, amount);
		return cl.getTime();
	}
	
	/**
	 * 功能说明：加减年，根据日期向前或向后推算N年
	 * @param dDate 日期
	 * @param years 年份数 正整数或负整数
	 * @return 返回增加年份后的日期对象
	 */
	public static final Date addYear(Date dDate, int years) {
		return addDate(dDate, years, Calendar.YEAR);
	}

	/**
	 * 功能说明：加减月，根据日期向前或向后推算N个月
	 * @param dDate 日期
	 * @param months 月份数 正整数或负整数
	 * @return 返回增加月份后的日期对象
	 */
	public static final Date addMonth(Date dDate, int months) {
		return addDate(dDate, months, Calendar.MONTH);		
	}
	
	/**
	 * 功能说明：加减日，根据日期向前或向后推算N个日
	 * @param dDate 日期
	 * @param days 日天数，正整数或负整数
	 * @return 返回增加天数后的日期对象
	 */
	public static final Date addDay(Date dDate, int days) {
		return addDate(dDate, days, Calendar.DAY_OF_MONTH);		
	}

	/**
	 * 获得初始化日期 1900-1-1
	 * @return 初始化日期
	 * @author 徐世强
	 */
	public static java.util.Date getInitDate(){
		SimpleDateFormat format = new SimpleDateFormat(FORMAT_yyyy_MM_dd);
		Date date = null;
		try{
			date = format.parse("1900-01-01");
		}catch(Exception e){
			logger.error(e.getMessage());
		}
		return date;
	}

	/**
	 * 获取当前服务器日期
	 * @return
	 */
	public static java.util.Date getCurDate(){
		return new java.util.Date();
	}
	
	/**
	 * 格式化日期 
	 * @param d 准备格式化的日期
	 * @return 格式化后的日期
	 * @author chuangye.lu
	 */
	public static java.util.Date getFormatDate(java.util.Date d){
		return getFormatDate(d, FORMAT_yyyy_MM_dd);
	}

	/**
	 * 格式化日期 
	 * @param d 准备格式化的日期
	 * @param formatStr 格式化类型参照DateUtils常量<br>比如DateUtils.FORMAT_yyyy_MM_dd
	 * @return 格式化后的日期
	 * @author chuangye.lu
	 */
	public static java.util.Date getFormatDate(java.util.Date d, String formatStr){
		SimpleDateFormat format = new SimpleDateFormat(formatStr);
		Date date = null;
		try{
			date = format.parse(format.format(d));

		}catch(Exception e){
			logger.error(e.getMessage());
		}
		return date;
	}


	/**
	 * 功能说明：将指定格式的字符串对象 转换为java.sql.Date对象。用标准格式yyyy-MM-dd
	 * @param dDate 字符串对象
	 * @exception SyException 解析日期出错！
	 * @return 转换后的日期对象
	 */
	public static java.sql.Date toSqlDate(String dDate) throws SyException {
		return toSqlDate(dDate, FORMAT_yyyy_MM_dd);
	}

	/**
	 * 功能说明：将指定格式的字符串对象 转换为java.sql.Date对象。
	 * 
	 * @param dDate 要转换为日期对象的字符串
	 * @param format 传入的字符串的格式说明
	 * @exception 解析日期出错！
	 * @return 日期对象
	 */
	public static java.sql.Date toSqlDate(String dDate, String format) throws SyException {
		GregorianCalendar cl = new GregorianCalendar();
		final String DERR = "解析日期出错！";
		try {
			cl.setTime(new SimpleDateFormat(format).parse(dDate));

			// 年份要控制一下
			int year = cl.get(Calendar.YEAR);
			if (year < 1000 || year > 9999)
				throw new SyException(DERR + "\n\t年份必须在1000－9999之间");

			return new java.sql.Date(cl.getTime().getTime());
		} catch (ParseException pe) {
			throw new SyException(pe);
		}
	}

	/**
	 * 功能说明：字符串类型的日期转换为java.util.Date类型的日期
	 * 		  类似vb的CDate函数，自动分析sDate，如格式正常，返回日期，否则报错。
	 * 		  注意这里只能处理单纯日期，不处理时间，年份正常范围在0-99和1000－9999	解析用/-.间隔的日期以及没有分隔符形如YYYYMMDD的日期	
	 * @param sDate java.util.String类型的日期
	 * @exception SyException 非法日期格式！
	 * @return 返回转换后的日期对象
	 */
	public static Date toDate(String sDate) throws SyException {
		if(sDate ==null){
			return null;
		}
		int jj;
		Boolean re=false;//是否有分隔符判断标识
		char ss, cc;
		String[] sss = { "-", "/", "."};
		String[] result;
		int kk, mm;
		final String emsg = "非法日期格式！";

		GregorianCalendar cl = null;
		int dlen = sDate.length();
		//检查分隔符
		for (jj = 0; jj < sss.length; jj++) {
			if (sDate.indexOf(sss[jj]) >= 0){
				re=true;//有分隔符时置为true
				break;
			}
		}
		//添加对没有分隔符日期格式的转换    add by luotaiping 2012-05-08
		if(re){//有分隔符的
			if (jj >= sss.length){
				throw new SyException(emsg);
			}
			ss = sss[jj].charAt(0);
			//检查数字有效性即除了数字和分隔符，不应该再包括其它字符
			for (int i = 0; i < dlen; i++) {
				cc = sDate.charAt(i);
				if (cc != ss && (cc < '0' || cc > '9'))
					throw new SyException(emsg);
			}

			//劈开，获取3个数字
			result = sDate.split(sss[jj], -1); //检查全部，包括空的元素，用0会忽略空
			if (result.length != 3)
				throw new SyException(emsg);
			jj = Integer.parseInt(result[0]);
			kk = Integer.parseInt(result[1]);
			mm = Integer.parseInt(result[2]);

			//判断是否符合一种日期格式
			//1、y/M/d格式
			if (isValidDate(jj, kk, mm))
				cl = new GregorianCalendar(jj < 30 ? jj + 2000 :
					(jj <= 99 ? jj + 1900 : jj), kk - 1, mm);
			else {
				if (mm < 30)
					mm += 2000;
				else if (mm <= 99)
					mm += 1900;
				//2、M/d/y格式
				if (isValidDate(mm, jj, kk))
					cl = new GregorianCalendar(mm, jj - 1, kk);
				//3、d/M/y格式
				else if (isValidDate(mm, kk, jj))
					cl = new GregorianCalendar(mm, kk - 1, jj);
				else
					throw new SyException(emsg);
			}
			
		}else{//无分隔符的
			if(dlen != 8){//无分隔符的日期不等于八位则为非法日期格式
				throw new SyException(emsg);
			}
			//检查数字有效性即除了数字，不应该再包括其它字符
			for (int i = 0; i < dlen; i++) {
				cc = sDate.charAt(i);
				if (cc < '0' || cc > '9')
					throw new SyException(emsg);
			}
			jj = Integer.parseInt(sDate.substring(0, 4));
			kk = Integer.parseInt(sDate.substring(4, 6));
			mm = Integer.parseInt(sDate.substring(6, 8));
			if (isValidDate(jj, kk, mm)){
				cl = new GregorianCalendar(jj < 30 ? jj + 2000 :
					(jj <= 99 ? jj + 1900 : jj), kk - 1, mm);
			}else{
				throw new SyException(emsg);
			}
				
		}
		return cl.getTime();
	}

	/**
	 * 功能说明：判断年月日是否在正常范围 年份正常范围在0-99和1000－9999
	 * @param year 年份值
	 * @param month 月份值
	 * @param day 天数值
	 * @return 判断年月日是否在正常范围
	 */
	public static boolean isValidDate(int year, int month, int day) {
		GregorianCalendar cl;

		if (year < 0 || (year > 99 && (year < 1000 || year > 9999)))
			return false;
		if (year < 30)
			year += 2000;
		else if (year <= 99)
			year += 1900;

		if (month < 1 || month > 12)
			return false;

		cl = new GregorianCalendar(year, month - 1, 1); //参数月份从0开始所以减一
		if (day < cl.getActualMinimum(Calendar.DAY_OF_MONTH) ||
				day > cl.getActualMaximum(Calendar.DAY_OF_MONTH))
			return false;

		return true;
	}  

	/**
	 * 功能说明：两种日期类型转换(java.sql.Date and java.util.Date)
	 * 
	 * @param dDate java.util.Date类型的日期
	 * @return java.sql.Date 类型的日期
	 */
	public static java.sql.Date toSqlDate(java.util.Date dDate) {
		return new java.sql.Date(dDate.getTime());
	}
	
	public static String formatDate(Date dDate){
		return formatDate(dDate,DateUtil.FORMAT_yyyy_MM_dd);
	}

	/**
	 * 日期格式化，类似vb的format
	 * 
	 * @param dDate Date
	 * @param format String：日期格式
	 * @return String：返回格式化好的日期字符串
	 */
	public static String formatDate(Date dDate, String format) {
		return (new SimpleDateFormat(format)).format(dDate);
	}

	/**
	 * 日期格式化，将字符串日期格式化
	 * 
	 * @param sDate：日期
	 * @param format:日期格式
	 * @return 返回格式化好的日期字符串
	 * @throws Exception
	 */
	public static String formatDate(String sDate, String format)
	throws Exception {
		if(null == sDate || "" .equals(sDate.trim())) {
			return null;
		}
		java.text.SimpleDateFormat f = new java.text.SimpleDateFormat(format);
		return f.format(toSqlDate(sDate));
	}

	/**
	 * 获取两个日期间的月份差数组
	 * 
	 * @param newStartDate 2011-03-05
	 * @param newEndDate 2011-05-05
	 * @return String[] {2011-03,2011-04,2011-05}
	 */
	public static String[] getArrMonth(String newStartDate, String newEndDate) throws Exception {

		Date startDate = strConvertDate(newStartDate, FORMAT_yyyy_MM,java.util.Date.class);
		Date endDate = strConvertDate(newEndDate, FORMAT_yyyy_MM,java.util.Date.class);

		String[] arrMonth = new String[monthDiff(startDate, endDate) + 1];
		arrMonth[0] = dateConvertStr(startDate, FORMAT_yyyy_MM);
		for (int i = 1; i < arrMonth.length; i++) {
			arrMonth[i] = dateConvertStr(getNextMonth(strConvertDate(arrMonth[i-1],FORMAT_yyyy_MM,Date.class)), FORMAT_yyyy_MM);
		}
		return arrMonth;
	}

	/**
	 * 获取两个日期间的日差数组
	 * 
	 * @param newStartDate 2011-04-29
	 * @param newEndDate 2011-05-01
	 * @return String[] {2011-04-29,2011-04-30,2011-05-01}
	 */
	public static String[] getArrDate(String newStartDate, String newEndDate) throws Exception {

		Date startDate = strConvertDate(newStartDate);
		Date endDate = strConvertDate(newEndDate);

		String[] arrDate = new String[dateDiff(startDate, endDate) + 1];
		arrDate[0] = dateConvertStr(startDate, FORMAT_yyyy_MM_dd);
		for (int i = 1; i < arrDate.length; i++) {
			arrDate[i] = dateConvertStr(getNextDate(strConvertDate(arrDate[i-1])), FORMAT_yyyy_MM_dd);
		}
		return arrDate;
	}

	/**
	 * 取得指定日期的下一个月
	 * 
	 * @param date 指定日期。
	 * @return 指定日期的下一个月
	 */
	public static java.util.Date getNextMonth(java.util.Date date) {
		GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
		gc.setTime(date);
		gc.add(Calendar.MONTH, 1);
		return gc.getTime();
	}

	/**
	 * 取得指定日期的下一日
	 * 
	 * @param date 指定日期。
	 * @return 指定日期的下一日
	 */
	public static java.util.Date getNextDate(java.util.Date date) {
		GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
		gc.setTime(date);
		gc.add(Calendar.DATE, 1);
		return gc.getTime();
	}
	
	/**
	 * 取得指定日期的前某一日或下某一日
	 * 
	 * @param date 指定日期。
	 * @return 指定日期的前某一日或下某一日
	 */
	public static java.util.Date getMouDate(java.util.Date date,int datec) {
		GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
		gc.setTime(date);
		gc.add(Calendar.DATE, datec);
		return gc.getTime();
	}	
	
	/**
	 * 获取月份第一天的日期
	 * 例如：date = 2011-1-23
	 * 		getMonthFirstDay(date) = 2011-1-1
	 */
	public static Date getMonthFirstDay(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
		calendar.set(year, month, day);		
		return calendar.getTime();
	}
	
	/**
	 * 获取月份最后一天的日期
	 * 例如：date = 2011-1-23
	 * 		getMonthLastDay(date) = 2011-1-31
	 */
	public static Date getMonthLastDay(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		calendar.set(year, month, day);		
		return calendar.getTime();
	}
	
	   /**
	    * 功能说明：转换格式[yyyymmdd]日期字符串，为[yyyy-mm-dd]格式的日期字符串
	    * @param date			日期字符串，例如“20111125”
	    * @return				返回转换好格式的日期字符串，例如“2011-11-25”
	    * @throws Exception
	    */
	   public static String getFormat(String date) throws Exception{
		   //检查长度是否吻合
		   if(date.length() != 8){
			   throw new SyException("[" + date + "]格式不正确，只能为[yyyymmdd]长度为8的格式！");
		   }
		   //进行转换
		   String strDate = date.substring(0, 4) + "-" + date.substring(4, 6) + "-" +date.substring(6, 8);
		   //检查解析后的字符串是否是日期格式
		   if(!isDate(strDate)){
			   throw new SyException("[" + date + "]不是一个日期，请检查！");
		   }
		   return strDate;
	   }
	   /**
	    * websevice 日期类型 转换 add by hyr 20120320
	    * @param date
	    * @return
	    * @throws Exception
	    */
	   public static javax.xml.datatype.XMLGregorianCalendar getXMLGregorianCalendar(java.util.Date date) throws Exception
	   {
		   Calendar calendar = Calendar.getInstance();
		   calendar.setTime(date);
		   javax.xml.datatype.DatatypeFactory dtf = javax.xml.datatype.DatatypeFactory.newInstance();
		   return dtf.newXMLGregorianCalendar(
		   calendar.get(Calendar.YEAR),
		   calendar.get(Calendar.MONTH)+1,
		   calendar.get(Calendar.DAY_OF_MONTH),
		   calendar.get(Calendar.HOUR),
		   calendar.get(Calendar.MINUTE),
		   calendar.get(Calendar.SECOND),
		   calendar.get(Calendar.MILLISECOND),
		   calendar.get(Calendar.ZONE_OFFSET)/(1000*60));
	   }

	/**
	 * 判断日期是否为年初第一天
	 * @param date
	 * @return
	 */
	public static boolean isYearFirstDay(Date date){
		return (getMonth(date)==1) && (getDay(date)==1);
	}
		   
	
	/**
	 * 转换为SQL日期
	 * @param strDate
	 * @return
	 * @throws Exception
	 */
	public static java.sql.Date convertSQLDate(String strDate) throws Exception {
		String format = null;
		if(strDate.indexOf("-")>0){
			format = "yyyy-MM-dd";
		}else if(strDate.indexOf("/")>0){
			format = "yyyy/MM/dd";
		}else{
			format = "yyyyMMdd";
		}
		SimpleDateFormat sd = new SimpleDateFormat(format);
		return new java.sql.Date(sd.parse(strDate).getTime());
	}
	
	/**
	 * 比较两个日期大小
	 * @param startDate
	 * @param endDate
	 * @return
	 * @throws Exception
	 */
	public static int compareTime(String startDate,String endDate) throws Exception{
		Date stDate = toDate(startDate);
		Date enDate = toDate(endDate);
		if(stDate.getTime()==enDate.getTime()){
			return 0;
		}else if(stDate.getTime()<enDate.getTime()){
			return 1;
		}else{
			return 2;
		}
	}
	
	/**
	 * 获取当前日期上月的最后一天
	 * 
	 * @param newDate (2012-03-06)
	 * @return Date (2012-02-29)
	 */
	public static Date getPreMonthLastDay(Date newDate) throws Exception {
		return DateUtil.getMonthLastDay(DateUtil.addMonth(newDate, -1));
	}
	
	/**
	 * 获取当前日期上年的最后一天
	 * 
	 * @param newDate (2012-03-06)
	 * @return Date (2011-12-31)
	 */
	public static Date getPreYearLastDay(Date newDate) throws Exception {
		Date tDate = DateUtil.addYear(newDate,-1);
		int tYear = DateUtil.getDateItems(tDate,Calendar.YEAR);
		return DateUtil.strConvertDate(String.valueOf(tYear)+"-12-31");
	}
	

//	public static void main(String args[]) throws Throwable {
//		Date tDate = addYear(new Date(),-1);
//		int tYear = getDateItems(tDate,Calendar.YEAR);
//		System.out.println("==============="+strConvertDate(String.valueOf(tYear)+"-12-31"));
//		String tempDate = "2012-03-06";
//		Date fdate = getMonthLastDay(addMonth(DateUtil.strConvertDate(tempDate), -1));
//		System.out.println("+++++++++++++++"+fdate);
//		System.out.println("+++++++========"+dateDiff((strConvertDate(tempDate)),new Date()));
//		
//	}
	
	/**
	 * 获取当前日期所处季度的最后一天
	 * 
	 * @param newDate (2012-03-06)
	 * @return Date (2011-12-31)
	 */
	public static Date getJiduLastDay(Date newDate) throws Exception {
		int month=DateUtil.getMonth(newDate);
		int year=DateUtil.getYear(newDate);
		String lDate="";
		if(1<=month&&month<=3){
			lDate=year+"-3-31";
		}else if(4<=month&&month<=6){
			lDate=year+"-6-30";
		}else if(7<=month&&month<=9){
			lDate=year+"-9-30";
		}else if(10<=month&&month<=12){
			lDate=year+"-12-31";
		}
		return DateUtil.strConvertDate(lDate);
	}
	/**
	 * 获取当前日期所处季度的第一天
	 * 
	 * @param newDate (2012-03-06)
	 * @return Date (2011-12-31)
	 */
	public static Date getJiduFirstDay(Date newDate) throws Exception {
		int month=DateUtil.getMonth(newDate);
		int year=DateUtil.getYear(newDate);
		String lDate="";
		if(1<=month&&month<=3){
			lDate=year+"-1-1";
		}else if(4<=month&&month<=6){
			lDate=year+"-4-1";
		}else if(7<=month&&month<=9){
			lDate=year+"-7-1";
		}else if(10<=month&&month<=12){
			lDate=year+"-10-1";
		}
		return DateUtil.strConvertDate(lDate);
	}
	
	
	/**
	 * 将时间格式化为字符串
	 * 
	 * @param dt
	 * @param dtfmt
	 * @return
	 */
	public static String dateConvertFormat(Date dt, DateFormat dtfmt) {
		return dtfmt.format(dt);
	}
	
	/**
	 * 得到当前时间字符串
	 * 
	 * @return
	 */
	public static String getSysTime(DateFormat format) {
		return format.format(new Date());
	}
	
	
	/**
	 * 比较时间大小
	 * @param date1
	 * @param date2
	 * @return  true  
	 */
	public static boolean getCompareTime(Date date1,Date date2){
		boolean flag = false;
		String s1= dateConvertStr(date1,FORMAT_yyyy_MM_dd_HH_mm_ss);
		String s2= dateConvertStr(date2,FORMAT_yyyy_MM_dd_HH_mm_ss);
		/*String s1="2008-02-01 09:12:09";
		String s2="2008-01-29 09:12:11";*/
		java.text.DateFormat df=new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		java.util.Calendar c1=java.util.Calendar.getInstance();
		java.util.Calendar c2=java.util.Calendar.getInstance();
		try {
			c1.setTime(df.parse(s1));
			c2.setTime(df.parse(s2));
		} catch (Exception e) {
			System.err.println("格式不正确");
			// TODO: handle exception
		}
		int result=c1.compareTo(c2);
		if(result>=0){
			flag = true;
		}else{
			flag = false;
		}
		return flag;
		
	}
	
	public static void main(String[] args) {
		getCompareTime(new Date(),new Date());
	}
}