package DataStructure_Training;

public class ArrayOfSum {

	// Given array = {5,1,4,2}

	// O/p
	// {7,11,8,10}
	// ArraysOfProduct = 7 is equal to 1+4+2
	// ArraysOfProduct = 11 is equal to 5+4+2
	// ArraysOfProduct = 8 is equal to 5+1+2
	// ArraysOfProduct = 10 is equal to 5+1+4

	public static void main(String[] args) {

		int arr[] = { 5, 1, 4, 2 };
		int length = arr.length;

		int solution[] = new int[length];

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];

		}
	//	System.out.println("Sum is " + sum);

		for (int j = 0; j < arr.length; j++) {
			solution[j] = sum - arr[j];

		}

		for (int k = 0; k < arr.length; k++) {
			System.out.print(solution[k]+" ");

		}
	
	}

}
