
public class AnimalTest {

	public static void main(String[] args) {
		//���� �̸�/������/�޸��� �ӵ�
		
		Animal an1 = new Animal();	
		System.out.println(an1.getName() + "�� �����Դ�" + an1.getWeight() +"�̰�, �ӵ���" + an1.getSpeed() + "�̴�.");
		an1.setName("����");
		an1.setWeight(150);
		an1.setSpeed(80);
		System.out.println(an1.getName() + "�� �����Դ�" + an1.getWeight() +"�̰�, �ӵ���" + an1.getSpeed() + "�̴�.");
		
		Animal an2 = new Animal("ġŸ");	
		System.out.println(an2.getName());
		an2.setWeight(200);
		an2.setSpeed(30);
		System.out.println(an2.getName() + "�� �����Դ�" + an2.getWeight() +"�̰�, �ӵ���" + an2.getSpeed() + "�̴�.");
		
	
		
		
		
		
		
		an1.setAnimal("�䳢", 60);
		System.out.println("�����̸� : " + an1.getName() + ", �ӵ� : " + an1.getSpeed());
		
		Animal an3 = new Animal("ȣ����", 0);
		an3.setSpeed(70);
		System.out.println("�����̸� : " + an3.getName() + ", �ӵ� : " + an3.getSpeed());
		
		an3.speedup(10);
		System.out.println("�����̸� : " + an3.getName() + ", �ӵ� : " + an3.getSpeed());
		an1.speeddown(10);
		System.out.println("�����̸� : " + an1.getName() + ", �ӵ� : " + an1.getSpeed());
		
		Animal an4 = new Animal("����", 0);
		an4.setSpeed(99);
		System.out.println("�����̸� : " + an4.getName() + ", �ӵ� : " + an4.getSpeed());
		Animal an5 = new Animal("�ڳ���", 0);
		an5.setSpeed(65);
		System.out.println("�����̸� : " + an5.getName() + ", �ӵ� : " + an5.getSpeed());
		Animal an6 = new Animal("�⸰", 0);
		an6.speedup(60);
		System.out.println("�����̸� : " + an6.getName() + ", �ӵ� : " + an6.getSpeed());
		
		
		
	}

}
