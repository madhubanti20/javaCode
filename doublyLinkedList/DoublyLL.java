package doublyLinkedList;

public class DoublyLL {
	Node head;
	Node tail;
	static int count;
	
	public void insert(int data) {
		
		Node node = new Node(data);
		if(head == null) {
			head = node;
			tail = node;
			count++;
			return;
		}else {
			node.prev = tail;
			tail.next = node;
			tail = node;
			count++;
		}
	}
	
	public void display() {
		Node temp = head;
		if(temp == null) {
			System.out.println("No data to display!");
			return;
		}
		
		for(int i =1;i<=count;i++) {
			System.out.print(" "+temp.data);
			temp = temp.next;
		}
		
		System.out.println();
	
		Node current = tail;
		for(int i =1;i<=count;i++) {
			System.out.print(" "+current.data);
			current = current.prev;
		}
		
		System.out.println();
	}
	
	
	public void insertPos(int data1, int pos1) {
		Node node = new Node(data1);
		

		if ( pos1 <= 0) {
			System.out.println("this position is not available..");
			return;
		}
		if(head == null) {
			head = node;
			tail = node;
			count++;
			return;
		}
		
		Node current = head;
		
		if(pos1 == 1) {
			node.next = current;
			current.prev = node;
			head = node;
			count++;
			return;
		}
		
		if(pos1 == count+1) {
			insert(data1);
			return;
		}
		
		for(int i =1;i<count;i++) {
			if(pos1-1 == i) {
				Node temp = current.next;
				current.next = node;
				node.prev = current;
				node.next = temp;
				temp.prev = node;
				
				count++;
				return;
			}
			current = current.next;
			
		}
		
	}

	public void update(int newData, int pos) {
		
		Node node = new Node(newData);
		
		if ( pos <= 0 || pos > count) {
			System.out.println("this position is not available..");
			return;
		}
		
		if(head == null) {
			System.out.println("No node in the list...");
			return;
		}
		
		Node current = head;
		
		if(pos == 1) {
			head.data = newData;
			System.out.println("Data updataed to: " + newData);
			return;
		}
		
		if(pos == count) {
			tail.data = newData;
			System.out.println("Data updataed to: " + newData);
			return;
		}
		
		for(int i =1;i<count;i++) {
			if(pos == i) {
				current.data = newData;
				System.out.println("Data updataed to: " + newData);
				return;
			}
			current = current.next;
		}
		
	}

	

	public void deletePos(int pos2) {
		if(head == null) {
			System.out.println("No node in the list to delete...");
			return;
		}
		
		Node current = head;
		
		if(pos2 == 1) {
			Node temp = current.next;
			temp.prev = null;
			current.next = null;
			current = null;
			head = temp;
			count--;
			return;
		}
		
		if(pos2 == count) {
			Node temp = tail;
			tail = tail.prev;
			tail.next = null;
			temp.prev = null;
			count--;
			return;
			
		}
		
		int i =1;
		while(current.next.next != null) {
			if(pos2 -1 == i ) {
				Node delNode = current.next;
				current.next = delNode.next;
				delNode.next.prev = current;
				delNode = null;
				count--;
				return;
			}
			current = current.next;
			i++;
		}
		
	}
}
