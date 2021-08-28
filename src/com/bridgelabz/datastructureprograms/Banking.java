package com.bridgelabz.datastructureprograms;

import java.util.Scanner;

public class Banking<K> {
	private INode<K> head;
	private INode<K> tail;
	
	public Banking(){
		this.head=null;
		this.tail=null;
	}
	public void enqueue(INode newNode) {
		append(newNode);
	}
	
	public void append(INode newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		}
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
	
	public void delete() {
		INode tempNode = head.getNext();
		this.head = tempNode;
	}
	
	public void dequeue(Integer Balance) {
		Integer cash = 0;
		while(head != null) {
			System.out.println("Queue: ");
			printQueue();
			cash = balanceAvailable(Balance);
			if (Balance != cash) {
				Balance = cash;
				delete();
			}
		}
	}
		
	public Integer balanceAvailable(Integer Balance) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Deposit cash 2.Withdraw cash");
		int choice = sc.nextInt();
		if (choice==1) {
			System.out.println("how much much to deposit:");
			int depositCash = sc.nextInt();
			Balance += depositCash;
			System.out.println(Balance);
			System.out.println("Removed: "+head.getKey());
		}
		else {
			System.out.println("how much much to withdraw:");
			int withdrawCash = sc.nextInt();
			if(withdrawCash < Balance) {
				Balance -= withdrawCash;
				System.out.println(Balance);
				System.out.println("Removed: "+head.getKey());
			}
			else {
				System.out.println("Not sufficient balance availabel "+Balance);
			}
		}
		return Balance;
	}
	
	public void printQueue() {
		StringBuffer printformat = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while (tempNode != null) {
			printformat.append(tempNode.getKey());
			if (tempNode != tail) {
				printformat.append("-->");
			}
			tempNode = tempNode.getNext();
		}
		System.out.println(printformat);
	}
	
	

}
