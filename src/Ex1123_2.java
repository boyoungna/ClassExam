
public class Ex1123_2 {

	public static void main(String[] args) {
		// 인스턴스 생성해야 클래스 사용 가능
		// 클래스명 변수명 = new 생성자
		// 디폴트 생성자는 클래스명과 동일. 매개변수 없음
	
		//덧셈 테스트
		Ex1123_1 cal1 = new Ex1123_1();		// 디폴트 생성자로 인스턴스 생성 (객체 생성)
		
		System.out.println(cal1.num1);
		System.out.println(cal1.num2);
		System.out.println(cal1.result);
		System.out.println(cal1.add(10, 20));		// cal1. 을쓰면 앞에 써준 add 서식이 정확하다면 나타남. 10+20 바로 출력
		int test = cal1.add(1, 2);			// 1+2 결과가 test에 반환
		System.out.println(test);
		
		//곱셈 테스트
		System.out.println(cal1.product(11, 5));
		int test2 = cal1.product(11, 21);
		System.out.println(test2);
		
		System.out.println(cal1.num1);
		System.out.println(cal1.num2);
		System.out.println(cal1.result);
		
		//두번째 객체 생성 및 테스트
		Ex1123_1 cal2= new Ex1123_1(3, 5);	//객체 생성 (인스턴스 생성)
		System.out.println(cal2.add(24, 61));
		System.out.println(cal2.subtract(150, 20));
		System.out.println(cal2.product(11, 12));
		System.out.println(cal2.divide(560, 8));
		
		//세번째 객체 생성 및 테스트
		Ex1123_1 cal3 = new Ex1123_1(10,5);
		// 10+5 출력
		System.out.println(cal3.getNum1() + "+" + cal3.getNum2() + "=" + cal3.add(10, 5));
	
		//네번째 객체 생성 및 테스트
		//디폴트 생성자로 생성 후 매개변수(9, 10) 추가 & 곱셈 출력 테스트 getset
		Ex1123_1 cal4 = new Ex1123_1();
		cal4.setNum1(9);
		cal4.setNum2(10);
		System.out.println(cal4.getNum1() + "*" + cal4.getNum2() + "=" + cal4.product());
		System.out.println(cal4.getNum1() + "+" + cal4.getNum2() + "=" + cal4.add());

		
		//나눗셈 테스트
		System.out.println(cal1.divide(300, 5));
		int test3 = cal1.divide(200, 11);
		System.out.println(test3);

		//뺄셈 테스트
		System.out.println(cal1.subtract(300, 200));
		int test4 = cal1.subtract(200, 120);
		System.out.println(test4);
		
	}

	
}
