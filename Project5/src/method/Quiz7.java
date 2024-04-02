package method;

public class Quiz7 {

	public static void 합(int n) {
		int n1 = n/100;
		int n2 = n%100/10;
		int n3 = n%100%10;
		
		int result = n1 + n2 + n3;
		
		System.out.println(result);
		
	}
	
	public static void main(String[] args) {

		합(932);
		
	}

}
