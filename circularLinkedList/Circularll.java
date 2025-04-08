package circularLinkedList;

public class Circularll {
	Node head;
	Node tail;
	static int count;
	
	public void insert(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			tail = node;
			tail.next = head;
			count++;
		}
		else{

			tail.next = node;
			tail = node;
			tail.next = head;
			count++;
		}
		
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
			tail.next = head;
			count++;
		}
		
		Node temp = head;
		
		//at first
		if(pos1 == 1) {
			node.next=temp;
			head = node;
			tail.next = head;
			count++;
			return;
		}
		
		//at last 
		if(pos1 == count+1) {
			insert(data1);
			return;
		}
		
		//anywhere 
		for(int i =1;i<count;i++) {
			if(i == pos1-1) {
				node.next = temp.next;
				temp.next = node;
				count++;
				return;
				
			}
			temp = temp.next;
		}
		
	}

	public void display() {
		Node temp = head;
		if(temp == null) {
			System.out.println("No data to display!");
			return;
		}
//		if(temp.next == head) {
//			System.out.println(temp.data);
//			return;
//		}
		for(int i =1;i<=count;i++) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		
		System.out.println();
		
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
		
		//first pos
		if(pos == 1) {
			current.data = newData;
			System.out.println("Data updataed to: " + newData);
			return;
		}
		
		//last pos
		if(pos == count) {
			tail.data = newData;
			System.out.println("Data updataed to: " + newData);
			return;
		}
		
		//anywhere
		for(int i =1 ;i<count;i++) {
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
			head = current.next;
			tail.next = head;
			current = null;
			count--;
			return;
		}
		
		if(pos2 == count) {
			for(int cnt = 1; cnt<count-1;cnt++) {
				current = current.next;
			}
			current.next = head;
			count--;
			return;
			
		}
		
		int i = 1;
		while( current.next.next!=head) {
			if(pos2-1 == i) {
				Node delNode = current.next;
				current.next = current.next.next;
				delNode = null;
			 count--;
			 return;
			}
		 current = current.next;
			i++;
		}
		
		
	}

	
}
