package Overriding;

public class Test {

	public static void main(String[] args) {

		Child obj = new Child();
		obj.p();

		Parent obj1 = new Parent();
		obj1.p();

		Parent obj3 = new Child();
		obj3.p();

	}

}
