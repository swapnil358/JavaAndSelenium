package Encapsulation;

public class EmployeeData {
	// also called Data-hiding
	
	//how to implement Encapsulation:
	
	//1. private data variable: so that variable can not be accessed directly from outside the class
	
	
	/*
	 * Real-time Example Encapulation:
		School bag is one of the most real examples of Encapsulation. School bag can keep our books, pens, etc
	 * 
	 * https://www.scientecheasy.com/2018/06/encapsulation-in-java-real-time-examples-advantages.html
	 */
		
	private int ssn;
	private String name;
	private int empAge;
		
	public static void main(String[] args) {
		EmployeeData emp = new EmployeeData();
		emp.setName("TOM");
		emp.setSsn(54566);
		emp.setEmpAge(25);
		
		System.out.println("EMployee name is: "+ emp.getName());
		System.out.println("EMployee age is :+" + emp.getEmpAge());
		System.out.println("EMployee age is :"+ emp.getSsn());		
	}

	//2. public getter and setter methods: to get and Set the values of the fields
	
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
