
public class PersonTest {

	public static void main(String[] args) {
		// Person 클래스 테스트
		//오버로딩된 생성자가 있을 경우 *디폴트 생성자도 구현해야 함* (내용 없어도 됌)
		Person hu1 = new Person();	//디폴트 생성자
		Person hu2 = new Person("홍길동");	//매개변수 1개 생성자

		System.out.println(hu2.getName());

	
		//추가된 메서드 기능 테스트
		Person hu3 = new Person("김삿갓", 170, 70); 
		System.out.println("성명 :" + hu3.getName() + ", 키 : " + hu3.getHeight() + "몸무게 : " + hu3.getWeight());
		hu3.setPerson("김삿갓", 160, 80);
		System.out.println("성명 : " + hu3.getName() + ", 키 : " + hu3.getHeight() + "몸무게 : " + hu3.getWeight());
		
		
		hu1.setPerson("이도령", 150, 50); //객체 수정
		System.out.println("성명 : " + hu1.getName() + ", 키 : " + hu1.getHeight() + "몸무게 : " + hu1.getWeight());
		
		//차명, 속도를 멤버 변수로00
		//차명으로 생성가능
		//차명, 속도로 생성 가능
		//차명, 속도 각각 읽기
		//차명, 속도 각각 저장
		//차명, 속도 동시 변경
		//주어진 값으로 속도 증가
		//주어진 값으로 속도 감소
		//인수 없이 생성 가능
		//인수 없이 생성했을 경우 기본값 저장 ("자동차", 150)
		//별도의 클래스에서 객체 생성하고 테스트 (5개)
		}
}