
  class LaptoppTester
{
	
    public static void main (String []me)
	{
		Dell dell = new Dell();
		        dell.cost = 40000;
				dell.color = "White";
				dell.size = "14 inch";
				dell.processor = "intel core i3 ";
				
				dell.getLaptop();
				
	System.out.println(" Laptop cost is " + dell.cost + " color " + dell.color + " and size " + dell.size + " processor is " + dell.processor);
	}
}
