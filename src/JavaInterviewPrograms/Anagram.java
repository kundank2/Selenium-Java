package JavaInterviewPrograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "rescue".toLowerCase();
		String word2 = "secure".toLowerCase();
		
		String[] word1Arr = word1.split("");
		String[] word2Arr = word2.split("");
		
		
		
		Arrays.sort(word1Arr);
		Arrays.sort(word2Arr);
		
		
		String str1=Arrays.toString(word1Arr);
		String str2=Arrays.toString(word2Arr);
		
		if(str1.equals(str2)) {
			System.out.println("Anagram "+str1+"  "+str2);
		}else {
			System.out.println("Not an Anagram "+str1+"  "+str2);
		}

	}

}
