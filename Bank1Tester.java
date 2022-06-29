class Bank1Tester
{
   public static void main(String a[]){
	
	
	Bank1 bank1 = new SbiBank();
	System.out.println("The Rate of interest in SBI bank is ****** ");
	bank1.getInterest(5.2);
	

	Bank1 bank2 = new AxsisBank();
   	System.out.println("The Rate of interest in AXSIS Bank is ****** "); 
	bank2.getInterest(6);
	
	Bank1 bank3 = new KotakMahendraBank();
   	System.out.println("The Rate of interest in KOTAK Bank is ****** "); 
	bank3.getInterest(7.2);
	
	Bank1 bank4 = new CanaraBank();
   	System.out.println("The Rate of interest in CANARA Bank is ****** "); 
	bank4.getInterest(4.88);
	
	Bank1 bank5 = new KarnatakaBank();
	System.out.println("The Rate of interest in KARNATAKA Bank is ******");
	bank5.getInterest(4.8);
	
	Bank1 bank6 = new HydrabadBank();
	System.out.println("The Rate of interest in HYDRABAD Bank is ******");
	bank6.getInterest(6.1);
	
	}
	
}