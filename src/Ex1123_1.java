
public class Ex1123_1 {
	//��Ģ�����
	//������
	int result;	//������ ����� �Ӽ�
	int num1;	//��꿡 ���Ǵ� ���� �Ӽ�
	int num2;	//��꿡 ���Ǵ� ������ �Ӽ�
	
	//����Ʈ �����ڸ� �ݵ�� ����(���� ��� ��)
	public Ex1123_1() {	//����Ʈ ������ (�μ�����)
		
	}
	
	// ������(Ŭ������� ����, ��ȯŸ���� ����, �������� �޼��� ���� ����� ����)
	// �����ε��� ������
	public Ex1123_1(int n1, int n2) {	//�Ű����� �ִ� ������
		num1 = n1;
		num2 = n2;
	}
//***�߿�! set get 
	// ������ ����
	public void setNum1(int n1) {
		num1 = n1;
	}

	public void setNum2(int n2) {
		num2 = n2;
	}
	// ������ �б�
	public int getNum1() {
		return num1; 
	}
	public int getNum2() {
		return num2; 
	}
//***	

	
	public int add(int n1, int n2) {	//public ��ȯŸ�� �޼����(�Ű����� ����Ʈ)
		num1 = n1;	// ���� ������ �ʾƵ� �ǳ�,
		num2 = n2;	// ������ �ȵɼ� �ֱ⶧���� �־��ش�
		result = n1 + n2;	//���� ����
		return result;
	}

	//���� �޼���
	public int subtract(int n1, int n2) {
		num1 = n1;
		num2 = n2;
		result = n1 - n2;
		return result;
	}
	
	// �� �� ������ �޼���
	public int add() {
		result = num1 + num2;
		return result;
	}
	
	public int subtract() {
		result = num1 - num2;
		return result;
	}
	
	public int product() {
		result = num1 * num2;
		return result;
	}
	
	public int divide() {
		result = num1 / num2;
		return result;
	}
	
	//���� �޼���
	public int product(int n1, int n2) {
		num1 = n1;
		num2 = n2;
		result = n1 * n2;
		return result;
	}
	
	//������ �޼���
	public int divide(int n1, int n2) {
		num1 = n1;
		num2 = n2;
		result = n1 / n2;
		return result;
	}
	
}

