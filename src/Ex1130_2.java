
public class Ex1130_2 {

	public static void main(String[] args) {
		// ��������(�Ϲ����� ����)
		// ��ü�迭 ó��
		Book[] bookArr1 = new Book[3];	//Book ��ü�� ������ �迭���� ����
		Book[] bookArr2 = new Book[3];
		bookArr1[0] = new Book("�¹���", "������");	//����
		bookArr1[1] = new Book("���̾�", "�츣���켼");
		bookArr1[2] = new Book("��� �� ���ΰ�", "���ù�");
		/*
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i] = new Book();	//�ϴ� ����Ʈ �����ڷ� �����ص�
		}
		*/
		
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i] = new Book("�ڹ����α׷���", "ȫ�浿");	//�ƹ��ų� ����
		}
		
		
		for (int i = 0; i <bookArr1.length; i++) {	//���� �迭 ���̸�ŭ ����(����)
			bookArr2[i].setBookName(bookArr1[i].getBookName()); 	//1�� �о 2�� 
			bookArr2[i].setAuthor(bookArr1[i].getAuthor());
		}
		
		
		System.out.println("==========����============");
		for (int i = 0; i < bookArr1.length; i++) {		//����
			bookArr1[i].showBookInfo();
		}
		System.out.println("==========�纻============");		//�纻
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}
		
		//��������
		bookArr1[0].setBookName("����");
		bookArr1[0].setAuthor("�ڿϼ�");
		
		System.out.println("==========����============");
		for (int i = 0; i < bookArr1.length; i++) {		//����
			bookArr1[i].showBookInfo();
		}
		System.out.println("==========�纻============");		//�纻
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}

	}

}
