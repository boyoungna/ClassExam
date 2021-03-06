
public class Student {
	// 멤버 변수
	public static int serialNum = 1000; //선언과 동시에 초기화 해줘야 함 (static). 
										//인스턴스(객체)생성과 무관함, 모든 객체에서 공용으로 사용
	public int studentId;
	public String studentName;
	public int grade;		//특별한 경우가 아니라면 대문자로 시작하는 것은 class 이름 뿐.//
	public String address;
	//생성자
	
	/* 중요 */
	public Student(String studentName) {
		this.studentName = studentName;
		serialNum++;	
		this.studentId = serialNum;
	}
	
	
	public Student() {
		serialNum++;	//클래스 공통
		studentId = serialNum;
	}
	//오버로딩 된 생성자

	
	
	public void Student(String StudentName, String addressName) {
		this.studentName = studentName;
		this.address = addressName;
	}

	//메서드
	public String getstudentName() {		//읽기 //get 반환 타입이 없다면 읽거나 쓰기만 하기도 함
		return studentName;
	}
	
	
	public int getStudentId() {
		return studentId;
	}
	
	
	public String getaddressName() {
		return address;
	}
	public void setStudentName(String studentName) {	//쓰기 //set
		this.studentName = studentName;
	}
	public void setAddressName(String addressName) {
		this.address = addressName;
	}
	public void showCheckInfo() {
		System.out.println(getstudentName() + ":" + getStudentId());
	}

	public static int getSerialNum() {	
		int i = 10;	//지역변수 사용가능
		return serialNum;
	}
	//오버로딩 된 메서드
	
	public Student(String StudentName, String Address) {
		serialNum++;
	}
//	public static int[] getSerialNum() {
//		return serialNum;
//	}
	//진입점(main) (필요에 따른 유무)
	public static void main(String args[]) {	// 진입점, 운영체제에서 program !호출!하는 목적으로 사용
												//Student 클래스의 영역이 아님. 관계 없는 영역
												//static 메인 메소드 때문에 객체 생성이 되지 않음. 	11:19 영역에서는 가능
		//클래스명 변수명 = new 생성자() (배정 연산자)
		 Student st1 = new Student();	//객체 생성
		 st1.setStudentName("홍길동");	//이렇게 하는 방식은 오류가 많아 불안정한 방식이므로 29:30을 사용하는것이 좋다.
		//st1 객체 변수를 입력해 줬기때문에 출력 가능 
		 System.out.println(st1.studentName);
		 System.out.println(st1.getstudentName());
	}
	
}

