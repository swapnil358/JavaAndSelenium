package StringImmutableConcept;

public class StringConcept {
	
	//String pool
	//Security
	//Class loading mechanism
	//Optimization and Performance
	//It can not be inheritesd 
	//Wrapper classes -- int, long, double, float will be final/immutable
	

	public static void main(String[] args) {

		String s1 = "Java";				//1) String Pool
		String s2 = "Java";
		s2 = "Naveen";
		String s3 = "C++";
		
		System.out.println("s1"+" " +s1);
		System.out.println("s2"+" " +s2);
		System.out.println("s3"+" " +s3);
	}

}
