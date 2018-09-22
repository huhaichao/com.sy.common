package com.sy.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*DateUtil d = new DateUtil();
		String str = d.getInvalidationTime();
		System.out.println(str);*/
		
		
		Calendar calendar = Calendar.getInstance();
        Date date = new Date(System.currentTimeMillis());
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, 1);
        date = calendar.getTime();
        System.out.println(date);
	}
	
    /**
    * 获得实效时间,当前时间推迟1个月的时间<br>
    * 
    * @return
    */
   private static String getLaterTime(Integer i) {
       String invalidationTime = "";

       Calendar cal = Calendar.getInstance();
       cal.set(Calendar.MONTH, Calendar.MONTH + i);
       invalidationTime = new SimpleDateFormat("yyyy年MM月dd日HH时").format(cal
               .getTime());
       System.out.println("####getInvalidationTime()-->invalidationTime:"
               + invalidationTime);
       return invalidationTime;
   }

}
