package JavaInterviewPrograms;

public class EachCharacterCount {

	public static void main(String[] args) {
		String str = "aaabaaacccdddbbhyhjdfhkmxzre";
		int len = str.length();
		int[] counter = new int[256];
		 // Count frequency of every character and store
        // it in counter array
		for(int i = 0; i<=len-1; i++) {
			counter[(int) str.charAt(i)]++;
		}
		 // Print Frequency of characters
		for(int i=0; i<256;i++) {
			if(counter[i] != 0) {
				System.out.println((char)i+"-->"+counter[i]);
			}
		}
	}
}
