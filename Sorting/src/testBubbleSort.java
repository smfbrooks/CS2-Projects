import java.util.Comparator;
import java.util.Random;


public class testBubbleSort {

	/*public static void main(String[] args) {
		Integer[] list = new Integer[10000];
		int size = list.length;
		Random r = new Random();
		
		for (int i = 0; i < size; i++)
			list[i] = r.nextInt(10000);
		
		for (int i = 0; i < size; i++) {
			if (i % 500 == 0)
				System.out.print(list[i].toString() + " ");
		}
		
		Comparator<Integer> comp = Comparator.naturalOrder();
		bubbleSort(list, comp);
		
		System.out.println("\n\n");
		
		for (int i = 0; i < size; i++) {
			if (i % 500 == 0)
				System.out.print(list[i].toString() + " ");
		}

	}*/
	
	public static <E extends Comparable> void bubbleSort(E[] list) {
		boolean didSwap = true;
		int size = list.length;
		
		for (int j = 1; j < size && didSwap; j++) {

			for (int i = 0; i < size - 1; i++) {
				if (list[i].compareTo(list[i + 1]) > 0) {
					// swap elements i and i+1
					E temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					didSwap = true; // a swap was made
				}
			
			}
		}
	}
	
	public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator) {
		boolean didSwap = true;
		int size = list.length;
		
		for (int j = 1; j < size && didSwap; j++) {

			for (int i = 0; i < size - 1; i++) {
				if (comparator.compare(list[i], list[i + 1]) > 0) {
					// swap elements i and i+1
					E temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					didSwap = true; // a swap was made
				}
			
			}
		}
	}
}
