
public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("M3");
		
		System.out.println(c2.getName());
		
		c1.setCar("PoPo", 230);
		System.out.println("���̸� : " + c1.getName() + ", �ӵ� : " + c1.getKmh());
		
	Car c3 = new Car("XM5", 180); 
	System.out.println("���̸� : " + c3.getName() + ", �ӵ� : " + c3.getKmh());
	
	c3.setCar("QM3", 160);
	System.out.println("���̸� :" + c3.getName() + ", �ӵ� : " + c3.getKmh());

	
	//�ӵ� ������ų ������ �����ְ� �޼ҵ带 �ҷ��ͼ� ������ų �ӵ���ŭ �����ش�.
	c3.speedup(30);
	System.out.println(c3.getKmh());
	
	c3.speeddown(60);
	System.out.println(c3.getKmh());
		
	}
		
}
