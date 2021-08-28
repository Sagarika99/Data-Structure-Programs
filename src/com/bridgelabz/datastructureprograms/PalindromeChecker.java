package com.bridgelabz.datastructureprograms;

public class PalindromeChecker<K> {

	private INode head;
	private INode tail;
	
	public PalindromeChecker() {
		this.head = head;
		this.tail = tail;
	}
	
	public void addFront(INode newNode) {
		append(newNode);
	}
	
	public void addRear(INode newNode) {
		add(newNode);
	}
	
	public void add(INode newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} 
		else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}		
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
	
	public String removeFront() {
		String reverseStr = "";
		while(head.getNext() != null) {
			reverseStr += String.valueOf(head.getKey());
			INode tempNode = head.getNext();
			head = tempNode;
		}
		reverseStr += String.valueOf(head.getKey());
		return reverseStr;
	}
	
	public String removeRear() {
		String reverseStr = "";
		
		while (head.getNext()!=null) {
			INode temp = head;
			while(temp.getNext().getNext()!=null) {
				temp= temp.getNext();
			}
			reverseStr+=String.valueOf(temp.getNext().getKey());
			temp.setNext(null);
		}
		reverseStr+=String.valueOf(head.getKey());
		
		return reverseStr;
	}
	
	public void printPalindrome() {
		StringBuffer printformat = new StringBuffer("My String: ");
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
