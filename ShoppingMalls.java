class ShoppingMalls
{
   String name;
   int iD;
   String address;
   int numberOfemployees;
   String openingTime;
   String closingTime;
   
   public static void main (String sm[])
   {
     ShoppingMalls shoppingMalls = new ShoppingMalls();
	               shoppingMalls.name = "Orion Mall";
				   shoppingMalls.iD = 22;
				   shoppingMalls.address = "Dr rajkumar road ,yeshwanthpur Bangalore";
				   shoppingMalls.numberOfemployees = 350;
				   shoppingMalls.openingTime = "10.30 AM" ;
				   shoppingMalls.closingTime = "7.00 PM";
				   
	 ShoppingMalls shoppingMalls1 = new ShoppingMalls();
	               shoppingMalls1.name = "Lulu super market";
				   shoppingMalls1.iD = 23;
				   shoppingMalls1.address = "Mejestic road , rajajinagar , Bangalore";
				   shoppingMalls1.numberOfemployees = 700;
				   shoppingMalls1.openingTime = "10.00 AM";
				   shoppingMalls1.closingTime = "11.00 PM";
				   
	 ShoppingMalls shoppingMalls2 = new ShoppingMalls();
	               shoppingMalls2.name = "Forum Mall";
				   shoppingMalls2.iD = 24;
				   shoppingMalls2.address = "kormangala road ,Kormangala , Bangalore";
				   shoppingMalls2.numberOfemployees = 550;
				   shoppingMalls2.openingTime = "10.30 AM";
				   shoppingMalls2.closingTime = "11.30 PM";
				   
	 ShoppingMalls shoppingMalls3 = new ShoppingMalls();
	               shoppingMalls3.name = "Garuda";
				   shoppingMalls3.iD = 25;
				   shoppingMalls3.address = "Opposite to temple ,Banashankari , Bangalore";
				   shoppingMalls3.numberOfemployees = 1000;
				   shoppingMalls3.openingTime = "10.30 AM" ;
				   shoppingMalls3.closingTime = "9.00 PM";
				   
	System.out.println("Shopping Mall name is "  +  shoppingMalls.name);
	System.out.println("Shopping Mall Id is "  +  shoppingMalls.iD);
	System.out.println("Shopping Mall address is "  +  shoppingMalls.address);
	System.out.println("Number of employess in shopping mall is "  +  shoppingMalls.numberOfemployees);
	System.out.println("Shopping Mall opening time is "  +  shoppingMalls.openingTime);
	System.out.println("Shopping Mall closing time is "  +  shoppingMalls.closingTime);
	
	System.out.println("...........................................................................................");
	
	System.out.println("Shopping Mall name is "  +  shoppingMalls1.name);
	System.out.println("Shopping Mall Id is "  +  shoppingMalls1.iD);
	System.out.println("Shopping Mall address is "  +  shoppingMalls1.address);
	System.out.println("Number of employess in shopping mall is "  +  shoppingMalls1.numberOfemployees);
	System.out.println("Shopping Mall opening time is "  +  shoppingMalls1.openingTime);
	System.out.println("Shopping Mall closing time is "  +  shoppingMalls1.closingTime);
	
	System.out.println("...........................................................................................");
	
	System.out.println("Shopping Mall name is "  +  shoppingMalls2.name);
	System.out.println("Shopping Mall Id is "  +  shoppingMalls2.iD);
	System.out.println("Shopping Mall address is "  +  shoppingMalls2.address);
	System.out.println("Number of employess in shopping mall is "  +  shoppingMalls2.numberOfemployees);
	System.out.println("Shopping Mall opening time is "  +  shoppingMalls2.openingTime);
	System.out.println("Shopping Mall closing time is "  +  shoppingMalls2.closingTime);
	
	System.out.println("...........................................................................................");
	
	System.out.println("Shopping Mall name is "  +  shoppingMalls3.name);
	System.out.println("Shopping Mall Id is "  +  shoppingMalls3.iD);
	System.out.println("Shopping Mall address is "  +  shoppingMalls3.address);
	System.out.println("Number of employess in shopping mall is "  +  shoppingMalls3.numberOfemployees);
	System.out.println("Shopping Mall opening time is "  +  shoppingMalls3.openingTime);
	System.out.println("Shopping Mall closing time is "  +  shoppingMalls3.closingTime);
  }

}