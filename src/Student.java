
public class Student {
	// ��� ����
	public static int serialNum = 1000; //����� ���ÿ� �ʱ�ȭ ����� �� (static). 
										//�ν��Ͻ�(��ü)������ ������, ��� ��ü���� �������� ���
	public int studentId;
	public String studentName;
	public int grade;		//Ư���� ��찡 �ƴ϶�� �빮�ڷ� �����ϴ� ���� class �̸� ��.//
	public String address;
	//������
	public Student() {
		serialNum++;	//Ŭ���� ����
		studentId = serialNum;
	}
	//�����ε� �� ������
	//�޼���
//	public void showStudentInfo() {
//		System.out.println(studentName  + "===" + address);
//	}
	public String getstudentName() {		//�б� //get ��ȯ Ÿ���� ���ٸ� �аų� ���⸸ �ϱ⵵ ��
		return studentName;
	}
	
	public void setStudentName(String studentName) {	//���� //set
		this.studentName = studentName;
	}
	
	public static int getSerialNum() {	
		int i = 10;	//�������� ��밡��
		return serialNum;
	}
	//�����ε� �� �޼���
	
	//������(main) (�ʿ信 ���� ����)
//	public static void main(String args[]) {	// ������, �ü������ program !ȣ��!�ϴ� �������� ���
//												//Student Ŭ������ ������ �ƴ�. ���� ���� ����
//												//static ���� �޼ҵ� ������ ��ü ������ ���� ����. 	11:19 ���������� ����
//		//Ŭ������ ������ = new ������() (���� ������)
//		 Student st1 = new Student();	//��ü ����
//		 st1.setStudentName("ȫ�浿");	//�̷��� �ϴ� ����� ������ ���� �Ҿ����� ����̹Ƿ� 29:30�� ����ϴ°��� ����.
//		//st1 ��ü ������ �Է��� ��⶧���� ��� ���� 
//		 System.out.println(st1.studentName);
//		 System.out.println(st1.getstudentName());
//	}
//	
}

