
public class StudentTest1 {

	public static void main(String[] args) {
		// Student 클래스 테스트
		
		System.out.println(Student.getSerialNum());	//객체생성과 무관. 객체 생성을 일일히 하면 사용이 불편하기 때문에 static을 사용함
		
		Student st1 = new Student();	//디폴트 생성자
		st1.setStudentName("홍길동");
		/*
		//System.out.println(st1.studentName);	//public 멤버변수이므로 가능
		//System.out.println(st1.getstudentName());	//public 메서드이므로 가능
		//st1.serialNum++;
		*/
		
		System.out.println(Student.getSerialNum());	//static 변수 읽기. private class 에서는 못읽음. class 내부에서는 상관X
		System.out.println(st1.getstudentName() + ":" + st1.studentId);
		Student st2 = new Student();
		st2.setStudentName("김삿갓");
		System.out.println(Student.getSerialNum());//16항을 17항처럼 class 명으로 해줘도 동일한 출력값.테스트변수만*
		System.out.println(st2.getstudentName() + ":" + st2.studentId);
		

	}
}
