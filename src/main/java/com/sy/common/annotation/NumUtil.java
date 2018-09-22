package com.sy.common.annotation;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * 提供高精度的运算支持. 所以函数以double为参数类型，兼容int与float. numberUtils:
 * 包含了字符串转化为数字的操作、最大最小值的比较 字符串是否为数字的判断等
 * 
 */
public class NumUtil {
	private static final int DEF_DIV_SCALE = 16;// 使用double默认精度和vb相同，应该能满足要求

	private NumUtil() {
	}

	/**
	 * 功能说明：提供精确的加法运算。
	 * 
	 * @param v1
	 *            被加数
	 * @param v2
	 *            加数
	 * @return 两个参数的和
	 */
	public static final double add(double v1, double v2) {
		return add(v1, v2, 0, 0, 0, 0, 2);
	}

	/**
	 * 功能说明：提供精确的加法运算。
	 * 
	 * @param v1
	 *            被加数
	 * @param v2
	 *            加数
	 * @param v3
	 *            加数
	 * @return 三个参数的和
	 */
	public static final double add(double v1, double v2, double v3) {
		return add(v1, v2, v3, 0, 0, 0, 3);
	}

	/**
	 * 功能说明：提供精确的加法运算。
	 * 
	 * @param v1
	 *            被加数
	 * @param v2
	 *            加数
	 * @param v3
	 *            加数
	 * @param v4
	 *            加数
	 * @return 四个参数的和
	 */
	public static final double add(double v1, double v2, double v3, double v4) {
		return add(v1, v2, v3, v4, 0, 0, 4);
	}

	/**
	 * 功能说明：提供精确的加法运算。
	 * 
	 * @param v1
	 *            被加数
	 * @param v2
	 *            加数
	 * @param v3
	 *            加数
	 * @param v4
	 *            加数
	 * @param v5
	 *            加数
	 * @return 五个参数的和
	 */
	public static final double add(double v1, double v2, double v3, double v4, double v5) {
		return add(v1, v2, v3, v4, v5, 0, 5);
	}

	/**
	 * 功能说明：提供精确的加法运算。
	 * 
	 * @param v1
	 *            被加数
	 * @param v2
	 *            加数
	 * @param v3
	 *            加数
	 * @param v4
	 *            加数
	 * @param v5
	 *            加数
	 * @param v6
	 *            加数
	 * @return 六个参数的和
	 */
	public static final double add(double v1, double v2, double v3, double v4, double v5, double v6) {
		return add(v1, v2, v3, v4, v5, v6, 6);
	}

	/**
	 * 功能说明：提供精确的加法运算(此方法为底层调用方法)。
	 * 
	 * @param v1
	 *            被加数
	 * @param v2
	 *            加数
	 * @param v3
	 *            加数
	 * @param v4
	 *            加数
	 * @param v5
	 *            加数
	 * @param v6
	 *            加数
	 * @param n
	 *            参数个数
	 * @return n个参数的和
	 */
	private static final double add(double v1, double v2, double v3, double v4, double v5, double v6, int n) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		BigDecimal b3 = null;
		BigDecimal b4 = null;
		BigDecimal b5 = null;
		BigDecimal b6 = null;
		switch (n) {
		case 2:
			return b1.add(b2).doubleValue();
		case 6:
			b6 = new BigDecimal(Double.toString(v6));
		case 5:
			b5 = new BigDecimal(Double.toString(v5));
		case 4:
			b4 = new BigDecimal(Double.toString(v4));
		case 3:
			b3 = new BigDecimal(Double.toString(v3));
		}
		switch (n) {
		case 3:
			return b1.add(b2).add(b3).doubleValue();
		case 4:
			return b1.add(b2).add(b3).add(b4).doubleValue();
		case 5:
			return b1.add(b2).add(b3).add(b4).add(b5).doubleValue();
		case 6:
			return b1.add(b2).add(b3).add(b4).add(b5).add(b6).doubleValue();
		default:
			return 0;
		}
	}

	/**
	 * 功能说明：提供精确的减法运算。
	 * 
	 * @param v1
	 *            被减数
	 * @param v2
	 *            减数
	 * @return 两个参数的差
	 */
	public static final double sub(double v1, double v2) {
		return add(v1, -v2, 0, 0, 0, 0, 2);
	}

	/**
	 * 功能说明：提供精确的减法运算。
	 * 
	 * @param v1
	 *            被减数
	 * @param v2
	 *            减数
	 * @param v3
	 *            减数
	 * @return 三个参数的差
	 */
	public static final double sub(double v1, double v2, double v3) {
		return add(v1, -v2, -v3, 0, 0, 0, 3);
	}

	/**
	 * 功能说明：提供精确的减法运算。
	 * 
	 * @param v1
	 *            被减数
	 * @param v2
	 *            减数
	 * @param v3
	 *            减数
	 * @param v4
	 *            减数
	 * @return 四个参数的差
	 */
	public static final double sub(double v1, double v2, double v3, double v4) {
		return add(v1, -v2, -v3, -v4, 0, 0, 4);
	}

	/**
	 * 功能说明：提供精确的减法运算。
	 * 
	 * @param v1
	 *            被减数
	 * @param v2
	 *            减数
	 * @param v3
	 *            减数
	 * @param v4
	 *            减数
	 * @param v5
	 *            减数
	 * @return 五个参数的差
	 */
	public static final double sub(double v1, double v2, double v3, double v4, double v5) {
		return add(v1, -v2, -v3, -v4, -v5, 0, 5);
	}

	/**
	 * 功能说明：提供精确的减法运算。
	 * 
	 * @param v1
	 *            被减数
	 * @param v2
	 *            减数
	 * @param v3
	 *            减数
	 * @param v4
	 *            减数
	 * @param v5
	 *            减数
	 * @param v6
	 *            减数
	 * @return 六个参数的差
	 */
	public static final double sub(double v1, double v2, double v3, double v4, double v5, double v6) {
		return add(v1, -v2, -v3, -v4, -v5, -v6, 6);
	}

	/**
	 * 提供精确的乘法运算.
	 */
	public static double mul(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));// wuliufu 2012-4-9
															// Double.toString防止精度丢失
		return adjustDouble(b1.multiply(b2).doubleValue());
	}

	/**
	 * 提供精确的乘法运算，并对运算结果截位.
	 * 
	 * @param scale
	 *            运算结果小数后精确的位数
	 */
	public static double mul(double v1, double v2, int scale) {
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return round(adjustDouble(b1.multiply(b2).doubleValue()), scale); // add
																			// by
																			// hyr
																			// 20120626
	}

	public static final double mul(double v1, double v2, double v3) {
		return mul(v1, v2, v3, 1, 1, 1, 3);
	}

	/**
	 * 功能说明：提供精确的乘法运算(此方法为底层调用方法)。
	 * 
	 * @param v1
	 *            被乘数
	 * @param v2
	 *            乘数
	 * @param v3
	 *            乘数
	 * @param v4
	 *            乘数
	 * @param v5
	 *            乘数
	 * @param v6
	 *            乘数
	 * @param n
	 *            参数个数
	 * @return n个参数的积
	 */
	private static final double mul(double v1, double v2, double v3, double v4, double v5, double v6, int n) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		BigDecimal b3 = null;
		BigDecimal b4 = null;
		BigDecimal b5 = null;
		BigDecimal b6 = null;
		double result = 0;

		switch (n) {
		case 2:
			result = b1.multiply(b2).doubleValue();
			break;
		case 6:
			b6 = new BigDecimal(Double.toString(v6));
		case 5:
			b5 = new BigDecimal(Double.toString(v5));
		case 4:
			b4 = new BigDecimal(Double.toString(v4));
		case 3:
			b3 = new BigDecimal(Double.toString(v3));
		}

		switch (n) {
		case 6:
			result = b1.multiply(b2).multiply(b3).multiply(b4).multiply(b5).multiply(b6).doubleValue();
			break;
		case 5:
			result = b1.multiply(b2).multiply(b3).multiply(b4).multiply(b5).doubleValue();
			break;
		case 4:
			result = b1.multiply(b2).multiply(b3).multiply(b4).doubleValue();
			break;
		case 3:
			result = b1.multiply(b2).multiply(b3).doubleValue();

		}
		return adjustDouble(result);
	}

	/**
	 * 提供（相对）精确的除法运算.
	 * 
	 * @see #div(double, double, int)
	 */
	public static double div(double v1, double v2) {
		return div(v1, v2, 15);
	}

	/**
	 * 提供（相对）精确的除法运算. 由scale参数指定精度，以后的数字四舍五入.
	 * 
	 * @param v1
	 *            被除数
	 * @param v2
	 *            除数
	 * @param scale
	 *            表示表示需要精确到小数点以后几位
	 */
	public static double div(double v1, double v2, int scale) {
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}

		BigDecimal b1 = new BigDecimal(String.valueOf(v1));
		BigDecimal b2 = new BigDecimal(String.valueOf(v2));
		return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	/**
	 * 功能说明：Math.pow的结果最多可以有17位有效数字，本函数控制最多15位，和VB的double兼容
	 * 
	 * @param v1
	 *            double
	 * @param v2
	 *            double
	 * @return double
	 */
	public static final double pow(double v1, double v2) {
		return adjustDouble(Math.pow(v1, v2));
	}

	/**
	 * 功能说明：把java产生的double值转换成15位最多有效数字的值，多于小数四舍五入，整数不处理
	 * 
	 * @param v1
	 *            double 要转换的参数值
	 * @return double
	 */
	public static final double adjustDouble(double v1) { // todo 考虑
															// E多少的问题还有div也可能存在问题

		String strRes = String.valueOf(v1).toUpperCase();
		int i, len = strRes.length();
		int e = strRes.lastIndexOf('E'); // 考虑科学记数法!
		int d = strRes.indexOf('.');

		if (len <= DEF_DIV_SCALE || d < 0)
			return v1;

		for (i = 0; i < len; i++)
			if (strRes.charAt(i) >= '1' && strRes.charAt(i) <= '9')
				break;
		i = len - (d > i ? i + 1 : i) - (e >= 0 ? len - e : 0);// 得出有效位数
		if (i >= DEF_DIV_SCALE) {
			if (e < 0)
				v1 = round(v1, len - d - 2 - i + DEF_DIV_SCALE);
			else // 带科学记数法的处理: 先处理E前面的部分，再附加E部分，再转换成double
				v1 = round(v1, e - d - 1 - Integer.parseInt(strRes.substring(e + 1)) - (i - DEF_DIV_SCALE));
		}

		return v1;
	}

	/**
	 * 提供精确的小数位四舍五入处理.
	 * 
	 * @param v
	 *            需要四舍五入的数字
	 * @param scale
	 *            小数点后保留几位
	 */
	public static double round(double v, int scale) {
		if (scale < 0) {
			// daiyh 2012-12-26
			// throw new IllegalArgumentException("The scale must be a positive
			// integer or zero");
			return v;
		}
		BigDecimal b = new BigDecimal(Double.toString(v));
		BigDecimal one = new BigDecimal("1");
		return b.divide(one, scale, BigDecimal.ROUND_HALF_UP).doubleValue();

	}

	/**
	 * 提供精确的小数位四舍五入处理.
	 * 
	 * @param v
	 *            需要四舍五入的数字
	 * @param scale
	 *            小数点后保留几位
	 */
	public static double round(String v, int scale) {
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		BigDecimal b = new BigDecimal(v);
		BigDecimal one = new BigDecimal("1");
		return b.divide(one, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	/**
	 * 提供精确的小数位四舍五入处理.
	 * 
	 * @param v
	 *            需要四舍五入的数字
	 * @param scale
	 *            小数点后保留几位
	 * @param bTrunc
	 *            bTranc=true表示舍去下一位，bTranc=false表示四舍五入
	 * @return
	 */
	public static double round(double v, int scale, boolean bTrunc) {
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		BigDecimal b = new BigDecimal(Double.toString(v));
		BigDecimal one = new BigDecimal("1");
		// return b.divide(one,scale , bTrunc ?BigDecimal.ROUND_HALF_UP:
		// BigDecimal.ROUND_HALF_UP).doubleValue(); daiyh 20120220 截位参数不对
		return b.divide(one, scale, bTrunc ? BigDecimal.ROUND_DOWN : BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	/**
	 * 将数字补全，如123 补成000123
	 * 
	 */
	public static String formatByZero(long num, int length) throws Exception {
		long tempLen = (num + "").length();
		if (tempLen >= length)
			return num + "";
		StringBuffer code = new StringBuffer();
		for (int i = 0; i < length - tempLen; i++) {
			code.append("0");
		}
		code.append(num + "");
		return code.toString();
	}

	/**
	 * @description 考虑有些地方会用到多位相乘法，原方法采用多次调用二位数乘法，这里写一公用方法
	 *              适用场景：多位double数字相乘(采用累计相成方法)
	 * @param num
	 *            保留的小数位数
	 * @param dNum
	 *            待处理数据
	 * @return 多位相乘以后的结果 Double类型
	 */
	public static double mul(int num, Object... dNum) {

		BigDecimal fDecimal = new BigDecimal("0");// 初始化一个空参
		BigDecimal sDecimal = null;
		for (int i = 0; i < dNum.length; i++) {
			if (i == 0) {
				fDecimal = new BigDecimal(String.valueOf(dNum[i]));// 对参数进行第一次赋值
			} else {
				sDecimal = new BigDecimal(String.valueOf(dNum[i]));
				fDecimal = fDecimal.multiply(sDecimal);// 记录累积值
			}
		}
		double reDouble = fDecimal.doubleValue();
		return adjustDouble(num == 0 ? reDouble : fDecimal.setScale(num, BigDecimal.ROUND_HALF_UP).doubleValue());
	}

	// 重构此方法不限制小数位数返回
	public static double mul(Object... dNum) {
		return mul(0, dNum);
	}

	/**
	 * 数字格式化 //注意不一定四舍五入，有时候（偶数后的5）舍5！alex20041124解决这个问题！ 相当于vb中的format，不过只能是数字
	 * 
	 * @param number
	 *            double类型的数字
	 * @param format
	 *            格式
	 * @return 格式化后的字符串
	 */
	public static final String formatNumber(double number, String format) {
		int decs = 0;// 要保留的小数位数

		if (format.trim().length() == 0)
			format = "#0.00";
		int i = format.indexOf(".");
		if (i >= 0) {
			for (decs = ++i; decs < format.length(); decs++) {
				if (format.charAt(decs) != '0' && format.charAt(decs) != '#')
					break;
			}
			decs -= i;
		}
		if (format.indexOf("%") >= 0)
			decs += 2;// 百分比

		return (new DecimalFormat(format)).format(round(number, decs));
	}

	public static String format(String format, double number) {
		DecimalFormat df = new DecimalFormat(format);
		return df.format(number);
	}

	/**
	 * 获取数字类型保留位数格式化工具
	 * 
	 * @param blws
	 *            保留位数
	 * @return
	 * @throws NumberFormatException
	 * @throws YssException
	 */
	public static final String getNumberFormat(int blws) {

		StringBuffer ws = new StringBuffer();
		try {
			ws.append("00");
			for (int i = 3; i <= blws; i++) {
				ws.append("0");
			}
		} catch (NumberFormatException e) {
			return "###0.00############";
		}
		return ("###0." + ws.toString());
	}

	/**
	 * 功能说明：移动加权计算卖出成本
	 * 
	 * @param map:
	 *            持仓数据
	 * @param dSaleAmount:
	 *            卖出数量
	 * @param iCb8ws:
	 *            小数位数
	 * @exception YssException
	 * @return double
	 */
	public static double curOutPrice(double dKcMoney, double dKcAmount, double dSaleAmount, String iCb8ws) {

		double dSalecb = 0;
		if (dKcAmount > dSaleAmount) {
			if (iCb8ws.length() != 0 && !iCb8ws.equalsIgnoreCase("0")) {
				dSalecb = NumUtil.mul(NumUtil.round(NumUtil.div(dKcMoney, dKcAmount), Integer.parseInt(iCb8ws)),
						dSaleAmount, 2);
			} else {
				dSalecb = NumUtil.mul(NumUtil.div(dKcMoney, dKcAmount), dSaleAmount, 2);
			}
		} else {
			// 库存数量要么大于卖出数量，要么相等 相等时卖出成本＝库存金额
			dSalecb = dKcMoney;
		}
		return dSalecb;
	}

	/**
	 * 累积概率分布函数
	 * 
	 * @param number
	 * @return
	 */
	public static double probability(double number) {
		double y = Math.abs(number);
		double y2 = y * y;
		double z = Math.exp(-0.5 * y2) * 0.398942280401432678;
		double p = 0;
		int k = 28;
		double s = -1;
		double fj = k;
		if (y > 3) {
			// 当y>3时
			for (int i = 1; i <= k; i++) {
				p = fj / (y + p);
				fj = fj - 1.0;
			}
			p = z / (y + p);
		} else {
			// 当y<3时
			for (int i = 1; i <= k; i++) {
				p = fj * y2 / (2.0 * fj + 1.0 + s * p);
				s = -s;
				fj = fj - 1.0;
			}
			p = 0.5 - z * y / (1 - p);
		}
		if (number > 0)
			p = 1.0 - p;
		return p;
	}

	// public static void main(String[] args) {
	// System.out.println(mul(2,new Object[]{2.82,3.12,4.145})+"=test1=");
	// System.out.println(NumUtil.curOutPrice(15872866.47, 800000, 400000,
	// "12"));
	// }
}