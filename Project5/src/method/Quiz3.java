package method;

public class Quiz3 {

	public static void 합(int n1, int n2) {
		int sum = 0;
		for (int i = n1; i<=n2; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		합(5, 10);
	}

}
