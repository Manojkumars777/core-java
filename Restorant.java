class Restorant 
{
   static String nonVeg[] = {"Mutton masala" , "Chicken fry" , "Fish curry" , "Mutton Biriyani"};            // practiced 
   
   public static void main ( String a[])
   {
     String value = getFood("Pork fry");
	 
	 System.out.println(" i want one plate " + value);
   }
   
   public static String getFood( String Food)
   {
   String FoodName = null ;
   for(int i=0 ; i<nonVeg.length ; i++)
   {
	   if(nonVeg[i] == Food)
	   {
		   FoodName = nonVeg[i];
	   }
	   else
	   {
		   System.out.println(Food + " is not available");
		   break ;
	   }
   }
   return FoodName ; 
   

   
   
   
   
   
   
   }



















}