package Annotations;

import java.lang.reflect.Field;

public class Driver {
	public static void main(String[] args) throws Exception {
		Demo d = new Demo();
		System.out.println(d.id);
		
		 Field field = Demo.class.getDeclaredField("id");
		 Flag flag = field.getAnnotation(Flag.class);
		 System.out.println(flag.name());
	}
}
