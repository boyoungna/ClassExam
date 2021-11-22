
public class Car {
	String name;
	int kmh;
	
	public Car(){
		
	}
	
	public Car (String pName) {
		name = pName;
	
	}
	
	//speed는 숫자이기 때문에 int 차 이름은 문자이기 때문에 string을 준다.
	public Car(String pName, int pKmh) {
		name = pName;
		kmh = pKmh;
	}
	
//차명과 인수 1개 2개 생성 완료
	
	
	public void setCar(String pName,  int pKmh) {
		name = pName;
		kmh = pKmh;
	}
	
	public String getName() {
		return name;
		
	}

		
	public int getKmh() {
		return kmh;
	}
	
	
	
	//속도 증가
	public void speedup(int pKmh) {
		kmh += pKmh;
		
	}
	
	public void speeddown(int pKmh) {
		kmh -= pKmh;
	}
	
}