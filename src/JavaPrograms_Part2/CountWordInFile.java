package JavaPrograms_Part2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CountWordInFile {

	public static void main(String[] args) throws IOException {

		
		String line;
		int count = 0;
		
		FileReader fs = new FileReader("C:\\Users\\swapn\\eclipse-workspace\\mySelenium\\Selenium\\src\\JavaPrograms_Part2\\samplefile.txt");
		
		BufferedReader br = new BufferedReader(fs);
		
		
		
		while((line= br.readLine()) != null) {
			
			String[] words = line.split("");
			count = count+words.length;
		}
		
		System.out.println("Number of words present in given file:" +count);
		
		
	}

}
