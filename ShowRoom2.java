class ShowRoom2{                                                               // 16/06/22

          int showRoomiD ;
   static String name = " PUMA ";
          long showRoomGstNumber;
   static int numberOfBranches = 100;                                      // static and instance both variables......
          String location;                                                       // static variables called with class name....
          long contactNumber;                                                   // instance variables called with object reference name...
   
   public ShowRoom2(){
   System.out.println(" ShowRoom2 object is created " );
   }
   
   public static void main ( String ms[]){
   
   ShowRoom2 show = new ShowRoom2();
             show.showRoomiD = 23;
			 show.showRoomGstNumber = 243674547L;
			 show.location = " Rajaji Nagara Bangalore";
			 show.contactNumber = 88805632456L;
			 
	System.out.println(" Showroom ID is ==== " + show.showRoomiD);
    System.out.println(" Showroom name is ==== " + ShowRoom2.name );
    System.out.println(" Showroom GST Number is ==== " + show.showRoomGstNumber);
	System.out.println(" Showroom Number of branches ==== " + ShowRoom2.numberOfBranches);
	System.out.println(" Showroom location  is ==== " + show.location);
	System.out.println(" Showroom contact uumber is ==== " + show.contactNumber);
	
    System.out.println("...........................................................................................");
	
	 ShowRoom2 show1 = new ShowRoom2();
             show1.showRoomiD = 24;
			 show1.showRoomGstNumber = 657368396L;
			 show1.location = " Commercial street , Bangalore";
			 show1.contactNumber = 9114353746L;
			 
	System.out.println(" Showroom ID is ==== " + show1.showRoomiD);
    System.out.println(" Showroom name is ==== " + ShowRoom2.name );
    System.out.println(" Showroom GST Number is ==== " + show1.showRoomGstNumber);
	System.out.println(" Showroom Number of branches ==== " + ShowRoom2.numberOfBranches);
	System.out.println(" Showroom location  is ==== " + show1.location);
	System.out.println(" Showroom contact uumber is ==== " + show1.contactNumber);
  }
}