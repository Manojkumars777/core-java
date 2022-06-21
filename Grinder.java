class Grinder
{
	static String brandName = "JWS";
	static String loadType  = "Fully loaded";
	static boolean isConnected ;
	static double cost = 4500.00;
	static int maximumSpeed = 20;
	static int minimumSpeed ;
	static int currentSpeed ;
	
	
	public static void onOrOff()
	{
		System.out.println(" invoking onOrOff method ");
		if(isConnected == false)
		{
			isConnected = true;
			System.out.println(" Grinder is turned on ");
		}
		else if(isConnected == true)
		{
			isConnected = false;
			System.out.println(" Grinder is trurned off ");
		}
		
	}
	
	public static void main( String a [])
	{
		System.out.println(" Grinder brandName is " + "...................." + brandName );
		System.out.println(" Grinder loadType is " + "...................." + loadType );
		System.out.println(" Grinder cost is " + "...................." + cost );
		onOrOff();
		increseSpeed();
		increseSpeed();
		increseSpeed();
		increseSpeed();
		decreseSpeed();
	    decreseSpeed();
	    decreseSpeed();
		decreseSpeed();
		onOrOff();
	}
	
	public static void increseSpeed()
	{
		System.out.println(" increseSpeed method started ");
		if(isConnected == true)
		{
			System.out.println(" Grinder is turned on ");
		if(currentSpeed < maximumSpeed)
		{
			currentSpeed = currentSpeed + 1;
			System.out.println(" Grinder currentSpeed is " + currentSpeed);
	    }
		else 
		{
			System.out.println(" maximumSpeed reached ");
	    }
		}
		else
		{
			System.out.println(" Grinder is turned off ");
		}
		    System.out.println(" increseSpeed method ended ");
	}
	
	public static void decreseSpeed()
	{
		System.out.println(" decreseSpeed method started ");
		if(isConnected == true)
		{
			System.out.println(" Grinder is turned on ");
		if(currentSpeed > minimumSpeed)
		{
			currentSpeed = currentSpeed - 1;
			System.out.println( " Grinder currentSpeed is " + currentSpeed );
		}
		else
		{
			System.out.println(" maximumSpeed is reached ");
		}
		}
		else
		{
			System.out.println(" Grinder is turned off ");
		}
		    System.out.println(" decreseSpeed method ended ");
	}
}