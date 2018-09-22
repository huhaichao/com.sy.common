package com.sy.common.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 将传入的一串数字打乱返回 例如：手机号
 * 
 * @author zbb
 *
 */
public class Shuffle {

	public static String shuffleNumber(String number) {
		StringBuffer buffer = new StringBuffer();
		List<Integer> arr = new ArrayList<Integer>();
		if (number.length() == 0)
			return "";
		char b[] = number.toCharArray();
		for (int i = 0; i < b.length; i++) {
			arr.add(Integer.parseInt(String.valueOf(b[i])));
		}
		Collections.shuffle(arr);
		for (int j : arr)
			buffer.append(j);
		
		return buffer.toString();
	}
	
}
