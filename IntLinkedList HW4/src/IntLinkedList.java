// Homework 4 part a - CS 2336.0U1
// Programmer: Stephen-Michael Brooks
// Description:
// This program compares iteration times between get() and Iterator in a LinkedList.

import java.util.Iterator;
import java.util.LinkedList;


public class IntLinkedList {
	public static void main(String[] args) {
		LinkedList IntList = new LinkedList();
		
		for(int i = 0; i < 5000000; i++) {
			IntList.add(i);
		}
		
		int size = IntList.size();
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < size; i++) {
			Object x = IntList.get(i);
		}
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("get time: " + totalTime);
		// get time: 210769 ms
		
		Iterator<Integer> it = IntList.iterator();
		startTime = System.currentTimeMillis();
		while(it.hasNext()) {
			Object x = it.next();
		}
		endTime = System.currentTimeMillis();
		totalTime = endTime - startTime;
		System.out.println("iterator time: " + totalTime);
		// iterator time: 4 ms
	}
}
