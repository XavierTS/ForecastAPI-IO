package com.Utils;

import java.util.Calendar;

public class TimeConvertion {

	public static Calendar toDate(long unixTime) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(unixTime * 1000);
		return cal;
	}

	public static long toUnixTime(Calendar cal) {
		return cal.getTimeInMillis()/1000;
	}
}
