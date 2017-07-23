import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class testRadixSort {

	public static void main(String[] args) {
		int[] list = new int[1000000];
		Random r = new Random();
		
		int size = list.length;
		for (int i = 0; i < size; i++) {
			list[i] = r.nextInt(10000000);
		}
		
		System.out.println("Finished filling list.\n\n");
		
		radixSort(list);
		
		for (int i = 0; i < size; i++) {
			if (i % 100000 == 0)
				System.out.print(list[i] + " ");
		}

	}
	
	public static void radixSort(int[] list) {
		final int NUMBER_OF_BUCKETS = 10;
		
		 // create buckets
		List<Integer>[] bucket = new ArrayList[NUMBER_OF_BUCKETS];
		for (int i = 0; i < bucket.length; i++) {
			bucket[i] = new ArrayList<Integer>();
		}
		
		boolean maxLength = false; // initial condition
		int temp, position = 1;
		while (!maxLength) {
			maxLength = true;
			
			for (Integer x: list) {
				temp = x / position;
				// put element in bucket
				bucket[temp % NUMBER_OF_BUCKETS].add(x);
				if (maxLength && temp > 0)
					// max length not reached
					maxLength = false; // continue until temp is 0
			}
			
			int a = 0; // for indexing buckets
			for (int k = 0; k < NUMBER_OF_BUCKETS; k++) {
				for (Integer x: bucket[k])
					list[a++] = x;
				
				bucket[k].clear(); // clear data from temp array when finished
			}
			
			position *= NUMBER_OF_BUCKETS; // move up a digit
		}
	}
}
