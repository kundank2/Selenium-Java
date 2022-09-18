package JavaInterviewPrograms;

public class ReverseNumber {

	public int reverseNum(int num) {
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNumber reverse = new ReverseNumber();
		System.out.println(reverse.reverseNum(12345678));;

	}

}
