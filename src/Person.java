
public class Person {	//������
	String name;
	int height;
	int weight;
	
	// �����ڰ� �Ѱ��� ���� ��� ����Ʈ �����ڰ� ������
	
	// *������ �ۼ� ��Ģ*
	// Ŭ������� ����
	// ��ȯŸ���� ����(���� ����)
	// ��������� ����Ʈ ������ �ʿ�
	public Person() {		//*����Ʈ �����ڵ�* �ƹ� ���뵵 ���� ����� �ֱ⸸ �ص� OK
		
	}
	 // �����ε� �� ������ 
	public Person(String pName) {//������ �̸��� ����, �Ű����� �ٸ�(����, Ÿ��, ����)
		name = pName;
	}
	public Person(String pName, int pHeight, int pWeight) {
		name = pName;
		height = pHeight;
		weight = pWeight;
	}
	// �޼���

	public String getName() {
			return name;
	}
	
	//Ű�� �����Ը� ���� ������ �� �ִ� �޼��� �߰�
	
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}

	
	
	//����, Ű, �����Ը� �ѹ��� ������ �� �ִ� �޼��� �߰�
	
	public void setPerson(String pName, int pHeight, int pWeight) {
		name = pName;
		height = pHeight;
		weight = pWeight;

	}
}
	
	
	
	
	
	
	
//	String Smile() {
//		
//	Smile sm1 = new Smile();
//	Smile sm2 = new Smile("������");
//	
//	public String getSmileName();{
//		System.out.println(sm2.getName());
//		
//	}
//	
//	}


