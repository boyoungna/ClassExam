import java.util.*;	// �ܺ�Ŭ�������� ���� *�� ��� ����ϰڴٴ� ��.
public class Ex1130_5 {

	public static void main(String[] args) {
		// ArrayList Ŭ���� Ȱ��
		ArrayList<Book> library = new ArrayList<Book>();	//���׸� Ÿ������ ����
		
		System.out.println("============================");
		for (int i = 0; i < library.size(); i++) {
			//�ӽú����� ��ȯ
			Book book = library.get(i);	//��ü�� ��ȯ
			book.showBookInfo();
		}
	/*	Book abc = new Book("�¹���", "������");	
		library.add(abc);
	*/	
		library.add(new Book("�¹���", "������"));	//inline ��ü ����
												// /* */�� ����. ����:���� ����:��Ȱ�� �Ұ�
		library.add(new Book("���̾�", "�츣���켼"));
		library.add(new Book("��� �� ���ΰ�", "���ù�"));
		System.out.println("============================");
		for (int i = 0; i < library.size(); i++) {
			//�ӽú����� ��ȯ
			Book book = library.get(i);	//��ü�� ��ȯ
			book.showBookInfo();
		}
		System.out.println("============================");
		for (Book abc : library) {
			abc.showBookInfo();
		}
	}

}








