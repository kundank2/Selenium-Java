package ToolsQA;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123211;
		int originalNum = num;
		int reverseNum = 0, remainder;
		
		
		while(num != 0) {
			remainder = num % 10;
			reverseNum = reverseNum * 10 + remainder;
			num = num / 10;
		
		}
		
		if (reverseNum == originalNum) {
			System.out.println(originalNum + " is Palindrome");
		} else {
			System.out.println(originalNum + " is not Palindrome");
		}

			}

}
