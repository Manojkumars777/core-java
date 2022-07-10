
public class Library1{
	
	BooksDTO[] dtos;
	int index;
	
	public Library1(int size){
		dtos = new BooksDTO[size];
		System.out.println("Library constructor is called");
	}
	
	public boolean books(BooksDTO dto)
	{
		System.out.println("inside books method");
		boolean isAdded = false;
		if(dto != null && dto.getBookName() != null){
			this.dtos[index++] = dto;
			isAdded = true;
			System.out.println("added successfully");
		  }
		else{
			System.out.println("cannot add books .....fill the form 1st");
		}
		return isAdded ;
	}
	
	public void getBooksDetails(){
		System.out.println("inside getBooks() ");
		for(int i=0 ; i<dtos.length ; i++){
		   System.out.println(dtos[i].getBookName() +"/"+ dtos[i].getAuthor() +"/"+ dtos[i].getPublishedIn() +"/"+ dtos[i].getPrice());
		}
	 }
  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
