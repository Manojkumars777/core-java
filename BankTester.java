class BankTester
{
   public static void main(String []a)
   {
	   Sbi SBI = new Sbi();
	       SBI.typeOfBank = "Nationalised Bank";
		   SBI.founder = "The Maharaja";
		   SBI.foundedYear =  1955;
		   
		   SBI.getBank();
		   
	System.out.println("SBI bank is founded by = " + SBI.founder + " in " + SBI.foundedYear + " and it is " + SBI.typeOfBank);
   }
}