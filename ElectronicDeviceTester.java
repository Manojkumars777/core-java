class ElectronicDeviceTester
{
	public static void main(String a[])
	 {
		 LedBulp LEDBULP = new LedBulp();
		         LEDBULP.cost = 250;
				 LEDBULP.warenty = "1 year";
				 LEDBULP.watt = "18 watt";
		         LEDBULP.getElectronicDevice();
		 
		 System.out.println("LED bulp cost = " + LEDBULP.cost + " Warenty = " + LEDBULP.warenty + " Watt = " + LEDBULP.watt);
	
	    
	 }
}