package com.strings;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {
		String  str = "vara,sulochana,bhavani,siva,lakshmi,thulasi";
		String[] arr = str.split(",");
		System.out.println(Arrays.toString(arr));

	}

}
