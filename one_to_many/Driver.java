package one_to_many;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter post size: ");
		
		int size = sc.nextInt();
		
		User user = new User("Madhu",size);
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("Enter 1 for add post\nEnter 2 for display\nEnter 3 for exist\nEnter 4 for removing\nEnter 5 for update.");
			
			int choice = sc.nextInt();
			switch(choice) {
			
			case 1: System.out.println("Enter post id: ");
					int id =sc.nextInt();
					sc.nextLine();
					System.out.println("Enter post 1: ");
					String name = sc.nextLine();
					Post post = new Post(id,name);
					user.createPost(post);
					break;
			case 2: user.displayPost();
					break;
			case 3: flag = false;
					break;
			case 4: System.out.println("enter id which you want to remove: ");
					int pid = sc.nextInt();
					user.removePost(pid);
					break;
			case 5:	System.out.println("Enter old id: ");
					int oldId = sc.nextInt();
					System.out.println("Enter new id: ");
					int newId = sc.nextInt();
					user.updatePost(oldId,newId);
					break;
			default: System.out.println("Plese provide correct choice");
			}
		}
	}
}
