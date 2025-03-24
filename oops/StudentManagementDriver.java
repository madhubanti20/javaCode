package oops;

//encapsulation
public class StudentManagementDriver {
	public static void main(String[] args) {
		StudentManagement st = new StudentManagement();
		
		st.fetchDetails("madhu@gmail.com",1234);
		
		st.setPassword(1234);
		System.out.println(st.getPassword());
		
		System.out.println();
		
		
		st.setName("Anu",1234);
		
		
		
	}
}
