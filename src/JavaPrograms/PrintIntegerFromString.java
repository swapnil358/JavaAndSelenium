package JavaPrograms;

public class PrintIntegerFromString {

	
	public static void main(String[] args) {
		
		String str = "545qwert454";
		
	    String str1 = str.replaceAll("[//a-z]", "");
		
	    int i = Integer.parseInt(str1);
	    
	    System.out.println(i);
		
	}
	
	
}
