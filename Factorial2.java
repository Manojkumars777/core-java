class Factorial2 
{
    public static void main (String a[])                             //ncr
	{
	  int ncr = fact(6)/(fact(4)*fact(6-4));
	  System.out.println(ncr);
	  
	  
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
