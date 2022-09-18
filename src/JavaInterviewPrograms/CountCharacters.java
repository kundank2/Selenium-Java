package JavaInterviewPrograms;

public class CountCharacters {

	public static void main(String[] args) {
		String str = "Kundan Kumar";
		int len = str.length();
		int count =0;
		for(int i=0; i<=len-1; i++)		{
			if(str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
