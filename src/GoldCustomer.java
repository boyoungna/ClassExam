
public class GoldCustomer extends Customer {
	//extends Customer 를 입력해 상속받음.
	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);	//부모클래스의 생성자 호출(자동으로 호출 안됨)
		customerGrade = "GOLD";
		bonusRatio  = 0.02;
		saleRatio = 0.1;
	}
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;	//보너스 포인트 업데이트, 가격 반환
		return price - (int)(price * saleRatio);	
	}
	//showCustomerInfo() 메서드는 상위클래스 그대로 사용

}
