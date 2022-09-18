package JavaInterviewPrograms;

public class Demo {

	public static void main(String[] args) {
		int[] arr = {23,12,34,54,32,54,87,23,43,31};
		int temp=0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		} 
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			sum = sum + arr[i];
		}
		System.out.println();
		System.out.println(sum);
//		int[] arr = {1,3,2,3,4,5,3,2,1,5,6,4,3,2,1};
//		int[] fr = new int[arr.length];
//		int visited = -1;
//		for(int i = 0; i < arr.length; i++) {
//			int count = 1;
//			for(int j = i+1; j < arr.length; j++) {
//				if(arr[i] == arr[j]) {
//					count++;
//					fr[j] = visited;
//				}
//			}
//			if(fr[i] != visited) {
//				fr[i] = count;
//			}
//			
//		}
//		for(int i = 0; i < fr.length; i++) {
//			if(fr[i] != visited) {
//				System.out.println(" "+arr[i]+"   "+fr[i]);
//			}
//		}
//		int[] arr = {1,2,3,4,5,6};
//		int n = 3;
//		for(int i = 0; i<n;i++) {
//			int j,first;
//			first = arr[0];
//			for(j=0;j<arr.length-1;j++) {
//				arr[j] = arr[j+1];
//				
//			}
//			arr[j] = first;
//		}
//		for(int i=0; i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
	}

}
