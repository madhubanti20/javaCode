package oops;

import java.util.Scanner;

public class StudentManagement {
	
	private String email = "madhu@gmail.com";
	private int password = 1234;
	private String name = "Madhu";
	private int age = 23;
	private String gender = "F";
	private String branch = "CST";

	
	public String getEmail() {
		return email;
	}

	
	public int getPassword() {
		return password;
	}

	public void setPassword(int oldPassword) {
		if(this.password == oldPassword) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter your new password: ");
			int newPassword=sc.nextInt();
			
			System.out.println("Enter your password again: ");
			int confirmPassword = sc.nextInt();
			
			if(newPassword == confirmPassword) {
				this.password = newPassword;
			}
			
		}else {
			System.out.println("Invalid password");
		}
		
		System.out.println("Password updated");
		
	}

	public void getName() {
		
	}

	public void setName(String name,int passWord) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	

	public String getBranch() {
		return branch;
	}

	
	public void fetchDetails(String email, int password) {
		
		if(this.email == email && this.password == password) {
			System.out.println("The student name is: "+name+"\nage is: "+age+"\nemail id is: "+email+"\nbranch is: "+branch);
		}else {
			System.out.println("Invalid credential");
		}
		
	}
}
