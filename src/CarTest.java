
public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("M3");
		
		System.out.println(c2.getName());
		
		c1.setCar("PoPo", 230);
		System.out.println("차이름 : " + c1.getName() + ", 속도 : " + c1.getKmh());
		
	Car c3 = new Car("XM5", 180); 
	System.out.println("차이름 : " + c3.getName() + ", 속도 : " + c3.getKmh());
	
	c3.setCar("QM3", 160);
	System.out.println("차이름 :" + c3.getName() + ", 속도 : " + c3.getKmh());

	
	//속도 증가시킬 변수를 적어주고 메소드를 불러와서 증가시킬 속도만큼 적어준다.
	c3.speedup(30);
	System.out.println(c3.getKmh());
	
	c3.speeddown(60);
	System.out.println(c3.getKmh());
		
	}
		
}
