package TestPackage;

public class NumAddFromString {
	
	
	public static void main(String[] args) {
		
	
	
	String s = "fgf3rklfs7flkgj8";
	
	String b = s.replaceAll("[a-z]", " ");
	
	int sum = 0;
	
	System.out.println(b);
	
	String[] splt = b.split(" ");
	
	for(String string : splt) {
		
		if(string.matches("[0-9]+")) {
			
			int i = Integer.parseInt(string);
			
			sum = sum + i;
			
		}
		
	}
	System.out.println("total= "+ sum);
	
	}
	
}
