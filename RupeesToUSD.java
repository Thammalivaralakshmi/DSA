package com.vara;

import java.util.Scanner;

public class RupeesToUSD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your money : ");
		int money=sc.nextInt();
		System.out.println("your money "+money+" in US Dollars is : "+(money*0.012));

		sc.close();
	}

}
