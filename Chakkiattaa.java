class Chakkiattaa
{

   String brandName;                                 
   String manufacturer;                                 
   int cost ;                                           
   
   public Chakkiattaa()
   {
	   System.out.println(" Chakkiattaa object is created ");
   }
   
   public Chakkiattaa(String brandName,String manufacturer,int cost)
   {
	   this();
	       this.brandName = brandName;
		   this.manufacturer = manufacturer;
		   this.cost = cost;
   }
   
   public static void main (String a[])
   {
	   Chakkiattaa atta = new Chakkiattaa("Sodexo","LLB Pvt ltd",800);
	   System.out.println(" Chakkiattaa brand name is " + atta.brandName + " and manufacturer are " + atta.manufacturer + " it costs " + atta.cost);
   }













}