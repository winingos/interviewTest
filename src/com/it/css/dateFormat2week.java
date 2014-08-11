package com.it.css;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class dateFormat2week {
	Date date = new Date();
	SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat dfw = new SimpleDateFormat("yyyy'W'ww");
	SimpleDateFormat dfwoD = new SimpleDateFormat("yyyy'W'wwEEE");
	
	@Test
	public void d2String() {
		System.out.println(df.format(date));
	}
	@Test
	public void String2w(){
		
		String dString= df.format(date);
		System.out.println(dfwoD.format(date));
		System.out.println(dfwoD.getTimeZone());
	}
	
	
}
