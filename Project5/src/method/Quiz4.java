package method;

public class Quiz4 {

	public static int 빼기(int n1, int n2) {
		int result = 0;
		if(n1<n2) {
			result = -999;
		} else {
			result = n1 - n2;
		}
		System.out.println(result);
		return result;
	}
	
	public static void main(String[] args) {
		빼기(3,4);
	}

}
