package objectClass;

import java.util.Objects;

public class Student {
	private String name;
	private int id;
	private String gender;
	private double marks;
	
	public Student(String name, int id, String gender, double marks) {
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.marks = marks;
	}

	public String toString() {
		return "Student id is: "+id+" name: "+name+" gender: "+gender+" marks: "+marks;
		
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student){
			Student s = (Student) obj;
			return this.id == s.id && this.marks == s.marks && this.name.equals(s.name) && this.gender.equals(s.gender);
		}else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)(this.id+this.marks+this.name.hashCode()+this.gender.hashCode());
	}
}
