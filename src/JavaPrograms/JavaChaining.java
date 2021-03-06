package JavaPrograms;

public class JavaChaining {
	
	
	/*
	 * Java Constructor chaining is the process of calling one constructor from
	 * another constructor with respect to current object.
	 */
	
	/*Interview Question:  Can we create static constructor?
	 * Constructor is the property of an object while static has nothing to do with
	 * object. That's why there is nothing like static constructor. But we have
	 * static block to do the similar task as constructor i.e. initialization of
	 * fields etc.
	 */
		
	// No argument constructor
	public JavaChaining() {	
		System.out.println("Default Constructor");
	}
	
	
	// one argument constructor
	public JavaChaining(int x) {
		this();
		System.out.println(x +" This is constructor 1");
	}

	//two argument constructor
	public JavaChaining(int x, int y) {
		this(50);
		System.out.println(x+y +" This is constructor 2");
	}
	
	
	public static void main(String[] args) {
		
		JavaChaining J = new JavaChaining(10,20);
		
		
	}
	
	
}
