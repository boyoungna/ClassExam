import java.util.*;
	public class Students {
	//�������
	private int studentId;
	private String sutdentName;
	private ArrayList<Subject> subjectList;
	
	//������
	public Students() {
		
	}
	
	public Students(int studentId, String studentName) {
		this.studentId = studentId;
		this.sutdentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	//������ ������ �߰��ϴ� �޼���, �л����� ���� ó��
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	public void showStudentInfo() {
		int total = 0;	//���� ��� ��������
		System.out.println("===============================");
		for (Subject s : subjectList ) {	//����� ���� ����ŭ �ݺ�
			total += s.getScorePoint();	//���� ����
			System.out.print(s.getName() + ":" + s.getScorePoint() + " ");
		}
		System.out.println();
		System.out.println("����:" + total);
		System.out.println("===============================");
	}
}
