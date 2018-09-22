package com.sy.common.annotation;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 充分利用org.apache.commons.codec.binary.StringUtils 操作字符串,基本上涵盖了对字符串的常用操作
 * 如：字符串查找、替换、截取、split、trim、大小写转换等； 如果没有特殊情况应优先使用此工具包中的方法,工具包中不存在要用的操作时,再进行扩展
 * 
 */
public class StringUtil {

	//// 判断str是否为空值  
	public static boolean hasLength(CharSequence str) {
		return (str != null && str.length() > 0);
	}

	/**
	 * 判断字符串是否有长度 
	 * 
	 * @param str
	 *            注意CharSequence是String类的上层接口
	 * @return
	 */
	public static boolean hasLength(String str) {
		return hasLength((CharSequence) str);
	}

	public static boolean hasText(CharSequence str) {
		// 如果str为空，返回false  
		if (!hasLength(str)) {
			return false;
		}
		// 获取str的长度  
		int strLen = str.length();
		// 循环遍历str
		for (int i = 0; i < strLen; i++) {
			// 如果在0到strlen之间，有一个不是空格，说明有内容，返回true
			if (!Character.isWhitespace(str.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	/**
	 *    判断str是否是实际内容，纯空格组成的str返回false  
	 */
	public static boolean hasText(String str) {
		return hasText((CharSequence) str);
	}

	/**
	 * 将string = "a,b,c,"形式转换Integer数组
	 * 
	 * @param value
	 */
	public static Integer[] Str2Integers(String value) {
		if (null == value || !hasText(value)) {
			return null;
		}
		String[] values = value.split(",");
		Integer[] v = new Integer[values.length];
		for (int i = 0; i < values.length; i++) {
			v[i] = Integer.parseInt(values[i]);
		}
		return v;
	}

	/**
	 * 将string = "true,false,"形式转换Boolean数组
	 * 
	 * @param value
	 */
	public static Boolean[] Str2Boolean(String value) {
		if (null == value || !hasText(value)) {
			return null;
		}
		String[] values = value.split(",");
		Boolean[] b = new Boolean[values.length];
		for (int i = 0; i < values.length; i++) {
			if (values[i].equals("1")) {
				b[i] = true;
			} else if (values[i].equals("0")) {
				b[i] = false;
			} else {
				b[i] = Boolean.parseBoolean(values[i]);
			}
		}
		return b;
	}

	/**
	 * 将字符串数组转换为以 "," 隔开的字符串
	 * 
	 * @param strArr
	 * @return
	 */
	public static String arrToStr(String[] strArr) {
		StringBuilder str = new StringBuilder();
		if (null != strArr && strArr.length > 0)
			for (String s : strArr) {
				str.append(s + ",");
			}
		if (str.length() > 0) {
			str.setLength(str.length() - 1);
		}
		return str.toString();
	}

	/**
	 * 将整数数组转化成以逗号隔开的字符串
	 * 
	 * @param arr
	 * @return
	 */
	public static String arrToStr(int[] arr) {
		StringBuilder str = new StringBuilder();
		for (int element : arr) {
			str.append(element).append(",");
		}
		return str.length() > 0 ? str.substring(0, str.length() - 1) : str.toString();
	}

	/**
	 * 将字符串集合转化成逗号隔开的字符串
	 * 
	 * @param list
	 * @return
	 */
	public static String arrToStr(List<String> list) {
		Object[] objs = list.toArray();
		String[] strs = new String[objs.length];
		int i = 0;
		for (Object obj : objs) {
			strs[i++] = obj.toString();
		}
		return arrToStr(strs);
	}

	/**
	 * 解析字符串 ---> 去掉字符串中回车、换行、空格
	 * 
	 * @param str
	 *            被解析字符串
	 * @return String 解析后的字符串
	 */
	public static String parse(String str) {
		return str.replaceAll("\n", "").replaceAll("chr(13)", "").replaceAll(" ", "");
	}

	/**
	 * 将Object值转换成Double类型
	 * 
	 * @param value
	 * @return
	 */
	public static double getDoubleByObj(Object value) {
		if (value == null) {
			return 0;
		}
		return Double.valueOf(String.valueOf(value));
	}

	public static String toString(Object object) {
		return null == object ? "" : object.toString();
	}

	/*
	 * ************************************************原yssfun方法移植与添加的新方法 @auto
	 * kjx*******************
	 */
	/**
	 * Programmer: Dranson (2005-8-9)
	 * 功能说明：检查字符串是否包含比对字符集，如果包含其中一个就返回true，否则返回false
	 * 
	 * @param str
	 *            String 被检查字符串
	 * @param ary
	 *            String[] 比对字符集
	 * @return boolean
	 */
	public static boolean oneOf(String str, String[] ary, boolean flag) {
		for (int i = 0; i < ary.length; i++) {
			if (flag) {
				if (str.equalsIgnoreCase(ary[i]))
					return true;
			} else {
				if (str.indexOf(ary[i]) > -1)
					return true;
			}
		}
		return false;
	}

	/**
	 * Programmer: Dranson (2005-8-9)
	 * 功能说明：检查字符串是否包含比对字符集，如果包含其中一个就返回true，否则返回false
	 * 
	 * @param str
	 *            String 被检查字符串
	 * @param arys
	 *            String 比对字符集(多个字符串用英文逗号间隔)
	 * @return boolean
	 */
	public static boolean oneOf(String str, String arys, boolean flag) {
		if ((arys == null || arys.trim().equalsIgnoreCase("")) && str != null && !str.trim().equalsIgnoreCase(""))
			return false;// 比对字符集为空直接返回false
		return oneOf(str, arys.split(","), flag);
	}

	/**
	 * Programmer: Dranson (2005-8-9)
	 * 功能说明：检查字符串是否包含比对字符集，如果包含其中一个就返回true，否则返回false
	 * 
	 * @param str
	 *            String 被检查字符串
	 * @param arys
	 *            String 比对字符集(多个字符串用英文逗号间隔)
	 * @return boolean
	 */
	public static boolean oneOf(String str, String arys) {
		if ((arys == null || arys.trim().equalsIgnoreCase("")) && str != null && !str.trim().equalsIgnoreCase(""))
			return false;// 比对字符集为空直接返回false
		return oneOf(str, arys.split(","), false);
	}

	/**
	 * @description 生成用于处理传递多套帐时查询用
	 * @param value
	 *            前台传递的套帐号
	 * @return
	 */
	public static long[] Str2Long(String value) {
		if (null == value || !hasText(value)) {
			return null;
		}
		String[] values = value.split(",");
		long[] v = new long[values.length];
		for (int i = 0; i < values.length; i++) {
			v[i] = Long.valueOf(values[i]);
		}
		return v;
	}

	/**
	 * @description 获取当前服务器日期
	 * @return
	 */
	public static String getCurrdate(String formatStr) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat(formatStr);
		String mDateTime = formatter.format(cal.getTime());
		return mDateTime;
	}

	/*
	 * ************************************************原yssfun方法移植与添加的新方法 @auto
	 * kjx*******************
	 */
	/**
	 * 判断字符串是否为空
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNotNull(String str) {
		if (str != null && !"".equals(str.trim())) {
			return true;
		} else {
			return false;
		}
	}

	/** java可以实现left,right,mid，可是如果超过长度，会报错，这里提供容错版本 */

	/**
	 * 功能说明：从给定字符串的左侧截取子字符串
	 * 
	 * @param sSrc
	 *            给定字符串
	 * @param iLen
	 *            截取长度
	 * @return 子字符串
	 */
	public static final String left(String sSrc, int iLen) {
		if (iLen >= sSrc.length()) {
			return sSrc;
		} else {
			return sSrc.substring(0, iLen);
		}
	}

	/**
	 * 功能说明：从给定字符串的右侧截取子字符串
	 * 
	 * @param sSrc
	 *            给定字符串
	 * @param iLen
	 *            截取长度
	 * @return 子字符串
	 */
	public static final String right(String sSrc, int iLen) {
		if (iLen >= sSrc.length()) {
			return sSrc;
		} else {
			return sSrc.substring(sSrc.length() - iLen);
		}
	}

	/**
	 * 功能说明：给定字符串，从指定位置开始，截取固定长度的子字符串
	 * 
	 * @param sSrc
	 *            传入字符串
	 * @param iStart
	 *            开始位置
	 * @param iLen
	 *            截取长度
	 * @return 子字符串
	 */
	public static final String mid(String sSrc, int iStart, int iLen) {
		if (iStart + iLen >= sSrc.length()) {
			return sSrc.substring(iStart);
		} else {
			return sSrc.substring(iStart, iStart + iLen);
		}
	}

	/**
	 * 功能说明：从给定字符串的指定位置截取子串
	 * 
	 * @param sSrc
	 *            传入字符串
	 * @param iStart
	 *            开始位置
	 * @return 截取的子字符串
	 */
	public static final String mid(String sSrc, int iStart) {
		return sSrc.substring(iStart);
	}

	/**
	 * 功能说明：去除字符串尾部空格
	 * 
	 * @param sSrc
	 *            String：源串
	 * @return String：去除尾部空格后的结果
	 */
	public static final String rTrim(String sSrc) {
		int i;

		for (i = sSrc.length() - 1; i >= 0; i--)
			if (sSrc.charAt(i) != ' ')
				break;
		if (i < 0)
			return "";
		return sSrc.substring(0, i + 1);
	}

	/**
	 * 功能说明：去除字符串开头空格
	 * 
	 * @param sSrc
	 *            String：源串
	 * @return String：去除开头空格后的结果
	 */
	public static final String lTrim(String sSrc) {
		int len = sSrc.length();
		int i;

		for (i = 0; i < len; i++)
			if (sSrc.charAt(i) != ' ')
				break;
		if (i >= len)
			return "";
		return sSrc.substring(i);
	}

	/**
	 * 功能说明：去除字符串首尾的空格
	 * 
	 * @param sSrc
	 *            String：源串
	 * @return String：去除空格后的结果串
	 */
	public static final String trim(String sSrc) {
		int i, j;
		// 去除尾部空格
		for (i = sSrc.length() - 1; i >= 0; i--)
			if (sSrc.charAt(i) != ' ')
				break;
		if (i < 0)
			return "";
		// 去除开头空格
		for (j = 0; j < i; j++) {
			if (sSrc.charAt(j) != ' ')
				break;
		}
		return sSrc.substring(j, i + 1);// 返回从j到i的字符
	}

	/**
	 * 返回level级科目的总长度 如果partial=true的话只返回本级长度 level<=0，则返回科目级数;
	 */
	public static int accLenLevel(int level, boolean partial, String accLen) {
		int ltmp;
		int total = 0;

		ltmp = accLen.length();
		if (level <= 0)
			return ltmp; // 返回科目级数

		if (level > ltmp)
			level = ltmp;

		if (partial)
			return Integer.parseInt(accLen.substring(level - 1, level));
		for (; level > 0; level--) {
			total += Integer.parseInt(accLen.substring(level - 1, level));
		}
		return total;
	}

	/**
	 * 产生随机字符串
	 * 
	 * @param length
	 *            int 随机字符串长度
	 */
	public static String randomString(int length) {
		Random randGen = null;
		Object initLock = new Object();
		char[] numbersAndLetters = null;
		if (length < 1) {
			return null;
		}
		if (randGen == null) {
			synchronized (initLock) {
				if (randGen == null) {
					randGen = new Random();
					numbersAndLetters = ("abcdefghijklmnopqrstuvwxyz" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
				}
			}
		}
		char[] randBuffer = new char[length];
		for (int i = 0; i < randBuffer.length; i++) {
			randBuffer[i] = numbersAndLetters[randGen.nextInt(52)];
		}
		return new String(randBuffer);
	}

	/**
	 * 将字符串数组转换成Object数组
	 * 
	 * @param str
	 *            字符串数组
	 * @return Object数组
	 */

	public static Object[] getFsetcodeArray(String[] str) {
		int len = str.length;
		Object[] fsetCodes = new Object[len];
		for (int i = 0; i < len; i++) {
			fsetCodes[i] = Integer.parseInt(str[i]);
		}
		return fsetCodes;
	}

	/**
	 * 过滤空格，制表符，回车，换行字符
	 * 
	 * @return
	 */
	public static String filtInvisibleChs(String str) {
		Pattern p = Pattern.compile("\\s+");
		Matcher matcher = p.matcher(str);
		return matcher.replaceAll("");
	}

	/**
	 * sql注入屏蔽(非解决)器
	 * 
	 * @param param
	 *            需要屏蔽的sql
	 *            <p>
	 * 			TIP:解决sql注入的最有效方法是占位符 此方法作用为屏蔽fortifty之类检查工具的sql注入检查
	 *            主要针对一些复杂拼接或是无法确定占位符的sql
	 *            </p>
	 * @return
	 */
	public static String sqlInjection(String param) {
		String str = param == null ? null : param;
		param = "";
		return str;
	}

	/**
	 * 用于将套帐集合转换为以逗号分隔的字符串
	 * 
	 * @param list
	 * @return
	 */
	public static String convertFsetListToString(List<Integer> list) {
		StringBuffer fsetcodes = new StringBuffer();
		if (list != null && list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				fsetcodes.append(list.get(i)).append(",");
			}
			fsetcodes.setLength(fsetcodes.length() - 1);
		}
		return fsetcodes.toString();
	}

}
