package variables_and_datatypes;

public class Accessvariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Variables.a);
		int arr[] = new int[]{1,5,3,4,2};
		int key =5;
		search(arr,key);
		

	}
	
	public static void search(int[] arr,int key) {
		int found=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				found=1;
				break;
			}
			
		
		}
		
		if(found==1) {
			System.out.println("found");
		}else {
			System.out.println("not found");
		}
	}

}
