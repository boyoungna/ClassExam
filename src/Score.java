
//1. �л��� ����ó�� Ŭ���� ���� (Score)
// -����Ʈ
//(ȫ�浿,70,70,70) �����غ���
//-�����ε��� ������(��� ����)
//
//2. �Ӽ� ����
//-�л�����(String)/��������(int)/��������/��������
//
//
//3.�޼���
//-set, get: ���� �� �� ��
//-������ ��ȯ�ϴ� �޼��� (get)
//-���   ��ȯ�ϴ� �޼��� (get) ���Ͻ��Ѽ�..
//4.�׽�Ʈ Ŭ����
//2�� �׽�Ʈ

public class Score {
	String name;
	int kor;
	int eng;
	int math;
	
	public Score() {
		name = "ȫ�浿";
		kor = 70;
		eng = 70;
		math = 70;
	}
	public Score(String sname, int skor, int seng, int smath) {
		name = sname;
		kor = skor;
		eng = seng;
		math = smath;
		
	}
	
	
	public Score(String sname) {
		name = sname;
	}

	public void setname(String sname) {
		name = sname;
	}
	
	public void seteng(int seng) {
		eng = seng;
	}
	public void setkor(int skor) {
		kor = skor;
	}
	public void setmath(int smath) {
		math = smath;
	}
	
	

	public String getName() {
		return name;
	}
	public int getkor() {
		return kor;	
	}
	public int geteng() {
		return eng;	
	}
	public int getmath() {
		return math;	
	}
	
	public int getTotal() {
		return kor+eng+math;
	}

//�Ҽ����� ��� ���¹� 2����
	public double getAvg() {
		return (double)getTotal()/3;	//����� ����Ż�� ��ȣ �ȿ� ���ѹ��� �������� ������ ���ǡ�
	}
	
//	public double getAvg() {
//		return getTotal()/3.0;
//	}
	
	public int getPg() {
		return (kor+eng+math)/3;
	}
	
	
	
	
	
	
}
