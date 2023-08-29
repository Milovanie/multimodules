package com.lang3s;

import org.apache.commons.lang3.StringUtils;

public class LangString {

	public static void main(String[] args) {
		String str = "   hello world   ";
		LangString langString = new LangString(); 
		// isEmpty() example
		boolean empty = langString.isEmptys(str);
		System.out.println("Is the string empty? " + empty);

		// isBlank() example
		boolean blank = langString.isBlanks(str);
		System.out.println("Is the string blank? " + blank);

		// trim() example
		String trimmed = langString.trims(str);
		System.out.println("The trimmed string is: " + trimmed);

		// substring() example
		String substring = langString.substringas(str, 2, 7);
		System.out.println("The substring is: " + substring);

 
	}

	public   String substringas(String str , int a, int b) {
		return StringUtils.substring(str, a, b);
	}

	public   String trims(String str) {
		return StringUtils.trim(str);
	}

	public   boolean isBlanks(String str) {
		return StringUtils.isBlank(str);
	}

	 public     boolean isEmptys(String str) {
		return StringUtils.isEmpty(str);
	}

}
