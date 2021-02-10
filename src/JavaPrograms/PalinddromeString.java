package JavaPrograms;

public class PalinddromeString {
	
	private static boolean isPalindrome(String str) {
		if (str == null)
		return false;
		
		
		
		StringBuilder strBuilder = new StringBuilder(str);
		strBuilder.reverse();
		
		System.out.println("reverse : "+strBuilder.reverse());
		
		return strBuilder.toString().equals(str);
		
	
		}
	
	public static void main(String[] args) {
		
		System.out.println(isPalindrome("abcd"));
		
	}

}
