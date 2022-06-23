class SevaSindu
{

     int iD ;
	 String location ;
	 String openTimeing ; 
	 String closeTimeing ;
	 
	 static String availableServices = " All Digital services ";
	 
	 
	 public SevaSindu()
	 {
	   System.out.println(" SevaSindu object is created ");
	 }
	 public SevaSindu( int iD , String location , String openTimeing , String closeTimeing)
	 {
		this();
		 this.iD = iD;
		 this.location = location;
		 this.openTimeing = openTimeing;
		 this.closeTimeing = closeTimeing;
	 }
	 
	 public static void main (String me[])
	 {
		 SevaSindu sevakendra = new SevaSindu( 777 , " BTM Layout near Mico buss stop , Bangalore " , " 9:00 AM " , " 8:30PM ");
		 System.out.println( " Id number of sevasindu is " + "" + sevakendra.iD + " and it is in " + "" + sevakendra.location);
		 System.out.println( " opening timeings is = " + "" + sevakendra.openTimeing + "" + " closeing timeings = " + "" + sevakendra.closeTimeing);
		 System.out.println( " Available services are = " + "" + SevaSindu.availableServices);
		 
		 System.out.println( "...............................................................");
		 
		 SevaSindu sevakendra1 = new SevaSindu( 888 , " Vijaya nagara , Bangalore " , " 9:30 AM " , " 7:00PM ");
		 System.out.println( " Id number of sevasindu is " + "" + sevakendra1.iD + " and it is in " + "" + sevakendra1.location);
		 System.out.println( " opening timeings is = " + "" + sevakendra1.openTimeing + "" + " closeing timeings = " + "" + sevakendra1.closeTimeing);
		 System.out.println( " Available services are = " + "" + SevaSindu.availableServices);
		 
	 }
	 
	 

























}