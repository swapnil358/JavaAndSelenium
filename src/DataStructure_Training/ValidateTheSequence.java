package DataStructure_Training;

public class ValidateTheSequence {
	
	static boolean ValidateSubsequence(int arr[], int seq[])
	{
		int i,j;
		i =j =0;
		if(seq.length > arr.length)
			return false;
		if(seq.length == 0 || arr.length == 0)
			return false; 
		
		//arr = [1,2,3];
		//seq = [1,4,5,5,6,3,1,2,7];
		while(i < arr.length && j < seq.length)
		{
			if(arr[i] == seq[j])
			{
				i++;
				j++;
				
			}
			else
			{
				i++;
			}
		}
		if(j > seq.length-1)
		{
			return true;
		}
		else
			return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int[] seq  = {1,2,3};
		ValidateSubsequence(arr, seq);
	}

}
