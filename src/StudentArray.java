
public class StudentArray {

	public static void main(String[] args) {
		// 
		Student[] check = new Student[5];
		for (int i = 0; i < check.length; i++) {
			System.out.println(check[i]);
		}
		check[0] = new Student("������");
		check[1] = new Student("������");
		check[2] = new Student("������");
		check[3] = new Student("������");
		check[4] = new Student("������");

		for (int i = 0; i < check.length; i++) {
			check[i].showCheckInfo();
			System.out.println(check[i]);
			check[i].showCheckInfo();
			}
		

	}

}
