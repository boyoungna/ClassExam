
public class Student {
	// ��� ����
	int studentID;
	String studentName;
	int grade;		//Ư���� ��찡 �ƴ϶�� �빮�ڷ� �����ϴ� ���� class �̸� ��.//
	String address;
	//������
	//�����ε� �� ������
	//�޼���
	public void showStudentInfo() {
		System.out.println(studentName  + "===" + address);
	}
	public String getstudentName() {		//�б� //get ��ȯ Ÿ���� ���ٸ� �аų� ���⸸ �ϱ⵵ ��
		return studentName;
	}
	public void setStudentName(String name) {	//���� //set
		studentName = name;
	}
	//�����ε� �� �޼���
	
	//������(main) (�ʿ信 ���� ����)
	public static void main(String args[]) {	// ������, �ü������ program !ȣ��!�ϴ� �������� ��� //Student Ŭ������ ������ �ƴ�. ���� ���� ����
											//static ���� �޼ҵ� ������ ��ü ������ ���� ����. 	11:19 ���������� ����
		//Ŭ������ ������ = new ������() (���� ������)
		 Student st1 = new Student();	//��ü ����
		 st1.setStudentName("ȫ�浿");	//�̷��� �ϴ� ����� ������ ���� �Ҿ����� ����̹Ƿ� 29:30�� ����ϴ°��� ����.
		//st1 ��ü ������ �Է��� ��⶧����(26��) ��� ���� 
		 System.out.println(st1.studentName);
		 System.out.println(st1.getstudentName());
	}
	
}

