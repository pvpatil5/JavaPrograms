package day4_CollectionProgram;

import java.util.LinkedList;

public class FirstAndLastElementInLinkedList {
	/*
	 *  How to read first element from LinkedList? 
	 *  How to read last element from LinkedList?
	 */

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
	}
}
