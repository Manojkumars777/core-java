class PetroleBunk1{
             
			 
		    // instance variables
			int iD;
		    String bunkName;
            String location;                                                                                            //17-06-22                          
			long contactNo;
			
			//static variables
			static String typeOfOil = "Petrole , Desile, Power";
			
		public PetroleBunk1(int ID , String NameOfBunk , String address , long helplineNo , String oilType){
			System.out.println("PertroleBunk object created..................");
			
			this.iD = iD;
			this.bunkName =bunkName;
			this.location = location;
			this.contactNo =contactNo;
			this.typeOfOil = typeOfOil;
		}
		
	    public static void main(String ms[]){
			PetroleBunk1 bunk = new PetroleBunk1(100 , "HINDUSTAN PETROLE BUNK" , "16 feet road vinobanagara , Hydrabad" , 8123456789L , "Petrole , Desile, Power");
			System.out.println("Petrole bunk ID is " + " " + bunk.iD);
			System.out.println("Petrole bunk name is " + " " + bunk.bunkName);
			System.out.println("Petrole bunk location is " + " " + bunk.location);
			System.out.println("Petrole bunk contact number  is " + " " + bunk.contactNo);
			System.out.println("Types of oils available in bunk are " + PetroleBunk1.typeOfOil);
			
		} 
		
}