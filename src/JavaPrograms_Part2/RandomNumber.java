package JavaPrograms_Part2;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {

		Random rand = new Random();
		int r1 = rand.nextInt(1000);
		System.out.println("Random numbers: " + r1);
	}
}
