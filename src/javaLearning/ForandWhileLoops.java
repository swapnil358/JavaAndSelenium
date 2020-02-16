package javaLearning;

public class ForandWhileLoops {
	
	public static void main(String[] args) {
		
		
		
//Print Value 1 to 10 using For loop
		
		/*for(int j=1; j<=10; j++) {
			
			System.out.println(j);
			
		}*/
		
//Print Value 10 to 1 using For loop
				
		for(int k=10; k>=1; k--) {
			
			System.out.println(k);
			
		}
		
		
		
//Print Value 1 to 10 using while loop
		
		//Disadvantage of while loop it generate infinite loop if you don't give increment/Decrement part
		
		int i=1;				    //Initialization
		
		while(i<=10){  				//Conditional 
			
			System.out.println(i);
			
			i=i+1;					//Incremental
			
		}
		
		
	}

}
