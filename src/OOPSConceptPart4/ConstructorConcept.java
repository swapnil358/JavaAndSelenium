package OOPSConceptPart4;

//refer - https://youtu.be/XtrSoiFfTEQ?list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx


public class ConstructorConcept {

	public ConstructorConcept() {
		System.out.println("Default Constructor");
	}
	
	public ConstructorConcept(int i) {
		System.out.println("One para constructor"+i);
	}
	
	public ConstructorConcept(int i, int j) {
		System.out.println("Two params Contructot" +i);
		System.out.println("Two params Contructot" +j);
	}
	
	
	public static void main(String[] args) {

		
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(20,30);
		
	}

}
