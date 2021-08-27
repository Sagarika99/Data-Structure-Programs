package com.bridgelabz.datastructureprograms;

public interface INode <K> {

	public K getKey();
	public void setKey(K key);
	
	public INode getNext();
	public void setNext(INode next);
}
