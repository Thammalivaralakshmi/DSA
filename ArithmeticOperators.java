//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package com.vara;

import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the operator: ");
		char operator=sc.next().charAt(0);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if(operator=='+') System.out.println("Addition of two numbers : "+(num1+num2));
		if(operator=='-') System.out.println("Substraction of two numbers : "+(num1-num2));
		if(operator=='*') System.out.println("Multiplication of two numbers : "+(num1*num2));
		if(operator=='/') System.out.println("Division of two numbers : "+(num1/num2));
		
		
		sc.close();

	}

}
