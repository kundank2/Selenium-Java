package Arrays;

public class DuplicateArrayElement {

	public static void main(String[] args) {
		int[] arr = {2,3,4,5,2,1,4,5,3,3,3,3,7,6};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}
}
