
public class Book {
	// �������(�Ӽ�)
	private String bookName;
	private String author;
	//����Ʈ ������
	public Book() {
		
	}
	//�����ε��� ������
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	//�޼���
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
	//�����ε��� �޼���
	
	//������(���� ������) public static void main
	
	
	
}
