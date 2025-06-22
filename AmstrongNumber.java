//To find Armstrong Number between two given number.
package com.vara;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int original=num;
		int sum=0;
		int length=Integer.toString(num).length();
		while(num>0) {
			int digit=num%10;
			sum+=Math.pow(digit, length);
			num/=10;
			
		}
		if(sum==original) {
			System.out.println("Amstrong Number.");
		}else {
			System.out.println("Not an Amstrong Number.");
		}
		sc.close();
	}

}
