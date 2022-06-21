class DigitalTransaction                                      
   {
    static double amount ;
	static double totalAmount ; 
	 
	public static void main ( String a [])
   {
	  System.out.println( " Main method started ");
     deposit(20000.00);                                                              // Home w.....
	 deposit(11564.00);
	 deposit(10000.00);
	 withdraw(18550);
	 withdraw(1000.00);
	 totalAmount();
	 System.out.println( " Main method ended ");
	 
   }
   
    public static void deposit(double amt)
   {
	System.out.println(" invoking deposit ");
    System.out.println(" Amount to be deposit " +  "......." + amt);
	System.out.println(" Amount before deposit " + "......." + amount);
	amount = amount + amt;
	System.out.println(" Amount after deposit " + "......" + amount);
	System.out.println(" End of deposit ");
	
   }
   
    public static void withdraw(double amt)
   {
	   System.out.println(" invoking withdraw ");
	   System.out.println("Amount to be withdraw " + "......" + amt);
	   System.out.println(" Amount before withdraw " + "......" + amount);
	   amount = amount - amt;
	   System.out.println(" Amount after withdraw " + "......" + amount);
	   System.out.println(" End of withdraw ");
	   
   }
   
    public static void totalAmount()
	{
		totalAmount = amount;
		System.out.println("totalAmount is " + totalAmount);
		
	}


   }