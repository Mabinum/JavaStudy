package inheritance;

public class Ex4 {

	public static void main(String[] args) {

		펜 pen = new 펜();
		볼펜 bollpen = new 볼펜();
		만년필 pencil = new 만년필();
		bollpen.굵기 = 2;
		bollpen.남은양 = 100;
		bollpen.색깔 = "파랑색";
		
		pencil.굵기 = 3;
		pencil.남은양 = 80;
		pencil.브랜드 = "몽블랑";
		
		bollpen.show();
		pencil.show();
		
	}

}

class 펜{
	int 굵기;
	int 남은양;
}

class 볼펜 extends 펜{
	String 색깔;
	public void show() {
		System.out.println("펜의 굵기: " + 굵기);
		System.out.println("남은양: " + 남은양 + "%");
		System.out.println("볼펜의 색: " + 색깔);
	}
}

class 만년필 extends 펜{
	String 브랜드;
	public void show() {
		System.out.println("펜의 굵기: " + 굵기);
		System.out.println("남은양: " + 남은양 + "%");
		System.out.println("브랜드 : "+ 브랜드);
	}
}
