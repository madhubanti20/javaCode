package methodOverriding;

public class Driver {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.Sound();
		
		Tiger t = new Tiger();
		t.Sound();
	}
}
