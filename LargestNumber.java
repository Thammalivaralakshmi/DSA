//Take 2 numbers as input and print the largest number.
package com.vara;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers : ");
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		if(number1>number2) System.out.println(number1+" is greter than "+number2);
		else System.out.println(number2+" is greter than "+number1);
		
		sc.close();

	}

}
