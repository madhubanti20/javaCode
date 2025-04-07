package singlyLinkedList;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinglyLL list = new SinglyLL();
		boolean flag = true;
		while (flag) {
			System.out.println(
					"Enter 1 to insert data\nEnter 2 to display data\nEnter 3 to delete a data\nEnter 4 to update data in a position\nEnter 5 to insert data in a position\nEnter 6 to delete from a position\nEnter 7 to exist!");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter data: ");
				int data = sc.nextInt();
				list.insert(data);
				break;
			case 2:
				System.out.println("the linked list is : ");
				list.display();
				System.out.println();
				break;
			case 3:
				list.delete();
				break;
			case 4:
				System.out.println("Enter a pos where you want to delete..");
				int pos = sc.nextInt();
				System.out.println("Enter the new data..");
				int newData = sc.nextInt();
				list.update(newData, pos);
				break;
			case 5:
				System.out.println("Enter a pos where you want to add..");
				int pos1 = sc.nextInt();
				System.out.println("Enter the new data..");
				int data1 = sc.nextInt();
				list.insertPos(data1, pos1);
				break;
			case 6:
				System.out.println("Enter position where to delete: ");
				int pos2 = sc.nextInt();
				list.deletePos(pos2);
				list.display();
				break;
			case 7:
				flag = false;
				System.out.println("List is end");
				break;
			}
		}
	}
}
