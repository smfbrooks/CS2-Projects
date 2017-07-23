public class testMain {

	public static void main(String[] args) {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		System.out.println("Finished adding Nodes.");
		
		for (int i = 0; i < 10; i++)
			System.out.print(list.get(i) + " ");
		
		System.out.println("get loop done.");
		
		for (Integer x: list) 
			System.out.print(x + " ");
		
		System.out.println("For each loop done.");
		
		
		System.out.println("Integers done.\n\n");
		
		
	}

}
