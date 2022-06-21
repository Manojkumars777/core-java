class  AC
{
	static String brandName         = "Sony";
	static String loadType          = "Top load";
	static String color             = "Blue";                                                                   // 07/06/22
	static double cost              = 35000.00;
	static boolean isConnected ;
	static int maximumTemperature   = 35;
	static int minimumTempareture ;
	static int currentTempareture ;
	
	
	public static void onOrOff()
	{
		System.out.println(" invoking onOrOff method ");
		if(isConnected == false){
			isConnected = true;
		System.out.println(" AC is turned on ");
		}
		else if(isConnected == true){
			isConnected = false;
			System.out.println(" AC is turned off ");
		}
		System.out.println(" onOrOff method ended ");
		
	}
	
	public static void main ( String a [])
	{
		System.out.println(" AC brandName is .........." + brandName);
		System.out.println(" AC color is  ........." + color );
		System.out.println(" AC loadType is  .........." + loadType);
		onOrOff();
		increseTemperature();
		increseTemperature();
		increseTemperature();
		increseTemperature();
		increseTemperature();
		decreseTemperature();
	    decreseTemperature();
		decreseTemperature();
		decreseTemperature();
		decreseTemperature();
		onOrOff();
		
	}
	
	public static void increseTemperature()
	{
		System.out.println(" increseTemperature method started ");
		if(isConnected == true)
		{
			System.out.println(" AC is turned on ");
		if(currentTempareture < maximumTemperature)
		{
			currentTempareture = currentTempareture + 1 ;
			System.out.println(" The currentTempareture is " + currentTempareture);
		}	
		else 
		{
			System.out.println(" maximumTemperature reached ");
		}
		
		}
		else
		{
			System.out.println(" AC is turned off ");
		}
		    System.out.println(" increseTemperature method ended ");
		
	
	}
	
	public static void decreseTemperature()
	{
		System.out.println(" decreseTemperature method started ");
		if(isConnected == true)
		{
			System.out.println(" AC is turned on ");
		if(currentTempareture > minimumTempareture)
		{
			currentTempareture = currentTempareture - 1;
		    System.out.println(" currentTempareture is " + currentTempareture);
	    }
		else 
		{
			System.out.println(" maximumTemperature reached ");
		}
		
		}
		else 
		{
			System.out.println(" AC is turned off ");
		}
		
		    System.out.println(" decreseTemperature method ended ");
		
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
