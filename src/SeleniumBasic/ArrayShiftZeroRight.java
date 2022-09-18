import java.util.ArrayList;


public class ArrayShiftZeroRight {

	public static void main(String[] args) {
		int[] arr = {7,9,0,1,0,5,0,6,0,0,0,0};
		int len = arr.length;
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();

		for(int i=0;i<=len-1;i++){
		  if(arr[i] == 0){
			 arr1.add(arr[i]);
		   } else {
			   arr2.add(arr[i]);
		   }
		}
arr2.addAll(arr1);
System.out.println(arr2);
	}
}
