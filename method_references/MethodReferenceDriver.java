package method_references;

public class MethodReferenceDriver {
	public static void main(String[] args) {
		Demo d = System.out::println;
		d.print("Hello");
	}
}
