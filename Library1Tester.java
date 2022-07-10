
import java.util.Scanner;
public class Library1Tester{
	
	public static void main(String a[]){
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Number of books");
		  int size = sc.nextInt();
		  
		  Library1 ll = new Library1(size);
		  for(int i=0 ; i<size ; i++){
			  System.out.print("Book name .... : ");
			  String bookName = sc.next();
			  System.out.print("Author Name.... : ");
			  String author = sc.next();
			  System.out.print("Published in ... : ");
			  String publishedIn = sc.next();
			  System.out.print("Book price.... : ");
			  int price = sc.nextInt();
			  
			  BooksDTO dto = new BooksDTO();
			           dto.setBookName(bookName);
					   dto.setAuthor(author);
					   dto.setPublishedIn(publishedIn);
					   dto.setPrice(price);
					   
					   ll.books(dto);
			 }
			           ll.getBooksDetails();
	     }
	}