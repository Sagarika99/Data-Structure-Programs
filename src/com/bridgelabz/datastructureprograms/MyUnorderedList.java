package com.bridgelabz.datastructureprograms;

public class MyUnorderedList <K> {
	INode head;
	INode tail;
	
	public MyUnorderedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void add(INode newNode) {
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
	
	public INode search(K key) {
		INode tempNode = this.head;
		int flag = 1;
		while (tempNode != null) {
			if(tempNode.getNext()!=null && tempNode.getNext().getKey().equals(key)) {
				flag = 0;
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		if (flag == 1) {
			return null;
		}
		return null;
	}
	
	public void delete(K key) {
		INode tempNode = head;
		INode prevNode = null;
		
		while(tempNode != null) {
			if (tempNode.getKey().equals(key)) {
				tempNode = tempNode.getNext();
				prevNode.setNext(tempNode);
				break;
			}
			prevNode = tempNode;
			tempNode = tempNode.getNext();
		}
		
	}
	
	public void printList() {
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
