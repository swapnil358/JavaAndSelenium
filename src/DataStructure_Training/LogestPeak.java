package DataStructure_Training;

public class LogestPeak {

	public static void main(String[] args) {
		
		
		int arr[] = {1,2,3,3,4,0,10,6,5,-1,-3,2,3};
		
		int i=0;
		int j=0;
		
		int count1 = 0;
		int count2 = 0;
		
		
		while(i<arr.length) {
			
			if(arr[i] < arr[j+1]) {
				count1++;
				i++;
			
			}
			System.out.println(count1);
			
		}
		
		
			
			
	}		
		

}
