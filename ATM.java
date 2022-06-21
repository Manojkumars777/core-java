class ATM
{
    String branchName;
	int iD;
	int numberOfmachiens;
	String type;
	String location;
	
	public ATM(){
		System.out.println(" ATM is created ");
	}
	
	public static void main (String md[])
	{
	  ATM atm = new ATM ();
	      atm.branchName = "SBI";
		  atm.iD = 50;
		  atm.numberOfmachiens = 3;
		  atm.type = "Deposit & Withdrawal";
		  atm.location = "Beside more shop Nijalingappa Layout , Davanagere";
		  
	System.out.println(" ATM Branch name is " + " ==== " + atm.branchName);
	System.out.println(" ATM Id number  is " + " ==== " + atm.iD);
	System.out.println(" In ATM number of machines are  " + " ==== " + atm.numberOfmachiens);
	System.out.println(" ATM type is " + " ==== " + atm.type);
	System.out.println(" ATM location is " + " ==== " + atm.location);
	System.out.println("...........................................................................................");
		  
		  ATM atm1 = new ATM ();
	      atm1.branchName = "KARNATAKA BANK";
		  atm1.iD = 51;
		  atm1.numberOfmachiens = 1;
		  atm1.type =  "Withdrawal";
		  atm1.location = "Coffeday circle Vidhyanagara , Davanagere";
		  
	System.out.println(" ATM Branch name is " + " ==== " + atm1.branchName);
	System.out.println(" ATM Id number  is " + " ==== " + atm1.iD);
	System.out.println(" In ATM number of machines are  " + " ==== " + atm1.numberOfmachiens);
	System.out.println(" ATM type is " + " ==== " + atm1.type);
	System.out.println(" ATM location is " + " ==== " + atm1.location);
	System.out.println("...........................................................................................");
		  
		  ATM atm2 = new ATM ();
	      atm2.branchName = "HDFC";
		  atm2.iD = 52;
		  atm2.numberOfmachiens = 2;
		  atm2.type = "Withdrawal";
		  atm2.location = "Ring road Vinobanagara , Davanagere";
		  
    System.out.println(" ATM Branch name is " + " ==== " + atm2.branchName);
	System.out.println(" ATM Id number  is " + " ==== " + atm2.iD);
	System.out.println(" In ATM number of machines are  " + " ==== " + atm2.numberOfmachiens);
	System.out.println(" ATM type is " + " ==== " + atm2.type);
	System.out.println(" ATM location is " + " ==== " + atm2.location);
	System.out.println("...........................................................................................");
		  
		  ATM atm3 = new ATM ();
	      atm3.branchName = "AXSIS";
		  atm3.iD = 53;
		  atm3.numberOfmachiens = 4;
		  atm3.type = "Deposit & Withdrawal";
		  atm3.location = "Opposite to KSRTC buss stand  , Davanagere";
		  
	System.out.println(" ATM Branch name is " + " ==== " + atm3.branchName);
	System.out.println(" ATM Id number  is " + " ==== " + atm3.iD);
	System.out.println(" In ATM number of machines are  " + " ==== " + atm3.numberOfmachiens);
	System.out.println(" ATM type is " + " ==== " + atm3.type);
	System.out.println(" ATM location is " + " ==== " + atm3.location);

  }
}