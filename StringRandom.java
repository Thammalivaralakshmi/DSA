package com.strings;

import java.util.Random;

public class StringRandom {

	public static void main(String[] args) {
		System.out.println(generate(20));
		
		

	}
	static String generate(int size) {
		Random random= new Random();
		StringBuffer  sb = new StringBuffer(size);
		for(int i=0;i<size;i++) {
			int randomChar= 97 + (int)(random.nextFloat()*26);
			sb.append((char)randomChar);
		}
		return sb.toString();
	}

}
