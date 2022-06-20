class ShowRoom3{

          int showRoomiD ;
   static String name = " PUMA ";
          long showRoomGstNumber;
   static int numberOfBranches = 100;                                      
          String location;                                                       
          long contactNumber;                                                   
		  
		  
	// parameterized constructor
	
    public ShowRoom3 (int ID , long GSTNo , String loc , long mobNumber){
	System.out.println(" Showroom object is created");
	
  showRoomiD = 	ID ;
  showRoomGstNumber = GSTNo; 
  location = loc ; 
  contactNumber = mobNumber;
	}
	
	// main method -- starting point 
	public static void main( String ms[]){
		
		// constructor are used to initialize instance variable in a class 
		
		ShowRoom3  show = new ShowRoom3(2 , 5463526435L , "Vijaya nagara Bangalore" , 8880143567L);
		System.out.println( show.showRoomiD + "  " + show.showRoomGstNumber + "  " + show.location + "  "  + show.contactNumber);
		
	    ShowRoom3  show1 = new ShowRoom3(3 , 224363527L , "Electronic city , Bangalore" , 8105433719L);
		System.out.println( show1.showRoomiD + "  " + show1.showRoomGstNumber + "  " + show1.location + "  "  + show1.contactNumber);
		
		System.out.println(ShowRoom3.name + "  " + ShowRoom3.numberOfBranches);
		
	}
}