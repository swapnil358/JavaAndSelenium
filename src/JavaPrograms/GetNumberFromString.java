package JavaPrograms;

public class GetNumberFromString {

	public static void main(String[] args) {

		
	     	String str= "2019\ncurrent";
		   
		   String numberOnly = str.replaceAll("[^0-9]", "");
		   
		   Integer.parseInt(numberOnly);
		 
		   System.out.println(numberOnly);
	}

}
