import java.util.Scanner;


public class binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); // sets up to take input
        System.out.print("Enter number: ");
        int num = input.nextInt();
        int num2 = num;
        while(num > 0){
            System.out.println(num + " % 2 = "+(num%2));
            System.out.print(num + " / 2 = ");
            num=num/2;
        }
        
        System.out.println('\n');
        
        while (num2 > 0) {
        	System.out.println(num2 + " % 16 = " + num2%16);
        	System.out.print(num2 + " / 16 = ");
        	num2 = (num2 / 16);
        }
	}
}
