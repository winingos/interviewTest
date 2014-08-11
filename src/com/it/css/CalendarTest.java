package com.it.css;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 * ��ʱ����Ҫ�о�һ��calendar���÷�������Ҫ��һ��ʹ��java�����жϸ����������Ƿ���
 * �����ڼ��գ��ķ�������������ð�������
 *
 */
public class CalendarTest {

	
	/**
	 * test�������ݵ��÷�
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
//		�жϵ�ǰ�����Ƿ�����ĩ��
		if (cader.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
			cader.add(Calendar.DAY_OF_MONTH, 2);
		}
		if (cader.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			cader.add(Calendar.DAY_OF_MONTH, 1);
		}
		
		System.out.println(sdf.format(cader.getTime()));

	}

}
