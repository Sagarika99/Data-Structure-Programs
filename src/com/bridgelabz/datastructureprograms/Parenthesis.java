package com.bridgelabz.datastructureprograms;

public class Parenthesis <K>{

	public INode<K> head;
	public INode<K> tail;
	int index=0;
	
	public Parenthesis() {
		this.head = head;
		this.tail = tail;
	}
	
	public void push(INode newNode) {
		add(newNode);
		index++;
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
	
	public K peek() {
		return this.head.getKey();
	}
	
	public void pop() {
		index--;
		INode tempNode = head.getNext();
		this.head = tempNode;
	}
	
	public boolean isEmpty() {
		if (this.index == 0)
			return true;
		return false;
	}
	
	public void printStack() {
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
