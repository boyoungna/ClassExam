
public class AnimalTest {

	public static void main(String[] args) {
		//동물 이름/몸무게/달리는 속도
		
		Animal an1 = new Animal();	
		System.out.println(an1.getName() + "의 몸무게는" + an1.getWeight() +"이고, 속도는" + an1.getSpeed() + "이다.");
		an1.setName("사자");
		an1.setWeight(150);
		an1.setSpeed(80);
		System.out.println(an1.getName() + "의 몸무게는" + an1.getWeight() +"이고, 속도는" + an1.getSpeed() + "이다.");
		
		Animal an2 = new Animal("치타");	
		System.out.println(an2.getName());
		an2.setWeight(200);
		an2.setSpeed(30);
		System.out.println(an2.getName() + "의 몸무게는" + an2.getWeight() +"이고, 속도는" + an2.getSpeed() + "이다.");
		
	
		
		
		
		
		
		an1.setAnimal("토끼", 60);
		System.out.println("동물이름 : " + an1.getName() + ", 속도 : " + an1.getSpeed());
		
		Animal an3 = new Animal("호랑이", 0);
		an3.setSpeed(70);
		System.out.println("동물이름 : " + an3.getName() + ", 속도 : " + an3.getSpeed());
		
		an3.speedup(10);
		System.out.println("동물이름 : " + an3.getName() + ", 속도 : " + an3.getSpeed());
		an1.speeddown(10);
		System.out.println("동물이름 : " + an1.getName() + ", 속도 : " + an1.getSpeed());
		
		Animal an4 = new Animal("사자", 0);
		an4.setSpeed(99);
		System.out.println("동물이름 : " + an4.getName() + ", 속도 : " + an4.getSpeed());
		Animal an5 = new Animal("코끼리", 0);
		an5.setSpeed(65);
		System.out.println("동물이름 : " + an5.getName() + ", 속도 : " + an5.getSpeed());
		Animal an6 = new Animal("기린", 0);
		an6.speedup(60);
		System.out.println("동물이름 : " + an6.getName() + ", 속도 : " + an6.getSpeed());
		
		
		
	}

}
