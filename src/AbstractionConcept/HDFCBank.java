package AbstractionConcept;

public class HDFCBank extends Bank {

	@Override
	public void loan() {
		System.out.println("HDFC----loan method");
	}
	
	public void funds() {
		System.out.println("HDFC---funds");
	}

	
}
