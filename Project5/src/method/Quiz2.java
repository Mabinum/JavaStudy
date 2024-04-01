package method;

public class Quiz2 {

	public static int 비교(int n1, int n2) {
		if (n1 > n2) {
			return n1;
		} else {
			return n2;
		}
	}
	
	
	public static void main(String[] args) {
		int result = 비교(5, 10);
		System.out.println(result);
	}

}
