package DataStructure_Training;

public class FirstDuplicateValue {

	public static void main(String[] args) {
		Firstduplicate();
	}

	public static void Firstduplicate() {

		int arr[] = { 2, 1, 5, 2, 3, 3, 4 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {

				if (arr[i] == arr[j]) {

					System.out.println(arr[i]);

				} 
				else {
					System.out.println("-1");
				}
				break;
					
			}
		

		}
	}
}
