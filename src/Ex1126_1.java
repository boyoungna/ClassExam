
public class Ex1126_1 {

	public static void main(String[] args) {
		// �迭 �׽�Ʈ
		int[] stIDs = new int[10];	// ������ �迭 ���� (�ʱ�ȭ ���� ����)
		
		int[] stArr1 = {101, 102, 103, 104, 105};	// �迭 ����� ���ÿ� �ʱ�ȭ
		int[] stArr2 = new int[] {101, 102, 103, 104, 105};	//���� ����. new int ���� ���� ���� �ȵ�.
		
		int[] stArr3;	//����. 2�ٿ� ������
		stArr3 = new int[] {101, 102, 103};	//new ���� �Ұ�
		
		for (int i = 1; i < 5; i++) {	// 0~4 ���� �ݺ� 0,1,2,3,4
			System.out.println(stArr1[i]);	// �ε����� 0���� ������
		}
		
		// �ݺ����忡���� i����(����)�� ���� ���. �ٸ� �������� ������ ���� �ʱ⶧��? index=i
		for (int i = 0; i < 3; i++) {	
			System.out.println(stArr1[i]);	
		}
		
		
	}

}
