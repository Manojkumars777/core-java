class Stationery{

   String name;
   String color;
   String type;
   int iD;
   int cost;
   
   public Stationery(){
	   System.out.println(" Stationery is created ");
   }
   
   public static void main (String a[]){
   
   Stationery stationery = new Stationery ();
              stationery.name = "PEN";
			  stationery.color = "Blue";
			  stationery.type = "Ball Pen";
			  stationery.iD = 33;
			  stationery.cost = 20;
			  
	System.out.println("Stationery name is " + " ==== " + stationery.name);
	System.out.println("Pen color  is " + " ==== " + stationery.color);
	System.out.println("Pen type  is " + " ==== " + stationery.type);
	System.out.println("Stationery ID is " + " ==== " + stationery.iD);
	System.out.println("Pen cost is " + " ==== " + stationery.cost);
	System.out.println("...........................................................................................");
			  
   Stationery stationery1 = new Stationery ();
              stationery1.name = "Book";
			  stationery1.color = "white";
			  stationery1.type = "Un ruled";
			  stationery1.iD = 34;
			  stationery1.cost = 35;
			  
	System.out.println("Stationery name is " + " ==== " + stationery1.name);
	System.out.println("Book color  is " + " ==== " + stationery1.color);
	System.out.println("Book type  is " + " ==== " + stationery1.type);
	System.out.println("Stationery ID is " + " ==== " + stationery1.iD);
	System.out.println("Book cost is " + " ==== " + stationery1.cost);
    System.out.println("...........................................................................................");
			  
   Stationery stationery2 = new Stationery ();
              stationery2.name = "Sketch pen";
			  stationery2.color = "All colors 1 set";
			  stationery2.type = "Ink";
			  stationery2.iD = 35;
			  stationery2.cost = 250;
			  
	System.out.println("Stationery name is " + " ==== " + stationery2.name);
	System.out.println("Sketch Pen color  is " + " ==== " + stationery2.color);
	System.out.println("Sketch pen type  is " + " ==== " + stationery2.type);
	System.out.println("Stationery ID is " + " ==== " + stationery2.iD);
	System.out.println("Sketch pen cost is " + " ==== " + stationery2.cost);
    System.out.println("...........................................................................................");
			  
   Stationery stationery3 = new Stationery ();
              stationery3.name = "Scale";
			  stationery3.color = "Silver";
			  stationery3.type = "Metalic scale";
			  stationery3.iD = 36;
			  stationery3.cost = 80;
			  
	System.out.println("Stationery name is " + " ==== " + stationery3.name);
	System.out.println("Scale color  is " + " ==== " + stationery3.color);
	System.out.println("Scale type  is " + " ==== " + stationery3.type);
	System.out.println("Stationery ID is " + " ==== " + stationery3.iD);
	System.out.println("Scale cost is " + " ==== " + stationery3.cost);
			  
	 }
 
 }