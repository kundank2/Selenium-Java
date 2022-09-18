
public class FactorialProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5, fact = 1;
		
		while(n != 0) {
			fact = fact*n;
			System.out.println(fact+"*"+n);
			n--;
		}
		System.out.println(fact);

	}

}
