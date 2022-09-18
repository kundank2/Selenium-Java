package JavaInterviewPrograms;



public class CountDuplicateCharacters {
	
			
	public static void main(String[] args) {
//		String str = "aabbbddbbbssjn";
//		int len = str.length();
//		int count;
//		for(int i = 0; i < len; i++) {
//			count = 1;
//			char c = str.charAt(i);
//			if(c == ' ')
//				continue;
//			for(int j = i+1; j < len; j++) {
//				if(c == str.charAt(j)) {
//					count++;
//					str = str.substring(0, j) + str.substring(j+1);
//				}
//			}
//			if(count > 1) {
//				System.out.println(c + " found "+count+" times ");
//			}
//		}
//		String str = "Hello World Java";
//		String[] strArr = str.split(" ");
//		int len = strArr.length;
//		String rev = "";
//		for(int i = 0; i < len; i++) {
//			for(int j = strArr[i].length()-1; j >= 0; j--) {
//				rev = rev + strArr[i].charAt(j);
//			}
//			rev = rev + " ";
//		}
//		System.out.println(rev);
//		
		
//		String str = "Robed".toLowerCase();
//		String str1 = "Bored".toLowerCase();
//		
//		
//		String[] arr = str.split("");
//		String[] arr1 = str1.split("");
//		Arrays.sort(arr);
//		Arrays.sort(arr1);
//		
//		String word = Arrays.toString(arr);
//		String word1 = Arrays.toString(arr1);
//		if(word.equals(word1)) {
//			System.out.println("str and str1 are anagram : "+word+"   "+word1);
//		}else {
//			System.out.println("str and str1 are not an anagram : "+word+"   "+word1);
//		}
		String str = "Kundan Kumar";
		String[] str1 = str.split("");
 		int len = str1.length;
		int count = 0;
		for(int i = 0; i < len; i++) {
			for(int j = i+1; j < len; j++) {
				if(str1[i] == str1[j] && str1[i] != "") {
					
				}
			}
			if(str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("Total characters are:- "+count);
	}
}
