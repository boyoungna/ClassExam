
public class Animal {
	//멤버변수
	String name;
	int	weight;
	int speed;
	
	//디폴트 생성자
	public Animal() {
		name = "동물";
		weight = 30;
		speed = 0;
	}
	
	public Animal (String pName, int pWeight, int pSpeed) {
		name = pName;
		weight = pWeight;
		speed = 0;
	}
	
	
	//메서드
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
