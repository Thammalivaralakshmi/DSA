//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest
package com.vara;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values: ");
		int principal=sc.nextInt();
		int time=sc.nextInt();
		int rate=sc.nextInt();
		System.out.println("Simple Interest(SI) : "+((principal*time*rate)/100));
		
		sc.close();
	}
	

}
