import java.util.*;
	public class Students {
	//멤버변수
	private int studentId;
	private String sutdentName;
	private ArrayList<Subject> subjectList;
	
	//생성자
	public Students() {
		
	}
	
	public Students(int studentId, String studentName) {
		this.studentId = studentId;
		this.sutdentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	//과목명과 점수를 추가하는 메서드, 학생마다 각각 처리
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	public void showStudentInfo() {
		int total = 0;	//총점 계산 지역변수
		System.out.println("===============================");
		for (Subject s : subjectList ) {	//저장된 원소 수만큼 반복
			total += s.getScorePoint();	//총점 누적
			System.out.print(s.getName() + ":" + s.getScorePoint() + " ");
		}
		System.out.println();
		System.out.println("총점:" + total);
		System.out.println("===============================");
	}
}
