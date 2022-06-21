class Factorial1 
{
    public static void main (String a[])                             //npr
	{
	  int npr = fact(5)/fact(5-2);
	  System.out.println(npr);
	  
	  
	}
	
     public static int fact(int factNumber )
	 {
	   System.out.println("invoked fact()");
	   System.out.println("parameter value " + factNumber); 
	   int f = 1 ;
	   for(int i=1 ; i <= factNumber ; i++)
	   {
		   f = f * i ;
	   }
	   System.out.println("invoked method ended ");
	   return f;
	 
    }
}
