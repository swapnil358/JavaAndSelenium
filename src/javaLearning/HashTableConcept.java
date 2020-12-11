package javaLearning;

import java.util.Hashtable;

public class HashTableConcept {
	
	public static void main(String[] args) {
	
		Hashtable h = new Hashtable();
		
		h.put(10, "test");
		h.put(20, "Hello");
		h.put(30, "world");
		h.put(40, "swap");
		
		System.out.println(h.size());
		
		h.put("A", 100);
		h.put("B", 200);
		h.put("C", 300);
		
		h.put(1, 1.0);
		h.put(1, 2.5);
		
		System.out.println(h.size());
		
		System.out.println(h.get(20));
		System.out.println(h.get("C"));
		
		Hashtable <Integer,Integer> h1 = new Hashtable<Integer, Integer>();
		
		//h1.put("hello", "world");     ------> it will not accept integer
		h.put(10,20);
		
		
		Hashtable<String,Integer> h2 = new Hashtable<String, Integer>();
		
		h2.put("Hello", 2);
		//h2.put(2, 2); -------> it will not accept interger
		
		
		
		
		
	}

}
