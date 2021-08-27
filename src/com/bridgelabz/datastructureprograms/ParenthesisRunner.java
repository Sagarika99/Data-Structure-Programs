package com.bridgelabz.datastructureprograms;

public class ParenthesisRunner<K> {

	public static void main(String[] args) {
		
		Parenthesis parenthesis = new Parenthesis<>();
		String expression = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		
		for(int i=0; i<expression.length();i++) {
			char ch = expression.charAt(i);
			if (ch == '(') {
				MyNode newnode = new MyNode<>(ch);
				parenthesis.push(newnode);
			}
			else if(ch == ')') {
				parenthesis.pop();
			}
		}
		if (parenthesis.isEmpty()) {
			System.out.println("Expression is balanced");
			//System.out.println(expression);
		}
		else {
			System.out.println("Expression is not balanced");
		}
	
	}
}
