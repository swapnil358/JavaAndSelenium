package OOPSConceptPart3;

public class TestCar {
	
	//Refer video  "https://www.youtube.com/watch?v=DWpYniQAVyI&list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx&index=13"
	
	
	public static void main(String[] args) {
		
		
		//static polymorphism ------------> compile time polymorphism
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftsafty(); 
		b.engine();
		
		
		
		System.out.println("********************");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		
		//Top Casting*****  //Only overridden method and parent will be called
		Car c1 = new BMW();  //Child class object can be referred by parent class reference variable---Dynamic Polymorphism --Run-time polymorphism
		c1.start();
		c.stop();
		c.refuel();
		
		
		//Down Casting*****
		//Parent class can be referred by chile class object reference variable? --Not possible -- it gives "ClassCastException"
		
		BMW b1 = (BMW)new Car();
		
		
		
	}

}
