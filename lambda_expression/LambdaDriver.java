package lambda_expression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDriver {
	public static void main(String[] args) {
		LambdaDemo li = ()-> System.out.println("Hello");
		li.print();
		li.test();
		
		Demo d = () -> System.out.println("Hello");
		d.greet();
		
		Demo2 d2 = (x,y) -> {
			if(x>y) {
				return x;
			}else {
				return y;
			}
		};
		
		System.out.println(d2.chcek(10,20));
		
		List<Integer> list = Arrays.asList(1,2,3,4);
		System.out.println(list);
		Comparator<Integer> cmp = (o1,o2)->o2-o1;
		Collections.sort(list,cmp);
		System.out.println(list);
		
//		Demo3 d3 = (x,y) ->{
//			return x+y;
//		};
//		
//		System.out.println(d3.add(10, 20));
		Demo3 d3 = (x,y) -> x+y;
		System.out.println(d3.add(10, 20));
		
	}
}
