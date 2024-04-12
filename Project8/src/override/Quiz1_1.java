package override;
/*
 * 동물, 고양이, 강아지 클래스를 정의하세요.
 * 동물클래스에서 상속받은 메소드를 재정의하세요 eat(), sound()
 * */
public class Quiz1_1 {

	public static void main(String[] args) {

		Cat1 cat = new Cat1();
		Dog1 dog = new Dog1();
		cat.eat();
		cat.Sound();
		dog.eat();
		dog.Sound();
	}
}

class Animal1 {
	public void eat() {
		System.out.println("먹이를 먹는다");
	}
	public void Sound() {
		System.out.println("짖는다");
	}
}

class Cat1 extends Animal1{

	@Override
	public void eat() {
		System.out.println("고양이는 쥐를 먹는다.");
	}

	@Override
	public void Sound() {
		System.out.println("고양이는 야옹하고 짖는다.");
	}
	
}

class Dog1 extends Animal1{

	@Override
	public void eat() {
		System.out.println("개는 고기를 먹는다");
	}

	@Override
	public void Sound() {
		System.out.println("개는 멍멍하고 짖는다.");
	}
	
}