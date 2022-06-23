class BookMyMovieTester{


   public static void main(String a[])
   {
      String movies[] = {"Om", "A", "upendra", "Yajamana", "Gaalipata", "Jacky", "Rakta Kanneru"};
	  String snacks[] = {"Lase", "Colddrinks","Bisuuts","Hot chips","SweetCorn"};
	  
      BookMyMovie bookMyMovie = new BookMyMovie("Prasanna", 250, movies, 100,20, snacks);
	  System.out.println("The name of the theater is "+ bookMyMovie.theaterName);
	  bookMyMovie.showTime(15, "Santhosh", "Om");
	  bookMyMovie.buySnacks("SweetCorn", 60);
	  
	  
	  System.out.println("**********************************************************");
	  
	  
	  
	  BookMyMovie bookMyMovie1 = new BookMyMovie("Veeresh", 300, movies, 150,25, snacks);
	  System.out.println("The name of the theater is "+ bookMyMovie1.theaterName);
	  bookMyMovie1.showTime(7, "Priya", "Jacky");
	  bookMyMovie1.buySnacks("Hot chips", 20);

   
   
   }



}