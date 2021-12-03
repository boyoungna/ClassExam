
public class VIPCustomer extends Customer{
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);	//�θ�Ŭ������ ������ ȣ��(�ڵ����� ȣ�� �ȵ�)
		customerGrade = "VIP";
		bonusRatio  = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	//�޼��� �������̵�
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;	//���ʽ� ����Ʈ ������Ʈ, ���� ��ȯ
		return price - (int)(price * saleRatio);	//price�� ���������� �������
	}
	
	//�޼��� �������̵�
	public String showCustomerInfo() {
		return super.showCustomerInfo() + ":" + agentID;
	}
	
	
}
