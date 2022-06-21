class AxsisBank 
{

   static double amount ;
   static double totalAmount ;
  
   public static void main ( String a[])
 {
   System.out.println("Main method started");
     deposit(2000.00);
	 deposit(2000.00);
	 deposit(5000.00);
	 deposit(1000.00);
	 deposit(20000.00);
	 deposit(1500.00);
	 deposit(750.00);
	 deposit(11000.00);
	 withdraw(2100.00);
	 withdraw(1000.00);
     withdraw(500.00);	
	 withdraw(200.00);
	 withdraw(2500.00);
	 withdraw(100.00);
	 withdraw(1750.00);
	 totalAmount();
   System.out.println("Main method ended");	 
 }
 
   
   public static void deposit(double amt)
 {
   System.out.println("invoking deposit()");
   System.out.println("Amount to be deposit " + amt);
   System.out.println("Amount before deposit" + amount);
      amount = amount+amt;
   System.out.println("Amount after deposit " + amount);
   System.out.println("Deposit ended ");
   
 }
 
   public static void withdraw(double amt)
 {
   System.out.println("invoking withdraw() ");
   System.out.println("Amount to be withdraw "  + amt);
   System.out.println("Amount before withdraw " + amount);
      amount = amount-amt;
   System.out.println("Amount after withdraw "+ amount);
   System.out.println("withdraw ended ");
 }
 
   public static void totalAmount()
   {
	   totalAmount = amount ;
	   System.out.println("totalAmount is " + totalAmount);
	   
   }
  
}
