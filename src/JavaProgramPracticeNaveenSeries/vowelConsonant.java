package JavaProgramPracticeNaveenSeries;

public class vowelConsonant {

	public static void main(String[] args) {

		// Method - 1
		char ch = 'z';

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

			System.out.println(ch + ": is vowel");

		} else {
			System.out.println(ch + ": is Consonant");

		}

		// Method-2
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch + ": is vowel");

			break;

		default:

			System.out.println(ch + ": is Consonant");

			break;
		}

	}

}
