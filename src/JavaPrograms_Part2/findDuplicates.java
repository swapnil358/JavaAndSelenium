package JavaPrograms_Part2;

import java.util.HashSet;
import java.util.Set;

public class findDuplicates {
	
	//Find how many duplicate values in Array List?
	
	
	

	public static void main(String[] args) {
		
		int[] arr = {10,50,66,50,79,10,10};

		Set<Integer> dup = new HashSet<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			
			if (dup.add(arr[i]) == false) {
				
				System.out.println("Found duplicate element in array"+ arr[i]);
			}
			
		}
		
		
	}

}
