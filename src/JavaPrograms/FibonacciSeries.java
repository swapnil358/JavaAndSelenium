package JavaPrograms;

public class FibonacciSeries {

	// https://youtu.be/QqX1ExNAev0?list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa

	// fibonacci number ---> it is addition of two previous numbers

	// 0 1 1 2 3 5 8 13
	

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		int sum = 0;

		System.out.print(n1 + " " + n2);

		for (int i = 2; i < 10; i++) {

			sum = n1 + n2; // 2+3

			System.out.print(" " + sum); // 1 2 3 5

			n1 = n2; // n1-->2
			n2 = sum; // n2-->3

		}

	}
//Using recursion
	public static int fibonacci(int n) {
	    if (n <= 1) {
	        return n;
	    }
	    return fibonacci(n-1) + fibonacci(n-2);
	}
	
}
