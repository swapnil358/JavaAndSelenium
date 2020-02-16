package AbstractionConcept;

public interface Car {

	// Only Final and static variable define in abstract

	int i = 10; // By default, interface fields are public, static and final

	void abstractMethod(); // Interface can have abstract method

	int wheels = 4;

	// We always define Abstract method without Abstract keyword
	// Abstract method -- only method declaration,
	// No method body
	// We achieve 100% abstraction
	// Can not create the object of interface
	// In interface we can define ---Static(static int loanrate= 5;), Non static i.e
	// public(int
	// amt = 100;), final(final int rate = 10;)

	// No constructors in an interface

	// No non-static and non-final variables in an interface

	// No private fields and methods in an interface

	// No protected fields and methods in an interface

	// No final methods in an interface

	/*
	 *  Main difference is methods of a Java interface are implicitly abstract and
	 * cannot have implementations.
	 *  A Java abstract class can have instance methods that implements a default behavior. 
	 *  Variables declared in a Java interface is by default final. 
	 *  An abstract class may contain non-final variables. Members
	 * of a Java interface are public by default. A Java abstract class can have the
	 * usual flavors of class members like private, protected, etc.. Java interface
	 * should be implemented using keyword “implements”; A Java abstract class
	 * should be extended using keyword “extends”. 
	 * An interface can extend another Java interface only, an abstract class can extend another Java class and
	 * implement multiple Java interfaces. A Java class can implement multiple interfaces but it can extend only
	 *  one abstract class. Interface is absolutely
	 * abstract and cannot be instantiated; A Java abstract class also cannot be
	 * instantiated, but can be invoked if a main() exists. In comparison with java
	 * abstract classes, java interfaces are slow as it requires extra indirection.
	 * 
	 * 
	 */

	public void start();

	public void stop();

	public void refuel();

}
