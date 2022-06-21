class Institutes{
                                                                                                                  // 17 assignment ....adding this key word
       int iD;
	   String name;
       String location;
static String availableBranches = "CiviL , Mech , EEE , EC , IS ,Textile ";
static String university        =  "VTU" ;
       String clgType;
       long conNum;
	   
	   public Institutes(int iD , String name , String location , String clgType , long conNum){
	       System.out.println(" Institutes object is created..........");
		   
		   this.iD = iD                                                                                                                                                           
		   this.name = name;
		   this.location = location;
		   this.clgType = clgType;
		   this.conNum = conNum;
	   }
		   
	   public static void main (String a[]){
		   
		  Institutes colleges = new Institutes(30 , "Bapuji Institutes of college" , "BIET road Anjaneya badavane Davanager" , "Private college" , 9922334458L);
		  System.out.println(" The ID number of " + colleges.name + " is " + colleges.iD +  " & location is " + colleges.location);
		  System.out.println(" Availables Branches are " + Institutes.availableBranches);
		  System.out.println(" This college is " + colleges.clgType + " & Contact number is "  + colleges.conNum);
		  System.out.println(" This college university name is " + Institutes.university);
		  
		  System.out.println("----------------------------------------------------------------------------------------------------");
		  
		  Institutes colleges1 = new Institutes(31 , "Jain college of institutes" , "Hadadi road ,  Davanager" , "Private college" , 8877646450L);
		  System.out.println(" The ID number of " + colleges1.name + " is " + colleges1.iD +  " & location is " + colleges1.location);
		  System.out.println(" Availables Branches are " + Institutes.availableBranches);
		  System.out.println(" This college is " + colleges1.clgType + " & Contact number is "  + colleges1.conNum);
		  System.out.println(" This college university name is " + Institutes.university);
		  
		  System.out.println("----------------------------------------------------------------------------------------------------");
		  
		  Institutes colleges2 = new Institutes(32 , "GMIT" , "Harihara road , Davanager" , "Private college" , 7778889990L);
		  System.out.println(" The ID number of " + colleges2.name + " is " + colleges2.iD +  " & location is " + colleges2.location);
		  System.out.println(" Availables Branches are " + Institutes.availableBranches);
		  System.out.println(" This college is " + colleges2.clgType + " & Contact number is "  + colleges2.conNum);
		  System.out.println(" This college university name is " + Institutes.university);
		  
		  System.out.println("----------------------------------------------------------------------------------------------------");
		  
		  Institutes colleges3 = new Institutes(33 , "UBDT college" , "Vidhya nagara Davanager" , "Government college" , 6677884455L);
		  System.out.println(" The ID number of " + colleges3.name + " is " + colleges3.iD +  " & location is " + colleges3.location);
		  System.out.println(" Availables Branches are " + Institutes.availableBranches);
		  System.out.println(" This college is " + colleges3.clgType + " & Contact number is "  + colleges3.conNum);
		  System.out.println(" This college university name is " + Institutes.university);
		 
		   
	   }
	   
}