class Hospital{

    String name;
	int iD;
	String location;
	int numberOfdoctors;
	String type;
	
	public Hospital(){
		System.out.println(" Hospital is created ");
	}
	
	public static void main (String md[]){
	
	Hospital hospital = new Hospital();
	         hospital.name = "Bapuji Hospital";
			 hospital.iD = 88;
			 hospital.location = "Gunddi circle PJ Extention , Davanagere";
			 hospital.numberOfdoctors = 150;
			 hospital.type = "Children Hospital";
			 
    System.out.println("Hospital name is " + " ==== " + hospital.name);
	System.out.println("Hospital ID number is " + " ==== " + hospital.iD);	
	System.out.println("Hospital Location is " + " ==== " + hospital.location);
	System.out.println("Number of Doctors in Hospital is " + " ==== " + hospital.numberOfdoctors);
	System.out.println("Hospital type is " + " ==== " + hospital.type);
	System.out.println("...........................................................................................");
			 
    Hospital hospital1 = new Hospital();
	         hospital1.name = "CG Hospital";
			 hospital1.iD = 89;
			 hospital1.location = " K B Extention , Davanagere";
			 hospital1.numberOfdoctors = 95;
			 hospital1.type = "Dental Hospital";
			 
	System.out.println("Hospital name is " + " ==== " + hospital1.name);
	System.out.println("Hospital ID number is " + " ==== " + hospital1.iD);	
	System.out.println("Hospital Location is " + " ==== " + hospital1.location);
	System.out.println("Number of Doctors in Hospital is " + " ==== " + hospital1.numberOfdoctors);
	System.out.println("Hospital type is " + " ==== " + hospital1.type);
	System.out.println("...........................................................................................");
			 
   
			 
	Hospital hospital2 = new Hospital();
	         hospital2.name = "Srusthi Hospital";
			 hospital2.iD = 90;
			 hospital2.location = "Ram & co circle , Davanagere";
			 hospital2.numberOfdoctors = 50;
			 hospital2.type = "Eye Hospital";
			 
	System.out.println("Hospital name is " + " ==== " + hospital2.name);
	System.out.println("Hospital ID number is " + " ==== " + hospital2.iD);	
	System.out.println("Hospital Location is " + " ==== " + hospital2.location);
	System.out.println("Number of Doctors in Hospital is " + " ==== " + hospital2.numberOfdoctors);
	System.out.println("Hospital type is " + " ==== " + hospital2.type);
	System.out.println("...........................................................................................");
			 
	Hospital hospital3 = new Hospital();
	         hospital3.name = "City central Hospital";
			 hospital3.iD = 91;
			 hospital3.location = "Gunddi circle PJ Extention , Davanagere";
			 hospital3.numberOfdoctors = 230;
			 hospital3.type = "Super Speciality Hospital";
			 
	System.out.println("Hospital name is " + " ==== " + hospital3.name);
	System.out.println("Hospital ID number is " + " ==== " + hospital3.iD);	
	System.out.println("Hospital Location is " + " ==== " + hospital3.location);
	System.out.println("Number of Doctors in Hospital is " + " ==== " + hospital3.numberOfdoctors);
	System.out.println("Hospital type is " + " ==== " + hospital3.type);
	System.out.println("...........................................................................................");
	
	}
}