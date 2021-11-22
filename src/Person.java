
public class Person {	//생성자
	String name;
	int height;
	int weight;
	
	// 생성자가 한개도 없을 경우 디폴트 생성자가 존재함
	
	// *생성자 작성 규칙*
	// 클래스명과 동일
	// 반환타입이 없음(문법 없음)
	// 명시적으로 디폴트 생성자 필요
	public Person() {		//*디폴트 생성자도* 아무 내용도 없이 만들어 주기만 해도 OK
		
	}
	 // 오버로딩 된 생성자 
	public Person(String pName) {//생성자 이름이 동일, 매개변수 다름(갯수, 타입, 순서)
		name = pName;
	}
	public Person(String pName, int pHeight, int pWeight) {
		name = pName;
		height = pHeight;
		weight = pWeight;
	}
	// 메서드

	public String getName() {
			return name;
	}
	
	//키와 몸무게를 각각 추출할 수 있는 메서드 추가
	
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}

	
	
	//성명, 키, 몸무게를 한번에 변경할 수 있는 메서드 추가
	
	public void setPerson(String pName, int pHeight, int pWeight) {
		name = pName;
		height = pHeight;
		weight = pWeight;

	}
}
	
	
	
	
	
	
	
//	String Smile() {
//		
//	Smile sm1 = new Smile();
//	Smile sm2 = new Smile("스마일");
//	
//	public String getSmileName();{
//		System.out.println(sm2.getName());
//		
//	}
//	
//	}


