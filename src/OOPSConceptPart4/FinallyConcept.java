package OOPSConceptPart4;

//refer video- https://youtu.be/aqDiBybBRqM?list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx

/*	final  -- keyword
    finally -- block
    finalize - method
*/

public class FinallyConcept {

	public static void main(String[] args) {

		// test1();
		// test2();
		// devision();
		devision2();
	}

	// Example1
	public static void test1() {

		try {
			System.out.println("inside test1 method");
		} catch (Exception e) {
			System.out.println("inside catch method");
		} finally {
			System.out.println("inside finally block");
		}
	}

	// Example2
	public static void test2() {
		try {
			System.out.println("inside test2");
		} finally {
			System.out.println("finally code in test2 method");
		}
	}

	// Example3
	public static void devision() {

		int i = 10;
		try {
			System.out.println("inside try block");
			int k = i / 0;
		} catch (ArithmeticException e) {
			System.out.println("inside catch block");
			System.out.println("devide by zero error");
		} finally {
			System.out.println("execute this code even after any exception");
		}
	}

	/*
	 * Java finally block is always executed whether exception is handled or not.
	 * Java finally block follows try or catch block.
	 */

	public static void devision2() {

		int i = 10;
		try {
			System.out.println("inside try block");
			int k = i / 0;
		} catch (NullPointerException e) { // Nullpointer exception - we are not catching in catch block
			System.out.println("inside catch block");
			System.out.println("devide by zero error");
		} finally {
			System.out.println("execute this code even after any exception");
		}
	}

}
