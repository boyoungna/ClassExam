
public class Student {
	// 멤버 변수
	int studentID;
	String studentName;
	int grade;		//특별한 경우가 아니라면 대문자로 시작하는 것은 class 이름 뿐.//
	String address;
	//생성자
	//오버로딩 된 생성자
	//메서드
	public void showStudentInfo() {
		System.out.println(studentName  + "===" + address);
	}
	public String getstudentName() {		//읽기 //get 반환 타입이 없다면 읽거나 쓰기만 하기도 함
		return studentName;
	}
	public void setStudentName(String name) {	//쓰기 //set
		studentName = name;
	}
	//오버로딩 된 메서드
	
	//진입점(main) (필요에 따른 유무)
	public static void main(String args[]) {	// 진입점, 운영체제에서 program !호출!하는 목적으로 사용 //Student 클래스의 영역이 아님. 관계 없는 영역
											//static 메인 메소드 때문에 객체 생성이 되지 않음. 	11:19 영역에서는 가능
		//클래스명 변수명 = new 생성자() (배정 연산자)
		 Student st1 = new Student();	//객체 생성
		 st1.setStudentName("홍길동");	//이렇게 하는 방식은 오류가 많아 불안정한 방식이므로 29:30을 사용하는것이 좋다.
		//st1 객체 변수를 입력해 줬기때문에(26항) 출력 가능 
		 System.out.println(st1.studentName);
		 System.out.println(st1.getstudentName());
	}
	
}

