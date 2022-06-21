class MovieHub 
{
  static String movies[] = { "Charli" , "Vikram" , "kgf" , "Masti" , "Mastan"};
                                                                                  //08-06-22
  
 public static void main ( String a[])
  {
	  String value = getMovie("Vikram");                                                                                   // 08;06;2022
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
		  
		
		}
		 
	  }
	  return movieName ;
  
  }

}