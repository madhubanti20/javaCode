package singlyLinkedList;

public class SinglyLL {
	Node head;
	Node tail;
	static int count;

	public void insert(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
			count++;
		} else {
			tail.next = node;
			tail = node;
			count++;
		}

	}

	public void display() {
		Node temp = head;
		if (temp == null) {
			System.err.println("No node is present.");
			return;
		}
		if(temp.next == null) {
			System.out.println(" " + temp.data);
			return;
		}
		while (temp != null) {
			System.out.print(" " + temp.data);
			temp = temp.next;
		}
	}

	public void update(int newData, int pos) {

		if (head == null) {
			System.err.println("No node is present.");
			return;
		}
		if (pos == 1) {
			head.data = newData;
			System.out.println("Data updataed to: " + newData);
			return;
		}

		if (pos == count) {
			tail.data = newData;
			System.out.println("Data updataed to: " + newData);
			return;
		}
		if (count < pos || pos < 1) {
			System.out.println("this position is not available..");
		}
		Node temp = head;
		int num =1;
		while (temp != null) {
//
			if (num == pos) {
				temp.data = newData;
				System.out.println("Data updataed to: " + newData);
				return;
			}
			temp = temp.next;
			num++;
		}
//		Node temp = head;
//		for(int i=0;i<=count;i++) {
//			if(pos == i) {
//				temp.data = newData;
//				System.out.println("Data updataed to: " + newData);
//				return;
//			}
//			temp = temp.next;
//		}

	}

	public void delete() {
		Node temp = head;
		if (temp == null) {
			System.out.println("No node present.");
			return;
		}
		if (head.next == null) {
			System.out.println("data deleted: " + head.data);
			head = null;
			return;
		}
		while (temp.next.next != null) {
			temp = temp.next;
		}
		System.out.println("data deleted: " + temp.next.data);
		temp.next = null;
	}
	
	public void insertPos(int data, int pos) {
		Node temp = head;
//		Node prev = null;
//		Node next = null;
		Node node = new Node(data);
		if(head == null) {
			head = node;
			tail = node;
			count++;
			return;
		}
		if(pos == 1) {
			node.next = head;
			head = node;
			count++;
			return;
		}
		
//		if(pos==count) {
//			insert(data);
//		}

		if (count < pos || pos < 1) {
			System.out.println("this position is not available..");
			return;
		}
	
		for(int i =0;i<=count;i++) {
			if(i == pos-1) {
				node.next = temp.next;
				temp.next = node;
				count++;
				return;
			}
			temp = temp.next;
		}
	}
	
	public void deletePos(int pos) {
		Node temp = head;
		if (temp == null) {
			System.out.println("No node present.");
			return;
		}
		if (count < pos || pos < 1) {
			System.out.println("this position is not available..");
			return;
		}
		if(head.next == null) {
			head = null;
			return;
		}
		if(pos == 1&& head.next!=null) {
			head=temp.next;
			temp = null;
			return;
		}
	
		int cnt =2;
		while(temp.next.next!=null) {
			if(cnt ==pos ) {
				temp.next = temp.next.next;
				temp.next.next = null;
				return;
			}
			temp = temp.next;
			cnt++;
		}
		temp.next = null;
		
	}
}
