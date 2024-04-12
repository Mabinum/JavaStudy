package override;

public class Quiz1 {

	public static void main(String[] args) {

		Cat cat = new Cat("쥐","야옹");
		Dog dog = new Dog("고기", "멍멍");
		
		cat.show();
		dog.show();
		
		
	}

}

class Animal{
	String eat;
	String Sound;
	public Animal(String eat, String sound) {
		super();
		this.eat = eat;
		Sound = sound;
	}
}

class Cat extends Animal {

	public Cat(String eat, String sound) {
		super(eat, sound);
	}
	
	public void show() {
		System.out.println("고양이는 " + eat + "를 먹는다.");
		System.out.println("고양이는 " + Sound + "라고 짖는다");
	}
	
}

class Dog extends Animal{

	public Dog(String eat, String sound) {
		super(eat, sound);
	}
	public void show() {
		System.out.println("개는 " + eat + "를 먹는다.");
		System.out.println("개는 " + Sound + "라고 짖는다");
	}
	
}