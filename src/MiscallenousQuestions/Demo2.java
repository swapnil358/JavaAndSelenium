package MiscallenousQuestions;

public class Demo2 {

	public static void main(String[] args) {

		String message = "Hello";
		print(message);

		message += "world!";

		print(message);

	}

	static void print(String message) {
		System.out.println(message);
		message += " ";
	}

}
