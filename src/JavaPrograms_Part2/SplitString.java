package JavaPrograms_Part2;

public class SplitString {
	
	//Write a Java program to split the given string?

	public static void main(String[] args) {

		String s = "I love you";

		String[] ch = s.split(" ");

		for (String str : ch) {
			System.out.println(str);
		}

	}

}
