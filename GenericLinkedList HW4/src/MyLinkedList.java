// Homework 4 part b - CS 2336.0U1
// Programmer: Stephen-Michael Brooks
// Description:
// This program defines an Iterable linked list class.

import java.util.Iterator;
import java.util.NoSuchElementException;


public class MyLinkedList<T> implements Iterable<T> {
	private Node<T> head, tail;
	private int size;				// total size of the list
	
	public MyLinkedList() {
		head = tail = null;
		size = 0;
	}
	
	public T get(int index) {
		// check for empty list
		if (head == null) throw new IndexOutOfBoundsException();
		
		Node<T> temp = head;
		for (int i = 0; i < index; i++)
			temp = temp.next;
		
		// index given was too high
		if (temp == null) throw new IndexOutOfBoundsException();
		
		return temp.data;
	}
	
	public void add(T e) {
		// list is not empty
		if (head != null) {
			head = new Node<T>(e, head);
		} else // list is empty
			head = tail = new Node<T>(e, null);
		
		size++;
	}
	
	public int getSize() {
		return size;
	}
	
	@Override
	public Iterator<T> iterator() {
		return new MyLinkedListIterator();
	}

	
	/* ******************
	 * Node inner class *
	 * ******************/
	private class Node<T> {
		private T data;			// stores list data
		private Node<T> next;	// points to next node
		
		public Node(T data, Node<T> next) {
			this.data = data;
			this.next = next;
		}
	}
	
	/* **********************************
	 * MyLinkedListIterator inner class *
	 * **********************************/
	private class MyLinkedListIterator implements Iterator<T> {
		private Node<T> nextNode;
		
		public MyLinkedListIterator() {
			nextNode = head;
		}
		
		public boolean hasNext() {
			return nextNode != null;
		}

		public T next() {
			// make sure next exists
			if(!hasNext()) throw new NoSuchElementException();
			T data = nextNode.data;
			nextNode = nextNode.next;
			return data;
		}
		
	}
}
