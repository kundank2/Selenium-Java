package JavaInterviewPrograms;

public class PalindromeOrNot {
	
	public static boolean isPalindrome(String str) {
		if(str == null) {
			return false;
		}
		for(int i = 0, j = str.length() - 1; i < j; i++, j--) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "naman";
		if(isPalindrome(str)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}

	}

}
