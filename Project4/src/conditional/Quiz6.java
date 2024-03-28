package conditional;

public class Quiz6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int 점수 = 50;
		
		if(점수>=90 && 점수<=99) {
			System.out.println("수");
		} else if(점수>=80 && 점수<=89) {
			System.out.println("우");
		} else if(점수>=70 && 점수<=79) {
			System.out.println("미");
		} else {
			System.out.println("양");
		}
	}

}
