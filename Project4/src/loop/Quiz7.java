package loop;

public class Quiz7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i = 3; i<=9; i++) {
//			for(int u = 1; u<=9; u++) {
//				System.out.println(i + " 단 : " + i + " X " + u + " = " + i*u);
//			}
//			System.out.println();
//		}
		
		for(int i = 1; i<=9; i++) {
			if(i<=2) continue;
			for(int u = 1; u<=9; u++) {
				System.out.println(i + " 단 : " + i + " X " + u + " = " + i*u);
			}
			System.out.println();
		}
	}

}
