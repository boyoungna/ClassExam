
public class Ex1126_2 {

	public static void main(String[] args) {
		// �ƽ�Ű�ڵ� �������(�迭�� ���� �����ϰ� ����� �迭�� ���)
		char[] alpha = new char[26];
		char ch = 'A';	//����� ���۹���
		
		for (int i = 0; i < alpha.length; i++, ch++) {	//����
			alpha[i] = ch;
		}
		
		for (int i = 0; i < alpha.length; i++) {
			System.out.println(alpha[i] + ":" + (int)alpha[i]);
		}
		
		
		
//		System.out.println(ch);		// ���� ��µ�(ĳ������)
//		System.out.println((int)ch);	// ���ڷ� �� ��ȯ�� ��Ŵ
//		ch++;
//		System.out.println(ch);
		

	}

}
