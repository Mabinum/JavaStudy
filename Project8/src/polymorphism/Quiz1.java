package polymorphism;

public class Quiz1 {

	public static void main(String[] args) {

		runCar(new Bus());
		runCar(new SportCar());
		
		
	}
	
	public static void runCar(Car car) {
		car.drive();
	}
}

class Car{
	public void drive() {
		System.out.println("주행한다");
	}
}

class Bus extends Car{

	@Override
	public void drive() {
		System.out.println("버스가 달린다");
	}
	
}

class SportCar extends Car {

	@Override
	public void drive() {
		System.out.println("스포츠카가 달린다.");
	}
	
}
