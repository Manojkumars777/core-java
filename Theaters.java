class Theaters{

    String name ;
    String address;                                                     // using new key word in Array allso...
    long contactNo;
    String ownerName;                                                                             
    String []runningMovies = new String[4];
	
	
	public Theaters(){
		System.out.println( " Theaters are created ");
	}
	
   
   public static void main (String a[]){
	  // className  refvariable = new className();
	  Theaters theaters = new Theaters();
               theaters.name = "Ashoka";
	           theaters.address = "Beside GT Mall";
	           theaters.contactNo = 8105433719L;
	           theaters.ownerName = "Mouni"; 
			   
			   theaters.runningMovies[0] =  "Vikram";
               theaters.runningMovies[1] =  "Charli";
               theaters.runningMovies[2] =  "Om";
               theaters.runningMovies[3] =  "Jalsa";
			   
    System.out.println("Theater name is " +  theaters.name);
	System.out.println("Theater address is  " + theaters.address);
	System.out.println("Theater contact number is  " + theaters.contactNo);
	System.out.println("Theater ownerName is  " + theaters.ownerName);
    System.out.println("In" +  theaters.name + " Running movies are " );
	theaters.getRunningMovies();
			   
	  Theaters theaters1 = new Theaters();
               theaters1.name = "Trinetra";
	           theaters1.address = "Beside Pooja Mall";
	           theaters1.contactNo = 9902345161L;
	           theaters1.ownerName = "Ramesh"; 
			   
			   theaters1.runningMovies[0] =  "Ram";
               theaters1.runningMovies[1] =  "Jack";
               theaters1.runningMovies[2] =  "Saiii";
               theaters1.runningMovies[3] =  "Jumbo";
			   
    System.out.println("Theater name is " +  theaters1.name);
	System.out.println("Theater address is  " + theaters1.address);
	System.out.println("Theater contact number is  " + theaters1.contactNo);
	System.out.println("Theater ownerName is  " + theaters1.ownerName);
    System.out.println("In" +  theaters1.name + " Running movies are " );
	theaters1.getRunningMovies();
  }
    public  void getRunningMovies(){
    for(int i=0; i<runningMovies.length; i++){
    System.out.println(runningMovies[i]);
	}
  }
 }