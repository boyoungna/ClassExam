
public class Car {
	String name;
	int kmh;
	
	public Car(){
		
	}
	
	public Car (String pName) {
		name = pName;
	
	}
	
	//speed�� �����̱� ������ int �� �̸��� �����̱� ������ string�� �ش�.
	public Car(String pName, int pKmh) {
		name = pName;
		kmh = pKmh;
	}
	
//����� �μ� 1�� 2�� ���� �Ϸ�
	
	
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
	
	
	
	//�ӵ� ����
	public void speedup(int pKmh) {
		kmh += pKmh;
		
	}
	
	public void speeddown(int pKmh) {
		kmh -= pKmh;
	}
	
}