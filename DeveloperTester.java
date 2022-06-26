class DeveloperTester
{
	public static void main(String a[])
	{
		Namba nambi = new Namba();
		      nambi.highestEducation = "BE";
			  nambi.designation = "Software Developer";
			  nambi.experience = "2 years";
			  
			  nambi.getDeveloper();
			  
	    System.out.println("Namba highest education is "+ nambi.highestEducation + " Designation is " + nambi.designation + " No of years experience " + nambi.experience);
	}
}