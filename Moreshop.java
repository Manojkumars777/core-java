class Moreshop
{
static String biscuits[] = {"Parle","Treat","Barbon","Hiddensik","Bar bon","Marigold","CrackJack"};
static String deos[] = {"Fog","Axe","Yardly london","Kamasutra","Signature","Attar"};
static String chocolates[] = { "Kit-Kat","Dairymilk","5star","Perk","Almondshots","Milkybar"};
static String homeAppliences[] = {"Tv","Washing machien","Oven","Water heater","Fan","Refrigirator"};
static String coolDrinks[] = {"Cola","7up","Mirinda","Zeera","Slice","Maza"};
static String sportsProducts[] = {"CricketBat","VallyBall","BasketBall","Cricketkit","Hocky","ThrowBall"};static String grosaries[] = {"SteamRice","Daal","Sugar","Jawar","Maze","Honey"};


public static void main(String a [])
{
	getBiscuits();
	getDeos();
	getChocolates();
	getHomeAppliences();
	getCoolDrinks();
	getSportsProducts();
	
}
public static void getBiscuits()
{
	   System.out.println("Available biscuits in Moreshop ---------");
for( int i=0; i < biscuits.length; i++)
{
   System.out.println(biscuits[i]);
}
}
	
	public static void getDeos()
{
	
   System.out.println("Available deos in Moreshop ---------");
for( int i=0; i<deos.length; i++ )
{
   System.out.println(deos[i]);
}
}
		


	
public static void getChocolates(){
	
	System.out.println("Available chocolates in Moreshop ---------");

for( int i=0; i < chocolates.length; i++)
{
   System.out.println(chocolates[i]);


	
}
}

public static void getHomeAppliences(){
	System.out.println("Available homeAppliences in Moreshop---------");
	for(int i=0; i<homeAppliences.length; i++)
	{
		System.out.println(homeAppliences[i]);
	}
}

public static void getCoolDrinks()
{
	System.out.println("Available coolDrinks in  Moreshop ---------");
	for(int i=0; i<coolDrinks.length; i++)
	{
		System.out.println(coolDrinks[i]);
		
	}
	
}

public static void getSportsProducts()
{
	System.out.println("Available sportsProducts in Moreshop ---------");
	for(int i=0; i<sportsProducts.length; i++)
	{
		System.out.println(sportsProducts[i]);
		
	}
	
}




}
