package JavaInterviewPrograms;

public class MissingArrayNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
		
		int sum = 0;
		int sum1 = 0;
		
		for(int i=0; i<a.length; i++) {
			sum = sum+a[i];
		}
		System.out.println(sum);
		for(int j=1; j<=20; j++) {
			sum1 = sum1 + j;
		}
		System.out.println(sum1);
		
		System.out.println("Missing Array Num: - " +(sum1-sum));
		

	}

}
