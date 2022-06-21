class Transportation{                                                                         //Assignment

              int iD;
              String transportationMode;
	          String transportationType;
       static String location = "Devanahalli Bangalore";
	          long helpLineNumber ;
			  
			  
			  public Transportation( int ID , String modeoftransportation , String typeoftransportation , long contactnumber){
				  System.out.println("Transportation object is created..............");
			  
			  iD = ID ;
			  transportationMode = modeoftransportation;
			  transportationType = typeoftransportation;
			  helpLineNumber     = contactnumber;
		   }
		   
		     public static void main ( String a[]){
				 
				 Transportation transportation = new Transportation( 10 , "RoadWays" , "Buss" , 7625030161L);
				 System.out.println( "ID number is" + " " + transportation.iD);
				 System.out.println("Mode of transportation is" + " " + transportation.transportationMode);
				 System.out.println("Type of transportation is" + " " + transportation.transportationType);
				 System.out.println("Location is" + " " + Transportation.location);
				 System.out.println("Contact Number is" + " " + transportation.helpLineNumber);
				 
				 System.out.println("****************************************************************************************");
				 
				 Transportation transportation1 = new Transportation( 12 , "AirWays" , "Helicopter" , 9902345678L);
				 System.out.println( "ID number is" + " " + transportation1.iD);
				 System.out.println("Mode of transportation is" + " " + transportation1.transportationMode);
				 System.out.println("Type of transportation is" + " " + transportation1.transportationType);
				 System.out.println("Location is" + " " + Transportation.location);
				 System.out.println("Contact Number is" + " " + transportation1.helpLineNumber);
				 
				 System.out.println("****************************************************************************************");
				 
				 Transportation transportation2 = new Transportation( 14 , "Waterways" , "Titanic Ship" , 8880234567L);
				 System.out.println( "ID number is" + " " + transportation2.iD);
				 System.out.println("Mode of transportation is" + " " + transportation2.transportationMode);
				 System.out.println("Type of transportation is" + " " + transportation2.transportationType);
				 System.out.println("Location is" + " " + Transportation.location);
				 System.out.println("Contact Number is" + " " + transportation2.helpLineNumber);
				 
				 System.out.println("****************************************************************************************");
				 
				 Transportation transportation3 = new Transportation( 16 , "Railway" , "Janshatabji" , 8234587654L);
				 System.out.println( "ID number is" + " " + transportation3.iD);
				 System.out.println("Mode of transportation is" + " " + transportation3.transportationMode);
				 System.out.println("Type of transportation is" + " " + transportation3.transportationType);
				 System.out.println("Location is" + " " + Transportation.location);
				 System.out.println("Contact Number is" + " " + transportation3.helpLineNumber);
				 
	        }
	   }