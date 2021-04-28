package DataStructure_Training;

public class MoveElementToEnd {

	// Q. Move the given element at the end of the array
	// int arr[] = {1,0,2,0,6,0,7,0,5,0}
	// value =0

	// Output = {1,2,6,7,5,0,0,0,0,0}

	public static void main(String[] args) {

		int arr[] = { 1, 0, 2, 0, 6, 0, 7, 0, 5, 0 };
		int value = 0;

		int i = arr[0];
		int j = arr.length - 1;

		while (i < j) {

			while (arr[j] == value) {
				j--;
			}

			if (arr[i] == value) {

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

				i++;
				j--;

			} else {
				i++;
			}

		}

		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}

	}
}
