package loop;

public class Quiz8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i<=9; i++) {
			if(i%2 == 0) continue;
			for(int u = 1; u<=9; u++) {
				System.out.println(i + " 단 : " + i + " X " + u + " = " + i*u);
			}
		}
	}

}
