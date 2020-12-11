package JavaProgramPracticeNaveenSeries;

public class SwapNumber {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("Before swapping: ");
		System.out.println("a:" + a);
		System.out.println("b:" + b);

		int temp;

		temp = a;
		a = b;
		b = temp;

		System.out.println("After swapping: ");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		
		//without temp variable
		

		System.out.println("without temp variable : ");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		

		a = a-b; //-10
		b = a+b; //10
		a = b-a; //20
		
		
	}

}
