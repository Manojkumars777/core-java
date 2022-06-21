class Bank
{
   static double amount; 
   static double totalAmount;  
                                                                                                  // 03/06/2022
   public static void main (String a[])
 {
   System.out.println("main method started");
   //invoking deposit method
   deposit(6700);
   //invoking deposit method
   deposit(12000.00);
   //invoking withdraw method
   withdraw(10000);
   //invoking totalAmount method
   totalAmount();
   System.out.println("main method ended");
 }
   
   public static void deposit(double amt)
   {
   System.out.println("invoked deposit()");
   System.out.println("Amount to be deposit" + amt);
   System.out.println("Amount before deposit" + amount);
   amount = amount + amt;
   System.out.println("Amount after deposite" + amount);
   System.out.println("End of deposit()");
 }
   
    public static void withdraw(double wd)
 {
    System.out.println("invoked withdraw()");
    System.out.println("Amount to be withdraw" + wd);
    System.out.println("Amount before withdraw" + amount);
    amount = amount - wd;
	System.out.println("Amount after withdraw " + amount);
    System.out.println("End of withdraw");	
		  
}

    public static void totalAmount()
	{
	totalAmount = amount;
	System.out.println("the totalAmount is " + totalAmount);
		
	}
   
   
   
   
}











