package instance;

public class Quiz2 {

class Order { 
	int 주문번호;
	
	String 주문날짜;
	
	String 주문자이름;
	
	String 배송지;


}
public void showOrderInfo () {
	System.out.println(order.주문번호,order.주문날짜,order.주문자이름,order.배송지);
}
	public static void main(String[] args) {
		Order order = new order();
		
		order.주문번호 = 1111;
		order.주문날짜 = "2018년3월12일";
		order.주문자이름 = "둘리";
		order.배송지 = "서울시 영등포구 여의도동 20번지";
		
		showOrderInfo();

}
