class MovieHub1 
{
  static String movies[] = { "Charli" , "Vikram" , "kgf" , "Masti" , "Mastan"};                  //09-06-22
                                                                                  
  
 public static void main ( String a[])
  {
	  String value = getMovie("RRR");                                                                                  
   System.out.println(" come.... will watch " + value);
  }
  
  
  public static String getMovie( String movie)
  {
	  String movieName = null;
	  for( int i=0 ; i < movies.length ; i++)
	  {
		  if(movies[i] == movie)
		  {
			  
			  movieName = movies[i];
			  
		  }
		  
		else 
		{
			System.out.println( movie + " is not present in the list ");
			break ;
		}
		 
	  }
	  return movieName ;
  
  }

}