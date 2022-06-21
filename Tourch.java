class Tourch
{
     static String brandName = "TVS";
	 static String color = "White";
	 static double cost  = 900;
	 static boolean isConnected ;
	 static int maximumFocus = 100;
	 static int minimumFocus ;
	 static int currentFocus ;
	 
	 
	 public static void onOrOff()
  {

	 System.out.println("invokinG onOrOff() ................");
	 if(isConnected == false)
	 {
	 isConnected = true;
	 System.out.println("Tourch is turnned on .................");
	 }
	 
	 else if(isConnected == true)
	 {
	 isConnected = false;
	 System.out.println("Tourch is turnned off");
	 }
  }
	 
	 
	 public static void main (String a[])
 {
	 System.out.println(" tourch brand name is " + "........." + brandName );
	 System.out.println(" tourch color is " + "........" + color );
	 System.out.println(" tourch cost is " + "........." + cost );
	 onOrOff();
	 increseFocus();
	 increseFocus();
	 increseFocus();
	 increseFocus();
	 decreaseFocus();
	 decreaseFocus();
	 decreaseFocus();
	 decreaseFocus();
	 onOrOff();
	 
 }
 
         public static void increseFocus()
  {
	     System.out.println(" increseFocus method started ");
	     if(isConnected == true)
	  {
		  System.out.println(" Tourch turned on ");
	      if(currentFocus < maximumFocus)
	  {
	       currentFocus = currentFocus + 1 ;
		   System.out.println(" The currentFocus is " + currentFocus );
	  }
	  
	    else {
		       System.out.println(" MaximumFocus reached ");
	         }
	  }  
	  
	    else{
			  System.out.println(" Tourch is turned of ");
	        }
	          System.out.println(" increseFocus method ended ");
  }
  
            public static void decreaseFocus()
 {
	     System.out.println(" decreaseFocus method started ");
		 if(isConnected == true)
	  {
		  System.out.println(" Tourch is turned on ");
		 if(currentFocus > minimumFocus )
	  {
		   currentFocus = currentFocus - 1;
		   System.out.println(" The currentFocus is " + currentFocus );
	  }
	    else{
			  System.out.println(" maximumFocus reached " );
		    }
  }
  
        else{
			  System.out.println(" Tourch is turned of ");
		    } 
			
			System.out.println(" decreaseFocus method ended ");
 }
			 

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
				
			}
  
  

