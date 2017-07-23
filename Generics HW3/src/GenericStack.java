// Homework #3 for CS 2336
// Programmer: Stephen-Michael Brooks
// Description:
// a) A method that returns a new ArrayList that has removed duplicate entries
// b) A method that shuffles and ArrayList

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.RandomAccess;

public class GenericStack {

	
	private static final int SHUFFLE_THRESHOLD = 5;
			
	// for part a - a method that removes duplicate entries in a list
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		for(int i = 0; i < list.size(); i++) {
			E element = list.get(i);	// store element for compare
			int match = 0;				// initialize match to 0
			
			for(int k = 0; k < list.size(); k++) {
				// ignore first match
				if(element == list.get(k))
					match++;
				// second match, remove element
				if(match > 1) {
					match = 1;
					list.remove(k);
				}
			}
		}
		
		return list;
	}
	
	// for part b - shuffles contents of a list
	public static <E> void shuffle(ArrayList<E> list) {
		int size = list.size();			// store size of list for iteration
		Random random = new Random();	// generate random
		
		// if ArrayList is not large
		if(size < SHUFFLE_THRESHOLD || list instanceof RandomAccess) {
			for (int i = size; i > 1; i--)
				swap(list, i-1, random.nextInt(i));
		}
		// the ArrayList is large
		else {
			// change to array for easy manipulation
			Object array[] = list.toArray();
			
			for (int i = size; i > 1; i--)
				swap(array, i - 1, random.nextInt(i));
			
			ListIterator<E> it = list.listIterator();
			for (int i = 0; i < array.length; i++) {
				it.next();
				it.set((E)array[i]);
			}
		}
	}
	
	// swap for part b for lists
	public static void swap(List<?> list, int i, int j) {
		final List l = list;
		l.set(i, l.set(j, l.get(i)));
	}
	
	// swap for part b for arrays
	public static void swap(Object[] array, int i, int j) {
		Object tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
	
	public static <E> void printArrayList(ArrayList<E> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
	
	public static void main(String args[]) {
		ArrayList<Integer> list1 = new ArrayList<Integer>(10);
		ArrayList<String> list2 = new ArrayList<String>(10);
		
		// fill for part a
		list2.add("Computer");
		list2.add("Science");
		list2.add("2336");
		list2.add("is");
		list2.add("for");
		list2.add("learning");
		list2.add("java");
		list2.add("Computer");
		list2.add("java");
		list2.add("!");
		
		// fill for part b
		list1.add(0);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		list1.add(9);
		
		// calls for part a
		removeDuplicates(list2);
		printArrayList(list2);
		
		System.out.print("\n\n");
		
		// calls for part b
		shuffle(list1);
		printArrayList(list1);
	}

}
