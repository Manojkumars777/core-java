class InstitutionTester
 {
   public static void main(String []a)
    {
		Xworkz xworkz = new Xworkz();
		       xworkz.location = "Dr Rajkumar road,Rajaji nagara,Bangalore";
			   xworkz.availableCourses = "Full stack JAVA";
			   xworkz.courseCost = 24000;
			   xworkz.courseDuration = "6 Months";
			   
			   xworkz.getInstitution();
			   
    System.out.println("Location = " + xworkz.location + " Available courses = " + xworkz.availableCourses +  " course fee = " + xworkz.courseCost + " course duration = " + xworkz.courseDuration);
	}
  }