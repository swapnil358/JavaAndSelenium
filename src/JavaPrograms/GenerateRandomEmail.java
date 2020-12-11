package JavaPrograms;

import java.util.Random;

public class GenerateRandomEmail {

	public static void main(String[] args) {

		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		System.out.println("username" + randomInt + "@gmail.com");

	
	//String randomNumbers = RandomStringUtils.randomNumeric(5);
	//String phNo = "079393"+randomNumbers;
			
			
	}
}
