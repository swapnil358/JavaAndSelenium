package OOPSConceptPart4;


//refer - https://youtu.be/XtrSoiFfTEQ?list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx

public class ContructorWithThisKeyword {

	String name;
	int age;
	
	public ContructorWithThisKeyword(String name, int age) {
		
		this.name =name;
		this.age =age;
		
		System.out.println(name);
		System.out.println(age);
	}
	
	
	
	
	
	public static void main(String[] args) {

		ContructorWithThisKeyword obj = new ContructorWithThisKeyword("test", 20);
	
	}

}
