
public class ScoreTest {

	public static void main(String[] args) {
		
	Score s1 = new Score();
	System.out.println(s1.getName() + "�� ���� ������ " + s1.getkor() +"�̰�, ���� ������ " + s1.geteng() +"�̰�, ���� ������ " + s1.getmath() + "�̴�.");
	System.out.println(s1.getName() + "�� �����" +s1.getAvg() + "�̴�.");
	
	Score s2 = new Score("�̵���", 84, 91, 79);
	System.out.println(s2.getName() + "�� ���� ������ " + s2.getkor() +"�̰�, ���� ������ " + s2.geteng() +"�̰�, ���� ������ " + s2.getmath() + "�̰�, ������ " + s2.getTotal() +  "�̰�, ����� " + s2.getAvg() + "�̴�.");
	
	Score s3 = new Score();
	s3.setname("������");
	s3.setkor(100);
	s3.seteng(56);
	s3.setmath(68);
	System.out.println(s3.getName() + "�� ���� ������" + s3.getkor() +"�̰�, ���� ������" + s3.geteng() +"�̰�, ���� ������" + s3.getmath() + "�̴�.");
	System.out.println(s3.getName() + "�� ������" + s3.getTotal() + "�̰�");
	System.out.println(s3.getName() + "�� �����" + s3.getPg() + "�̴�.");
	
	Score s4 = new Score();
	s4.setname("�ظ��ݶ�");
	s4.setkor(30);
	s4.seteng(0);
	s4.setmath(10);
	System.out.println(s4.getName() + "�� ���� ������" + s4.getkor() +"�̰�, ���� ������" + s4.geteng() +"�̰�, ���� ������" + s4.getmath() + "�̴�.");
	System.out.println(s4.getName() + "�� ������" + s4.getTotal() + "�̰�");
	System.out.println(s4.getName() + "�� �����" + s4.getPg() + "�̴�.");
	
	System.out.println(s4.getName() + "�� �����" +s4.getAvg() + "�̴�.");
	
	
	}

}
