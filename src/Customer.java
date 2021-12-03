
public class Customer {
	//멤버변수 선언
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	//디폴트 생성자
	public Customer() {
		initCustomer();		
	}
		
	public String getCustomerName() {
		return customerName;
	}
	
	//오버로딩된 생성자
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	// 생성자에서 사용할 메서드
	private void initCustomer() {	//외부에서 접근 불가능하도록 private로 막음
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {	//보너스 포인트 업데이트, 가격 반환
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + ":" + customerGrade + ":" + bonusPoint;
	}
	
	
	
}