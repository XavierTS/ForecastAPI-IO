package com.Utils;

import java.util.Date;

public class TimeConvertion {

	public static Date toDate(long unixTime) {
		return new Date((long) unixTime * 1000);
	}

	public static long toUnixTime(Date date) {
		return date.getTime() / 1000;
	}
}
