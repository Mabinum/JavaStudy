package override;

public class Ex1 {

	public static void main(String[] args) {

		Customer customer = new Customer("둘리"); //일반 회원 생성
		customer.calcPrice(10000); //일반 등급이므로 정가를 그대로 지불
		customer.showInfo();
		
		VIPCustomer vip = new VIPCustomer("또치"); //VIP 생성
		vip.calcPrice(10000); //VIP 등급이므로 10% 할인받아서 9000원을 지불
		vip.showInfo();		
		
	}

}
class Customer {
	String customerName;
	String customerGrade;
	double bonusPoint;
	double bonusRatio;

	public Customer(String customerName) {
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		System.out.println(customerName + "님이 " + price + "원을 결제했습니다.");
	}

	public void showInfo() {
		System.out.println(customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.");
	}

}

class VIPCustomer extends Customer {

	double saleRatio;

	public VIPCustomer(String customerName) {
		super(customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	@Override
	public void calcPrice(int price) {
		bonusPoint += ( price * bonusRatio );
		int salePrice = price - (int)(price * saleRatio);
		System.out.println(customerName + "님이" + salePrice + "원을 결제했습니다.");
	}
	
	
}