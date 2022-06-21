class PetroleBunk{
             
			int iD;
		    String bunkName;
	 static String typeOfOil = "Petrol , Desile , Power";
	        String location;
			long contactNo;
			
		public PetroleBunk(int ID , String NameOfBunk , String address , long helplineNo){
			System.out.println("PertroleBunk object created..................");
			
			iD = ID;
			bunkName = NameOfBunk;
			location = address;
			contactNo = helplineNo;
		}
		
	    public static void main(String ms[]){
			PetroleBunk bunk = new PetroleBunk(100 , "HINDUSTAN PETROLE BUNK" , "16 feet road vinobanagara , Hydrabad" , 8123456789L);
			System.out.println("Petrole bunk ID is " + " " + bunk.iD);
			System.out.println("Petrole bunk name is " + " " + bunk.bunkName);
			System.out.println("Petrole bunk location is " + " " + bunk.location);
			System.out.println("Petrole bunk contact number  is " + " " + bunk.contactNo);
			System.out.println("Types of oils available in bunk are " + typeOfOil);
			
		    System.out.println("****************************************************************************************");
			
			PetroleBunk bunk1 = new PetroleBunk(110 , "SHELL" , "Bazzar ring road , Hydrabad" , 9954738219L);
			System.out.println("Petrole bunk ID is " + " " + bunk1.iD);
			System.out.println("Petrole bunk name is " + " " + bunk1.bunkName);
			System.out.println("Petrole bunk location is " + " " + bunk1.location);
			System.out.println("Petrole bunk contact number  is " + " " + bunk1.contactNo);
			System.out.println("Types of oils available in bunk are " + typeOfOil);
			
		    System.out.println("****************************************************************************************");
			
			PetroleBunk bunk2 = new PetroleBunk(120 , "BHARATH PETROLIUM" , "K.E.B Extention , Hydrabad" , 7676764536L);
			System.out.println("Petrole bunk ID is " + " " + bunk2.iD);
			System.out.println("Petrole bunk name is " + " " + bunk2.bunkName);
			System.out.println("Petrole bunk location is " + " " + bunk2.location);
			System.out.println("Petrole bunk contact number  is " + " " + bunk2.contactNo);
			System.out.println("Types of oils available in bunk are " + typeOfOil);
			
		    System.out.println("****************************************************************************************");
			
			PetroleBunk bunk3 = new PetroleBunk(130 , "HP" , "Someshwara nagara opposite to bekary , Hydrabad" , 9999999999L);
			System.out.println("Petrole bunk ID is " + " " + bunk3.iD);
			System.out.println("Petrole bunk name is " + " " + bunk3.bunkName);
			System.out.println("Petrole bunk location is " + " " + bunk3.location);
			System.out.println("Petrole bunk contact number  is " + " " + bunk3.contactNo);
			System.out.println("Types of oils available in bunk are " + typeOfOil);
			
		} 
			
}