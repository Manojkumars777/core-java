class SoftwareCompanyTester
{
   public static void main(String a[])
   {
	   Google google = new Google();
	          google.founder = "Sergey Brin and Larry Page";
			  google.headQuater = "Mountain view California,United states";
			  google.getSoftwareCompany();
		
        System.out.println("Google founded by = " + google.founder + " and headquater is " + google.headQuater);		
    
   }

}