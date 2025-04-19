package lambda_expression;

public interface LambdaDemo {
	void print();
	 default void test() {
		System.out.println("Test");
	}
}
