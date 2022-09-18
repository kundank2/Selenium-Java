package JavaInterviewPrograms;

import java.util.Arrays;

public class CountDuplicateWords {

	public static void main(String[] args) {
		String str = "India is a great country where people speak different languages but the national language is Hindi. India is full of different castes, creeds, religion, and cultures but they live together. Thats the reasons India is famous for the common saying of unity in diversity";
		//String[] strArr = str.split("[^a-zA-Z0-9]");
		String str2[]=str.replace(".", "").split("[^a-zA-Z0-9]");
//		System.out.println(str2.length);
//		
//		String str1 = Arrays.toString(str2);
//		System.out.println(str1);
		
		int count = 0;
		int len = str2.length;
		for(int i = 0; i<=len-1; i++) {
			if(str2[i].equalsIgnoreCase("India")) {
				count++;
			}
		}
		System.out.println(count);
	}
}
