package JavaInterviewPrograms;

import java.util.Arrays;

public class secondLargestNumber {
	public static void main(String args[]){
	      int array[] = {10,75,98,89, 20,57,63, 25, 63, 96, 57};
	      int size = array.length;
	      int temp;
	      for(int i=0; i<size; i++) {
	    	  for(int j=i+1; j<size; j++) {
	    		  if(array[i] > array[j]) {
	    			  temp = array[i];
	    			  array[i] = array[j];
	    			  array[j] = temp;
	    		  }
	    	  }
	      }
	      System.out.println(array[size-2]);
//	      Arrays.sort(array);
//	      System.out.println("sorted Array ::"+Arrays.toString(array));
//	      int res = array[size-2];
//	      System.out.println("2nd largest element is ::"+res);
	   }
}
