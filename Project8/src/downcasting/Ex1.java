package downcasting;

public class Ex1 {

	public static void main(String[] args) {

//		부모타입으로 형변환
		Animal animal = new Human();
		
		if(animal instanceof Human) {
			
			Human human = (Human) animal;
			
			human.readBook();
			
		}
		
	}

}

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷습니다");
	}
	
	public void readBook(){
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}