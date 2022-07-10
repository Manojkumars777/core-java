
public class BooksDTO{
	
	public BooksDTO(){
		System.out.println("BooksDTO object is created");
	}
	
	private String bookName;
	private String author;
	private String publishedIn;
	private int price;
	
	public String getBookName(){
		return bookName;
	}
	public void setBookName(String bookName){
		this.bookName = bookName;
	}
	public String getAuthor(){
		return author;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public String getPublishedIn(){
		return publishedIn;
	}
	public void setPublishedIn(String publishedIn){
		this.publishedIn = publishedIn;
	}
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}

}