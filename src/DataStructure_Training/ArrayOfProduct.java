package DataStructure_Training;

public class ArrayOfProduct {

	// Given array = {5,1,4,2}

	// O/p
	// {8,40,10,20}
	// ArraysOfProduct = 8 is equal to 1*4*2
	// ArraysOfProduct = 40 is equal to 5*4*2
	// ArraysOfProduct = 10 is equal to 5*1*2
	// ArraysOfProduct = 20 is equal to 5*1*4

	public static void main(String[] args) {
		ArrOfProduct();

	}

	public static void ArrOfProduct() {

		int arr[] = { 5, 1, 4, 2 };
		int length = arr.length;

		int[] solution = new int[length];

		int temp = 1;

		for (int i = 0; i < arr.length; i++) {

			temp = temp * arr[i];

		}
		System.out.println(temp);

		for (int j = 0; j < arr.length; j++) {

			solution[j] = temp / arr[j];

		}
		for (int k = 0; k < arr.length; k++) {

			System.out.print(solution[k]+" ");

		}

	}
}
