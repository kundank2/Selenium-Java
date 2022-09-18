package JavaInterviewPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0, num2 = 1, sum;
		int count = 10;
		
		System.out.print(num1 +", "+num2);
		for(int i=2; i<count;i++) {
			sum = num1+num2;
			System.out.print(", " +sum);
			num1=num2;
			num2=sum;
		}

	}

}
