package StringImmutableConcept;

public class StringExample {
	
	public static void main(String[] args) {
		
		
		StringBuffer sb1= new StringBuffer("abc");
		
		StringBuffer sb2=new StringBuffer("abc");
		System.out.println(sb1==sb2); 
		System.out.println(sb1.equals(sb2));
		
	}

}
