package DataStructure_Training;

//print 1 to 5 and 5 to 1


public class Recursion_Lader {

	static void print(int n, int a) {
		if (a == n) {
			System.out.println(a);
			System.out.println(a);
			return;
		}
		System.out.println(a);
		print(n, a + 1);
		System.out.println(a);

	}
	
	
	
	//Ladder problem
	
	static int ladder(int n) {
		
		if(n==1 || n==0) {
			return 1;
		}
		
		else if(n==2) {
			return 2;
		}
		
		return  ladder(n-3)+ladder(n-2)+ladder(n-1);
	}

	
	public static void main(String[] args) {
		print(5, 1);
		System.out.println("No of ways available: "+ladder(4));
	}
	
}
