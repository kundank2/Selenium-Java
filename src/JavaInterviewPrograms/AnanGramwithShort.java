package JavaInterviewPrograms;

import java.util.Arrays;

public class AnanGramwithShort {
	static int flag[] = new int[25];

	public static void main(String[] args) {
		String word1 = "rescue";
		String word2 = "securq";
		anagram(word1, word2, 0,0);
		System.out.println(Arrays.toString(flag));

	}

	public static void anagram(String str1, String str2, int indx,int indx2) {
		System.out.println(Arrays.toString(flag));
		if (str1.length() - 1 < indx && (str2.length() - 1 < indx2)) {
			System.out.println(Arrays.toString(flag));
			
//			if (str2.length() - 1 < indx2) {
//				return;
//			}
//			if (flag[str2.charAt(indx2) - 'a'] == 0) {
//				flag[str2.charAt(indx2) - 'a'] = -1;
//				anagram(str1, str2,indx,++indx2);
//			} else  {
//				flag[str2.charAt(indx2) - 'a'] = flag[str2.charAt(indx2) - 'a'] - 1;
//				anagram(str1, str2,indx,++indx2);
//			}

			return; // fresh;
		}

		if (flag[str1.charAt(indx) - 'a'] == 0) {
			flag[str1.charAt(indx) - 'a'] = 1;
			//anagram(str1, str2, ++indx,indx2);
		} else if (flag[str1.charAt(indx) - 'a'] < 0 || flag[str1.charAt(indx) - 'a'] > 0) {
			flag[str1.charAt(indx) - 'a'] = flag[str1.charAt(indx) - 'a'] + 1;
			//anagram(str1, str2, ++indx,indx2);
		}
		
		
		if (flag[str2.charAt(indx2) - 'a'] == 0) {
			flag[str2.charAt(indx2) - 'a'] = -1;
			//anagram(str1, str2,indx,++indx2);
		} else  {
			flag[str2.charAt(indx2) - 'a'] = flag[str2.charAt(indx2) - 'a'] - 1;
			//anagram(str1, str2,indx,++indx2);
		}
		anagram(str1, str2,++indx,++indx2);

	}

}
