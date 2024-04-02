package method;

public class Quiz6 {

	public static int 계산기 (int n1, int n2, char n3) {
		int result = 0;
		if(n3 == '+') {
			result = n1 + n2;
		} else if(n3 == '-') {
			result = n1 - n2;
		} else if(n3 == '*') {
			result = n1 * n2;
		} else if(n3 == '/') {
			result = n1 / n2;
		}
		System.out.println(result);
		return result;
	}
	
	
	public static void main(String[] args) {
		계산기 ( 3 , 1 , '+');
	}

}
