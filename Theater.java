class Theater{

    String name ;
    String address;
    long contactNo;
    String ownerName;                                                                             // shopping mall
    String []runningMovies = {"Charli" , "Ninge yak bekadu" , "Last Buss", "Rahasya"};
	
   
   public static void main (String a[]){
	  // className  refvariable = new className();
	  Theater theater = new Theater();
               theater.name = "Ashoka";
	           theater.address = "Beside GT Mall";
	           theater.contactNo = 8105433719L;
	           theater.ownerName = "Mouni"; 	
	
	System.out.println("Theater name is " +  theater.name);
	System.out.println("Theater address is  " + theater.address);
	System.out.println("Theater contact number is  " + theater.contactNo);
	System.out.println("Theater ownerName is  " + theater.ownerName);
    System.out.println("The running movies are");
	theater.getRunningMovies() ; 
	
  }
  
  public  void getRunningMovies(){
   //System.out.println("Running movies are.........");
	for(int i=0; i<runningMovies.length; i++){
    System.out.println(runningMovies[i]);
	}
  }
	

}