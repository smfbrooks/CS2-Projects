// Homework #3 for CS 2336
// Programmer: Stephen-Michael Brooks
// Description:
// a) Recursive function to calculate summation of 1/i from i=1 to 10.
// b) Recursive function that reverses order of numbers.

import java.util.Scanner;
public class Recursion {

	// for part a. a recursive function for a summation of 1/i from i=1 to 10
	public double r1(double i) {
			if (i < 2)
				return 1;
			return 1/i + r1(i-1);
		} // end r1
	
	// for part b. a recursive function that reverses order of numbers
	public static void reverseDisplay(int value) {
		if (value < 10) {
			System.out.print(value);
			return;
		}
		
		System.out.print(value % 10);	// mod by 10
		reverseDisplay(value / 10);		// recursive call dividing by 10
	} // end reverseDisplay

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Recursion test = new Recursion();
		
		// loop to display part a
		for(int count = 1; count <= 10; count++) {
			System.out.println("m(" + count + ") = " + test.r1(count));
		}
		
		// start part b
		System.out.print("Please enter a series of numbers: ");
		int nums = input.nextInt();
		reverseDisplay(nums);
		
		input.close();
	}

}