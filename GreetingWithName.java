package com.vara;

import java.util.Scanner;

public class GreetingWithName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println("Good Morning! "+name);
		sc.close();
	}

}
