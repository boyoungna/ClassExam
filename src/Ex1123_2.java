
public class Ex1123_2 {

	public static void main(String[] args) {
		// �ν��Ͻ� �����ؾ� Ŭ���� ��� ����
		// Ŭ������ ������ = new ������
		// ����Ʈ �����ڴ� Ŭ������� ����. �Ű����� ����
	
		//���� �׽�Ʈ
		Ex1123_1 cal1 = new Ex1123_1();		// ����Ʈ �����ڷ� �ν��Ͻ� ���� (��ü ����)
		
		System.out.println(cal1.num1);
		System.out.println(cal1.num2);
		System.out.println(cal1.result);
		System.out.println(cal1.add(10, 20));		// cal1. ������ �տ� ���� add ������ ��Ȯ�ϴٸ� ��Ÿ��. 10+20 �ٷ� ���
		int test = cal1.add(1, 2);			// 1+2 ����� test�� ��ȯ
		System.out.println(test);
		
		//���� �׽�Ʈ
		System.out.println(cal1.product(11, 5));
		int test2 = cal1.product(11, 21);
		System.out.println(test2);
		
		System.out.println(cal1.num1);
		System.out.println(cal1.num2);
		System.out.println(cal1.result);
		
		//�ι�° ��ü ���� �� �׽�Ʈ
		Ex1123_1 cal2= new Ex1123_1(3, 5);	//��ü ���� (�ν��Ͻ� ����)
		System.out.println(cal2.add(24, 61));
		System.out.println(cal2.subtract(150, 20));
		System.out.println(cal2.product(11, 12));
		System.out.println(cal2.divide(560, 8));
		
		//����° ��ü ���� �� �׽�Ʈ
		Ex1123_1 cal3 = new Ex1123_1(10,5);
		// 10+5 ���
		System.out.println(cal3.getNum1() + "+" + cal3.getNum2() + "=" + cal3.add(10, 5));
	
		//�׹�° ��ü ���� �� �׽�Ʈ
		//����Ʈ �����ڷ� ���� �� �Ű�����(9, 10) �߰� & ���� ��� �׽�Ʈ getset
		Ex1123_1 cal4 = new Ex1123_1();
		cal4.setNum1(9);
		cal4.setNum2(10);
		System.out.println(cal4.getNum1() + "*" + cal4.getNum2() + "=" + cal4.product());
		System.out.println(cal4.getNum1() + "+" + cal4.getNum2() + "=" + cal4.add());

		
		//������ �׽�Ʈ
		System.out.println(cal1.divide(300, 5));
		int test3 = cal1.divide(200, 11);
		System.out.println(test3);

		//���� �׽�Ʈ
		System.out.println(cal1.subtract(300, 200));
		int test4 = cal1.subtract(200, 120);
		System.out.println(test4);
		
	}

	
}
