
//1. 학생의 성적처리 클래스 정의 (Score)
// -디폴트
//(홍길동,70,70,70) 고정해보기
//-오버로딩된 생성자(모든 정보)
//
//2. 속성 정의
//-학생성명(String)/국어점수(int)/영어점수/수학점수
//
//
//3.메서드
//-set, get: 성명 국 영 수
//-총점을 반환하는 메서드 (get)
//-평균   반환하는 메서드 (get) 리턴시켜서..
//4.테스트 클래스
//2명 테스트

public class Score {
	String name;
	int kor;
	int eng;
	int math;
	
	public Score() {
		name = "홍길동";
		kor = 70;
		eng = 70;
		math = 70;
	}
	public Score(String sname, int skor, int seng, int smath) {
		name = sname;
		kor = skor;
		eng = seng;
		math = smath;
		
	}
	
	
	public Score(String sname) {
		name = sname;
	}

	public void setname(String sname) {
		name = sname;
	}
	
	public void seteng(int seng) {
		eng = seng;
	}
	public void setkor(int skor) {
		kor = skor;
	}
	public void setmath(int smath) {
		math = smath;
	}
	
	

	public String getName() {
		return name;
	}
	public int getkor() {
		return kor;	
	}
	public int geteng() {
		return eng;	
	}
	public int getmath() {
		return math;	
	}
	
	public int getTotal() {
		return kor+eng+math;
	}

//소수점의 평균 내는법 2가지
	public double getAvg() {
		return (double)getTotal()/3;	//더블과 겟토탈을 괄호 안에 ※한번에 묶어주지 않을것 주의※
	}
	
//	public double getAvg() {
//		return getTotal()/3.0;
//	}
	
	public int getPg() {
		return (kor+eng+math)/3;
	}
	
	
	
	
	
	
}
