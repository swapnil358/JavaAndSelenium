package JavaProgramPracticeNaveenSeries;

import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {

		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter number :");
		
		int num = reader.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}
		
	}

}
