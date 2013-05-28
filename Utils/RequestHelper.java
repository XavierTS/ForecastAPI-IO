package com.Utils;

public class RequestHelper {

	public static String formatExcludeString(Exclude[] exclude) {

		StringBuilder temp = new StringBuilder();

		for (Exclude ex : exclude) {
			temp.append(ex + ",");
		}

		temp.deleteCharAt(temp.length() - 1);

		return temp.toString();
	}

}
