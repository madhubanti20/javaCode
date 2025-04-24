package reflexionApi;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class EmployeeDriver {
	public static void main(String[] args) throws Exception{
		Class<Employee> emp = Employee.class;
		Field[] fields = emp.getDeclaredFields();
		
		for(Field field : fields) {
			System.out.println(field.getName());
		}
		
		//changing value of a field of particular object
		Employee e = new Employee("Rohit",1,26,12000);
		
		Field f = emp.getDeclaredField("name");
		
		f.setAccessible(true);
		f.set(e, "Ram");
		System.out.println(f.get(e));
		f.setAccessible(false);
		
		System.out.println("...........................");
		
		System.out.println(e.getName());
		
		System.out.println(".........................");
		
		Method[] methods = emp.getDeclaredMethods();
		for(Method method:methods) {
			System.out.println(method.getName());
			
		}
		System.out.println("..............................");
		for(Method method:methods) {
			if(method.isAnnotationPresent(Deprecated.class)) {
				System.out.println(method.getName());
				System.out.println(method.invoke(e));
			}
			
		}
		
	}
}
