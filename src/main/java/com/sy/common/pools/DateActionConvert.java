package com.sy.common.pools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import ognl.DefaultTypeConverter;

import org.apache.commons.lang.StringUtils;

/**
 * @author wangliang
 * @mail E-mail:wangliang86@yeah.net
 * @name DateActionConvert.java
 * @version 1.0
 */
public class DateActionConvert extends DefaultTypeConverter {
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	static SimpleDateFormat timesdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	static SimpleDateFormat rsdf = new SimpleDateFormat("yyyy-MM-dd");

	@Override
	public Object convertValue(Map arg0, Object arg1, Class arg2) {
		if (arg2.equals(java.util.Date.class) && arg1 != null) {
			String[] strdt = (String[]) arg1;
			System.out.println(strdt[0].length());
			if (strdt[0].length() >= 19) {
				java.util.Date dt = new java.util.Date();
				if (StringUtils.isNotEmpty(strdt[0]))
					dt = this.dateReconvert(strdt[0]);
				return dt;
			} else if (strdt[0].trim().length() != 0) {
				java.util.Date dt = new java.util.Date();
				try {
					if (StringUtils.isNotEmpty(strdt[0])) {
						dt = new SimpleDateFormat("yyyy-MM-dd").parse(strdt[0]);
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
				return dt;
			}
		}
		return null;
	}

	public static Date dateReconvert(String date) {
		try {
			return sdf.parse(date);
		} catch (ParseException e) {
			try {
				return rsdf.parse(date);
			} catch (ParseException e1) {
				e1.printStackTrace();
			}

		}
		return new Date();
	}

}
