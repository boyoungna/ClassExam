
public class StudentTest1 {

	public static void main(String[] args) {
		// Student Ŭ���� �׽�Ʈ
		
		System.out.println(Student.getSerialNum());	//��ü������ ����. ��ü ������ ������ �ϸ� ����� �����ϱ� ������ static�� �����
		
		Student st1 = new Student();	//����Ʈ ������
		st1.setStudentName("ȫ�浿");
		/*
		//System.out.println(st1.studentName);	//public ��������̹Ƿ� ����
		//System.out.println(st1.getstudentName());	//public �޼����̹Ƿ� ����
		//st1.serialNum++;
		*/
		
		System.out.println(Student.getSerialNum());	//static ���� �б�. private class ������ ������. class ���ο����� ���X
		System.out.println(st1.getstudentName() + ":" + st1.studentId);
		Student st2 = new Student();
		st2.setStudentName("���");
		System.out.println(Student.getSerialNum());//16���� 17��ó�� class ������ ���൵ ������ ��°�.�׽�Ʈ������*
		System.out.println(st2.getstudentName() + ":" + st2.studentId);
		

	}
}
