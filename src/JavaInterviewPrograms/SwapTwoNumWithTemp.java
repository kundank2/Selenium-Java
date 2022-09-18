package JavaInterviewPrograms;

public class SwapTwoNumWithTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10, num2 = 20, temp;
		System.out.println("Numbers before swap num1: "+num1+" num2: "+num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Numbers after swap num1: "+num1+" num2: "+num2);
	}

}
