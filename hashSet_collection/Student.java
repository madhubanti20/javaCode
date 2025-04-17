package hashSet_collection;

import java.util.Objects;

public class Student {
	int id;
	String name;
	
	Student(int id,String name){
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

//	@Override
//	public int hashCode() {
//		return this.id + this.name.hashCode();
//	}

//	@Override
//	public boolean equals(Object obj) {
//		Student st = (Student) obj;
//		return this.id == st.id && this.name.equals(st.name);
//	}
//	
	@Override
	public int hashCode() {
		return this.id ;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student st = (Student) obj;
		return this.id == st.id;
	}
	
	
	//---------we will not compare based on name cuz name can be same
//	@Override
//	public int hashCode() {
//		return this.name.hashCode() ;
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		Student st = (Student) obj;
//		return this.name.equals(st.name);
//	}
//	
	
	
}
