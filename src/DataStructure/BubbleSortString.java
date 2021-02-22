package DataStructure;

public class BubbleSortString {

	public static void main(String[] args) {

		String[] a = { "Zebra", "Xero", "Apple", "Jack", "Nik" };

		String temp;
		for (int i = 0; i < a.length; i++) { // this for loop for iteration

			for (int j = 0; j < a.length - 1; j++) { // this for loop for swap the number

				if (a[j].compareTo(a[j + 1])>0) {

					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}

			}

		}
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i]+",");
		}

	}
}
