package OOPConceptPart2;

public class WrapperClassConcept {

	public static void main(String[] args) {

		
		/*
		 * A Wrapper class is a class whose object wraps or contains a primitive data
		 * types. When we create an object to a wrapper class, it contains a field and
		 * in this field, we can store a primitive data types. In other words, we can
		 * wrap a primitive value into a wrapper class object.
		 * 
		 * Need of Wrapper Classes
		 * 
		 * They convert primitive data types into objects. Objects are needed if we wish
		 * to modify the arguments passed into a method (because primitive types are
		 * passed by value). The classes in java.util package handles only objects and
		 * hence wrapper classes help in this case also. Data structures in the
		 * Collection framework, such as ArrayList and Vector, store only objects
		 * (reference types) and not primitive types. An object is needed to support
		 * synchronization in multithreading.
		 */
		
		String x = "100";
		System.out.println(x+20);
		
		
		//Data conversion : String to int
	    
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//Integer, Double, Character, Boolean
		
		
		//String to Double conversion
		
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to boolean
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		
		//int to String
		int j = 200;
		System.out.println(j+20);
		
		String s = String.valueOf(j);
		System.out.println(s+20);
		
		
		String u = "100A";
		Integer.parseInt(u); //----> Number format exception for input String: "100A"
		
		
	}

}
