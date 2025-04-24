package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo {
	 public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(10);
		arr.add(15);
		System.out.println(arr);
//		
//		Stream s = arr.stream();
//		Stream s1 = s.distinct();
//		System.out.println(s1); //-->print address
//		s1.forEach(n->System.out.println(n));
		arr.stream().distinct().forEach(n->System.out.println(n));
		
		System.out.println("....................");
		//min val
		Optional<Integer> optional = arr.stream().distinct().min((o1,o2)->o1-o2);
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		
		System.out.println("..................");
		//max val
		Integer i = arr.stream().max((o1,o2)->o1-o2).get();
		System.out.println(i);
		
		System.out.println(".................");
		//asc
		arr.stream().sorted().forEach(n -> System.out.println(n));
		
		//dsc
		arr.stream().sorted((o1,o2) -> o2-o1).forEach(n -> System.out.println(n));
		
		//map
		arr.stream().sorted().map(n -> n*n).forEach(n -> System.out.println(n));
		
		//filter
		arr.stream().distinct().filter(n -> n%2 == 0).forEach(n -> System.out.println(n));
		
		List<Integer> li = arr.stream().distinct().filter(n -> n%2 == 0).toList();
		System.out.println(li);
		
		

	}
}
