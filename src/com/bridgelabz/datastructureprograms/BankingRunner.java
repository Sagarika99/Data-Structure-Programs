package com.bridgelabz.datastructureprograms;

import java.util.Scanner;

public class BankingRunner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Banking cashcounter = new Banking<>();
		
		Integer Balance = 10000;
		while(true) {
			System.out.println("Enter Name: ");
			String name = sc.next();			
			MyNode personName = new MyNode(name);
			cashcounter.enqueue(personName);
			System.out.println("1.Add people 2.Exit");
			int choice = sc.nextInt();
			if (choice==2) {
				break;
			}
		}
		cashcounter.dequeue(Balance);
	}
}
