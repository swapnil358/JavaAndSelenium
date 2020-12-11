package AbstractionConcept;

public class BMW implements Car {

	@Override
	public void start() {
		System.out.println("BMW----start");
		
	}

	@Override
	public void stop() {
		System.out.println("BMW----stop");
		
	}

	@Override
	public void refuel() {
		System.out.println("BMW----refuel");
		
	}
	
	//Non overriden method
	//OR // BMW's own method
	
	public void theftsafety() {
		System.out.println("BMW-----theftsafety");
	}

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		
	}

}
