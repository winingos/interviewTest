package com.it.css;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 * 有时间需要研究一下calendar的用法，还需要找一个使用java代码判断给定的日期是否是
 * 法定节假日，的方法。这个很有用啊！！！
 *
 */
public class CalendarTest {

	
	/**
	 * test日历数据的用法
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
	
		String date1="2014-06-07 16:18:26";
		String fmrtS="yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(fmrtS);
		Calendar cader = Calendar.getInstance();
		cader.clear();
		cader.setTime(sdf.parse(date1));
		cader.add(Calendar.DAY_OF_MONTH, 1);
//		判断当前日期是否是周末。
		if (cader.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
			cader.add(Calendar.DAY_OF_MONTH, 2);
		}
		if (cader.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			cader.add(Calendar.DAY_OF_MONTH, 1);
		}
		
		System.out.println(sdf.format(cader.getTime()));

	}

}
