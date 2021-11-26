
public class Book {
	// 멤버변수(속성)
	private String bookName;
	private String author;
	//디폴트 생성자
	public Book() {
		
	}
	//오버로딩된 생성자
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	//메서드
	public String getBookName() {
		return bookName;
	}
	public String getAuthorName() {
		return author;
	}
	public void setBookName(String bookName) {
		this.bookName =  bookName;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void showBookInfo() {
		System.out.println(getBookName() + ":" + getAuthorName());
	}
	//오버로딩된 메서드
	
	//진입점(보통 사용안함) public static void main
	
	
	
}
