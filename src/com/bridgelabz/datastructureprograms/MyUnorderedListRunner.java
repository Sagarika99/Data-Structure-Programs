package com.bridgelabz.datastructureprograms;
import java.util.Scanner;

public class MyUnorderedListRunner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MyUnorderedList list = new MyUnorderedList<>();
	
		String sentence = "To be or not to be";
		String[] words = sentence.toLowerCase().split(" ");
		
		for (String word : words) {
			MyNode<String> newword = new MyNode<>(word);
			list.add(newword);
		}
		
		MyNode<String> searchNode = new MyNode<>("and");
		
		if(list.search(searchNode.getKey()) == null) {
			 System.out.println("Adding it to the list");
			 list.add(searchNode);
			 list.printList();
		}
		else {
			list.delete(searchNode);
			list.printList();
		}
		
	}
}
