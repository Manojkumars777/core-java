class HomeStay 
{
  String name;
  String location;
  int pakageCost;
  String activities;
  
  public HomeStay()
  {
	  System.out.println( " HomeStay object is created ");
  }
  
  public HomeStay( String name , String location , int pakageCost , String activities)
  {
	  this();
	     this.name = name;
		 this.location = location;
		 this.pakageCost = pakageCost;
		 this.activities = activities;
  }
  
  public static void main ( String ms[])
  {
	  HomeStay peaceplaces = new HomeStay(" Nisarga Home stay " , " Near shiradighat Sakleshpura " , 3500 , " water games,indore games,trecking,DJ neight with fire camp ");
	  System.out.println(" Home stay name is " + "" + peaceplaces.name + "" + " and it is located " + "" + peaceplaces.location + "" + " pakage cost is " + "" + peaceplaces.pakageCost);
	  System.out.println( " Available activities are " + "" + peaceplaces.activities);
  }
  

















}