
public class Customer {
	//������� ����
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	//����Ʈ ������
	public Customer() {
		initCustomer();		
	}
		
	public String getCustomerName() {
		return customerName;
	}
	
	//�����ε��� ������
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	// �����ڿ��� ����� �޼���
	private void initCustomer() {	//�ܺο��� ���� �Ұ����ϵ��� private�� ����
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {	//���ʽ� ����Ʈ ������Ʈ, ���� ��ȯ
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + ":" + customerGrade + ":" + bonusPoint;
	}
	
	
	
}