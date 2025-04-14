package HashMapImplementation;

public class HashMapImpl {
	final int size = 16;
	Entry buckets[] = new Entry[size];

	private int getBucketIndex(int key) {

		return Math.abs(Integer.hashCode(key)) % size;

	}

	public void put(int key, int value) {

		Entry newNode = new Entry(key, value);
		int index = getBucketIndex(key);
		System.out.println("Entry is added at index: " + index);

		if (buckets[index] == null) {
			buckets[index] = newNode;
			return;
		}

		Entry temp = buckets[index];

//		if(temp != null) {

		while (temp != null) {
			if (temp.key == key) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		newNode.next = buckets[index];
		buckets[index] = newNode;
//		}

	}
	
	public int getValue(int key) {
//		for(int i =0 ;i<buckets.length;i++) {
//			Entry current = buckets[i];
//			while(current != null) {
//				if(buckets[i].key == key) {
//					return buckets[i].value;
//				}
//				current = current.next;
//			}
//		}
		
		int index =  getBucketIndex(key);
		Entry current = buckets[index];
		while(current != null) {
			if(buckets[index].key == key) {
				return buckets[index].value;
			}
			current = current.next;
		}
		return -1;
	}
	
	public void display() { //o(n^2)
		
		for(int i =0;i<buckets.length;i++) {
			Entry current = buckets[i];
			
			while(current!=null) {
//				System.out.println("for index "+i);
				System.out.println("F"
						+ "or "+i+" th index: "+" key: "+current.key+" value: "+current.value);
				current = current.next;
				
			}
			continue;
		}
		
	}
	
	public void delete(int key) {
		
		int index =  getBucketIndex(key);
		Entry current = buckets[index];
		Entry prev = null;
		
//		if(current.next == null) {
//			if(current.key == key) {
//				System.out.println("data deleted: "+current.value);
//				current = null;
//				buckets[index] = null;
//				return;
//			}else {
//				System.out.println("Key is not present");
//				return;
//			}
//		}
		
		while(current != null) {
			if(current.key == key) {
				if(prev == null) {
					prev = current;
					buckets[index] = current.next;
					prev.next = null;
				}else {
					prev.next = current.next;
					current.next = null;
				}
				System.out.println("Deleted key: "+key+" value: "+current.value);	
				return;
				
			}
			prev = current;
			current = current.next;
		}
	}


	public static void main(String[] args) {
		HashMapImpl map = new HashMapImpl();
		map.put(10, 1);
		map.put(26,10);
		map.put(20, 9);
		map.put(42, 37);
		int val = map.getValue(10);
		if(val != -1) {
			System.out.println("The value of the key is: "+val);
		}else {
			System.out.println("The key is not exists!");
		}
		
		map.display();
//		map.delete(20);
//		map.display();
		map.delete(26);
		map.display();
	}

	
}
