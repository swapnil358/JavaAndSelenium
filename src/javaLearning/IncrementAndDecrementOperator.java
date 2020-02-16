package javaLearning;

public class IncrementAndDecrementOperator {

	
	public static void main(String[] args) {
		
		
		int i = 1;
		int j = i++;  //Post increment
				
		System.out.println("Post increment of i:"+i);
		System.out.println("Post increment of j:"+j);
		
		
		int a = 1;
		int b = ++a;  ////Pre increment
		
		System.out.println("Pre increment of a:"+a);
		System.out.println("Pre increment of b:"+b);
	
		
		int l = 2;
		int m = l--;  ////Post decrement
		
		System.out.println("Post decrement l:"+l);
		System.out.println("Post decrement m:"+m);
	 
		int r = 2;
		int s = --r;  ////Pre decrement
		
		System.out.println("Pre decrement of r:"+r);
		System.out.println("Pre decrement of s:"+s);
	 
		
		
	}
	
	
}
