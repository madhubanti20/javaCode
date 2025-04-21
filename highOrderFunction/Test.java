package highOrderFunction;

public class Test {
	void greet(Demo d) {
		d.print();
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.greet(()->System.out.println("Hello"));
	}
}
