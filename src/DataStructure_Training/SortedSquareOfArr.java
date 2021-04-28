package DataStructure_Training;

public class SortedSquareOfArr {
	
	//pgm -> Given Sorted array {-10,-5,-2,0,4,7}, 
	//output -- Sqaure of each array and it should be sorted
	//0,4,16,25,49,100,
	
	static void sortedSquare() {
			
		int arr[] = {-10,-5,-2,0,4,7};	
		int left = 0;
		int right = arr.length-1;
		
		int OutPutArr[] = new int[arr.length];		
		int oi = OutPutArr.length-1;	
		
		while(left<=right) {
			
			int lValue = Math.abs(arr[left]);
			int rValue = Math.abs(arr[right]);
		
			int max= Math.max(lValue, rValue);
			
			OutPutArr[oi] = max*max;
			
			oi--;
			
			if(lValue > rValue) {
				
				left ++;
			}else {
				
				right --;
			}
		
		}
	//	OutPutArr[oi] = arr[right] * arr[right];		
		for(int i=0; i<OutPutArr.length; i++) {
			System.out.print(OutPutArr[i]+",");
		}	
	}

	public static void main(String[] args) {
		
		sortedSquare();

	}

}
