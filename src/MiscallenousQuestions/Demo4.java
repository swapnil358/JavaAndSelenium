package MiscallenousQuestions;

import java.util.HashMap;

public class Demo4 {

	public static void main(String[] args) {
		
		
		HashMap<String, Integer> pantry = new HashMap<>();
		
		pantry.put("Apple", 3);
		pantry.put("Orange", 2);
		
		
		
		int currentApples = pantry.get("Apple");
		pantry.put("Apple", currentApples +4);
		
		
		System.out.println(pantry.get("Apple"));
		
		

	}

}
