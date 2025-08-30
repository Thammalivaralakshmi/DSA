//To find out whether the given String is Palindrome or not.
package com.vara;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.next();
		String reverse ="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse+=str.charAt(i);
		}
		System.out.println(str);
		System.out.println(reverse);
		if(reverse.equalsIgnoreCase(str)) {
			System.out.println("Palindrome.");
		}
		else System.out.println("Not a Palindrome.");
		sc.close();
	}

}
