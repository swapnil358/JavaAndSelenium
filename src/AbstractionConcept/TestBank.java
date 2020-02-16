package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {

		HDFCBank hb = new HDFCBank();
		
		hb.credit();
		hb.debit();
		hb.loan();
		hb.funds();
		
	//Dynamic polymorphism
		
		Bank b = new HDFCBank();			//Child class object reffered by parent class variable--i.e //Dynamic polymorphism
		b.credit();
		b.debit();
		b.loan();
		
		
		/*
		 * 
		 * Bank b1 = new Bank();          *Can not create the object of Abstract class
		 */
	}

}
