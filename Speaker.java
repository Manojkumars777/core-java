class Speaker
{

    static String brand    = "JBL";                                                                                //. == relational operator
    static double cost = 3000.00;                                                                                  // boolean default value is false
	                                                                                                               /// if / else if = condition statement
    static String color    = "yellow";
    static boolean isConnected;
    static int maximumVolume = 100;
    static  int currentVolume ; 
    static int minimumVolume ;


     public static void onOrOff() 
{                                                                                                     
  System.out.println("invoking onOrOff()");
  if(isConnected == false){
  isConnected = true;
  System.out.println("Speaker is turned onn...Available to connect");
  }
  
  else if(isConnected == true){
  isConnected = false;
  System.out.println("Speaker is turned off....");
  
  }
  
  }
  
  public static void main (String a[])
  {
	  onOrOff();
	  increaseVolume();
	  increaseVolume();
	  increaseVolume();
      increaseVolume();
	  increaseVolume();
	  increaseVolume();
	  increaseVolume();
      increaseVolume();
	  increaseVolume();
	  increaseVolume();
	  decreaseVolume();
	  decreaseVolume();
	  decreaseVolume();
	  decreaseVolume();
	  decreaseVolume();
	  decreaseVolume();
	  decreaseVolume();
	  decreaseVolume();
	  decreaseVolume();
	  decreaseVolume();
	  onOrOff();
	  
  }
           //Increasevolume method....
  
     public static void increaseVolume()
  {
	  System.out.println(" increaseVolume method started ");
	  if(isConnected == true)
	  {
        System.out.println("Speaker is turned on");
	    if(currentVolume < maximumVolume)
	  {
		currentVolume = currentVolume + 1 ;
		System.out.println("The currentVolume is "+ currentVolume);
      }
   
      else {
		      System.out.println("Maximum volume reached");
		   }
		  
	  }
	  
	  else {
		     System.out.println("speaker is turned of");
	       }
		     System.out.println("increase volume method ended");
  }

            // decrease volume method....
	  
	  public static void decreaseVolume()
  {
	  System.out.println("decreaseVolume methgod started");
	  if( isConnected == true)
	  {
		System.out.println("speaker is turned on");
		if(currentVolume > minimumVolume)
	 {
        currentVolume = currentVolume - 1 ;
		System.out.println("The current volume is" + currentVolume);
	 }
	
	else{
         System.out.println("Maximum volume reached ");
        }
	
      }
    else {
		   System.out.println("speaker is turned off");
	     }
           System.out.println("decreaseVolume method ended");
  }

	  
	 }
	  
	  
	  
	  
	  
	  
	  
	  
	 
	  
	  

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  
