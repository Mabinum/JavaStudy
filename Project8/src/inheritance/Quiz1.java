package inheritance;

public class Quiz1 {

	public static void main(String[] args) {

		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();
		
		tiger.다리 = 4;
		tiger.꼬리 = 1;
		
		eagle.다리 = 2;
		eagle.날개 = 2;
		
		tiger.Tigers();
		tiger.Animals();
		
		eagle.Animals();
		eagle.Eagles();
		
	}

}

class Animal {
	int 다리;
	public void Animals(){
		System.out.println("다리의 수는 " + 다리);
	}
}

class Tiger extends Animal{
	int 꼬리;
	public void Tigers() {
		System.out.println("꼬리의 수는 " + 꼬리);
	}
}

class Eagle extends Animal{
	int 날개;
	public void Eagles() {
		System.out.println("날개의 수는 "+ 날개 );
	}
}
