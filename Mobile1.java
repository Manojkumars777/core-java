class Mobile1
{
    
	  String brandName;
      String colour;
      int cost;
      String os;
	 
	 public Mobile1()
	 {
		 System.out.println(" Mobile1 object is created ");
	 }
	 
	 public Mobile1( String brandName, String colour,int cost,String os)
	 {
		this();
		   this.brandName = brandName;
		   this.colour = colour;
		   this.cost = cost;
		   this.os = os;
	 }
	 
	 public static void main (String m[])
	 {
		 Mobile1 cellphone = new Mobile1("SAMSUNG","White",9000,"Android");
		 System.out.println(" Mobile Brand name is " + "" + cellphone.brandName + "" + " and color is " + "" + cellphone.colour + "" + " it costs " + "" + cellphone.cost 
		  + "," + " Operating system is " + "" + cellphone.os);
	 }
	 




























}