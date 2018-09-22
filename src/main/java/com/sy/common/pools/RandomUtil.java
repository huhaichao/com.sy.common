package com.sy.common.pools;

import java.util.Random;

public class  RandomUtil {
	/**
     * 获取count个随机数
     * @param count 随机数个数
     * @return
     */
    public static String getCode(int count){
        StringBuffer sb = new StringBuffer();
        String str = "0123456789";
        Random r = new Random();
        for(int i=0;i<count;i++){
            int num = r.nextInt(str.length());
            sb.append(str.charAt(num));
            str = str.replace((str.charAt(num)+""), "");
        }
        return sb.toString();
    }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomUtil t = new RandomUtil();
        System.out.println(t.getCode(4));
	}

}
