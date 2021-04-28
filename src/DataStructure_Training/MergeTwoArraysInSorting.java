package DataStructure_Training;

import java.util.Arrays;

//Merging two unsorted arrays in sorted order

public class MergeTwoArraysInSorting {

	public static void MergeArray() {

		int a[] = { 13, 5, 7, 9, 12 };
		int b[] = { 2, 20, 1 };
		
		int n = a.length;  //5
		int m = b.length; //3

		///int res[] = {n+m};
		
		int res[] = new int[n+m];   //int res = [13,5 ,7 ,9 ,12 ,2 ,20 , 1]

		

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < n) {

			res[k] = a[i];
			i++;
			k++;
		}
		while (j < m) {

			res[k] = b[j];
			j++;
			k++;

		}
		Arrays.sort(res);
		
		for(int l=0 ; l<res.length; l++) {
			System.out.println(res[l]);
		}
	}

	public static void main(String[] args) {

		MergeArray();

	}

}
