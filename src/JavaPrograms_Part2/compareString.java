package JavaPrograms_Part2;

public class compareString {
	
	public static void main(String[] args) {
		
		String s1 = "i am the best";
		String s2 = "i am the best";
		
		if(s1.compareToIgnoreCase(s2)==0) {
			System.out.println("Stings are equal");
		}else {
			System.out.println("Stings are not equal");
		}
		
		
	}

}
