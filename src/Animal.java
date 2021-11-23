
public class Animal {
	//�������
	String name;
	int	weight;
	int speed;
	
	//����Ʈ ������
	public Animal() {
		name = "����";
		weight = 30;
		speed = 0;
	}
	
	public Animal (String pName, int pWeight, int pSpeed) {
		name = pName;
		weight = pWeight;
		speed = 0;
	}
	
	
	//�޼���
	public Animal (String pName) {
		name = pName;
	}
	
	public Animal (String pName, int pWeight) {
		name = pName;
		weight = pWeight;
	}
	
	public void setAnimal(String pName, int pSpeed) {
		name = pName;
		speed = pSpeed;
	}
	

	public void setName(String pName) {
		name = pName;
	}
	public void setWeight(int pWeight) {
		weight = pWeight;
	}
	public void setSpeed(int pSpeed) {
		speed = pSpeed;
	}
	
	
	public String getName() {
		return name;		
	}
	public int getWeight() {
		return weight;
	}
	public int getSpeed() {
		return speed;
	}


	public void speedup(int pSpeed) {
		speed += pSpeed;
	}
	public void speeddown(int pSpeed) {
		speed -= pSpeed;
	}
}
