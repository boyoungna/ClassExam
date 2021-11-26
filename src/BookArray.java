
public class BookArray {

	public static void main(String[] args) {
		// Book 배열 테스트
		Book[] library = new Book[5];	// Book객체를 저장할 수 있는 배열객체 생성
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		library[0] = new Book("태백산맥", "조정래");	// 객체 생성하여 배열에 저장
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생택쥐페리");
		
		for (int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);			//오류
		}
	}

}
