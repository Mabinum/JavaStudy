package method;

public class Quiz5 {

	public static int 나누기(int n1, int n2) {
		int result = 0;
		if(n2 == 0) {
			System.out.println("나누는 수는 0이 될 수 없습니다");
		} else {
			result = n1/n2;
			System.out.println(result);
		}
		return result;
	}
	
	public static void main(String[] args) {
		나누기(15,4);
	}

}
