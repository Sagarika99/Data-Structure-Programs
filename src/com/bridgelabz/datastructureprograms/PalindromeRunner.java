package com.bridgelabz.datastructureprograms;

import java.util.Scanner;

public class PalindromeRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PalindromeChecker palindrome = new PalindromeChecker<>();
		
		System.out.println("Enter String to check Palindrome : ");
		String checkStrRear = sc.nextLine();
		
		for (int  i=0; i<checkStrRear.length(); i++) {
			palindrome.addRear(new MyNode(checkStrRear.charAt(i)));
		}
		System.out.println(checkStrRear);
		palindrome.printPalindrome();
		String checkStrFront = palindrome.removeFront();
		System.out.println(checkStrFront);
		
		if (checkStrRear.equals(checkStrFront)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
	}
}
