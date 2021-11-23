
public class Ex1123_1 {
	//사칙연산기
	//제한적
	int result;	//연산결과 저장용 속성
	int num1;	//계산에 사용되는 왼쪽 속성
	int num2;	//계산에 사용되는 오른쪽 속성
	
	//디폴트 생성자를 반드시 구현(내용 없어도 됨)
	public Ex1123_1() {	//디폴트 생성자 (인수없음)
		
	}
	
	// 생성자(클래스명과 동일, 반환타입이 없음, 나머지는 메서드 정의 방법과 동일)
	// 오버로딩된 생성자
	public Ex1123_1(int n1, int n2) {	//매개변수 있는 생성자
		num1 = n1;
		num2 = n2;
	}
//***중요! set get 
	// 데이터 쓰기
	public void setNum1(int n1) {
		num1 = n1;
	}

	public void setNum2(int n2) {
		num2 = n2;
	}
	// 데이터 읽기
	public int getNum1() {
		return num1; 
	}
	public int getNum2() {
		return num2; 
	}
//***	

	
	public int add(int n1, int n2) {	//public 반환타입 메서드명(매개변수 리스트)
		num1 = n1;	// 굳이 써주지 않아도 되나,
		num2 = n2;	// 실행이 안될수 있기때문에 넣어준다
		result = n1 + n2;	//덧셈 실행
		return result;
	}

	//뺄셈 메서드
	public int subtract(int n1, int n2) {
		num1 = n1;
		num2 = n2;
		result = n1 - n2;
		return result;
	}
	
	// 좀 더 간결한 메서드
	public int add() {
		result = num1 + num2;
		return result;
	}
	
	public int subtract() {
		result = num1 - num2;
		return result;
	}
	
	public int product() {
		result = num1 * num2;
		return result;
	}
	
	public int divide() {
		result = num1 / num2;
		return result;
	}
	
	//곱셈 메서드
	public int product(int n1, int n2) {
		num1 = n1;
		num2 = n2;
		result = n1 * n2;
		return result;
	}
	
	//나눗셈 메서드
	public int divide(int n1, int n2) {
		num1 = n1;
		num2 = n2;
		result = n1 / n2;
		return result;
	}
	
}

