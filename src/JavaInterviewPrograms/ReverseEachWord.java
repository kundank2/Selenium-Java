package JavaInterviewPrograms;

import org.openqa.selenium.JavascriptExecutor;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str = "Hello World Java";
		String[] arr = str.split(" ");
		int len = arr.length;
		String rev = "";
		for(int i=0; i<=len-1; i++) {
			for(int j=arr[i].length()-1; j>=0; j--) {
				rev = rev + arr[i].charAt(j);
			}
			rev=rev+" ";
		}
		System.out.println(rev);
	
	}
}
