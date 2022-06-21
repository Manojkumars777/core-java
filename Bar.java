class Bar{

    String brandName ;
    String alchohalType;
    double alchohalPercentage;
    int price;                                                                            
    String []containt = {"Paddy" , "Sugar" , "Black dates"};
	String []containt1 = {"Grape" , "Sugar" , "Dot cots" , "Sugar cane"};
    String []containt2 = {"Strawberry" , "Sugar" , "Honay drops" , "Pinaple"}; 
	String []containt3 = {"Green apple" , "Sugar" , "Orange"};
	
	
	
	public static void main (String a[]){																
	  // className  refvariable = new className();
	  Bar bar = new Bar();
               bar.brandName = "Port Wine";
	           bar.alchohalType = "Wine";
	           bar.alchohalPercentage = 10.2;
	           bar.price = 350; 	
      Bar bar1 = new Bar();
			   bar1.brandName = "100 wala";
	           bar1.alchohalType = "Wine";
	           bar1.alchohalPercentage = 12.7;
	           bar1.price = 900;
      Bar bar2 = new Bar();
		       bar2.brandName = "Gonus";
	           bar2.alchohalType = "Wine";
	           bar2.alchohalPercentage = 9.99;
	           bar2.price = 725;
      Bar bar3 = new Bar();
			   bar3.brandName = "Apple wine";
	           bar3.alchohalType = "Wine";
	           bar3.alchohalPercentage = 7.987;
	           bar3.price = 375;
	
	System.out.println("Wine Brand name is " +  bar.brandName);
	System.out.println("Alchohal type is " + bar.alchohalType);
	System.out.println("Alchohal percentage " + bar.alchohalPercentage);
	System.out.println("Alchohal price is " + bar.price);
    System.out.println("Alchohal containts..............");
	bar.getContaint() ; 
	System.out.println("...........................................................................................");
		
	System.out.println("Wine Brand name is " +  bar1.brandName);
	System.out.println("Alchohal type is " + bar1.alchohalType);
	System.out.println("Alchohal percentage " + bar1.alchohalPercentage);
	System.out.println("Alchohal price is " + bar1.price);
    System.out.println("Alchohal containts..............");
	bar1.getContaint1() ;
    System.out.println("...........................................................................................");
		
	System.out.println("Wine Brand name is " +  bar2.brandName);
	System.out.println("Alchohal type is " + bar2.alchohalType);
	System.out.println("Alchohal percentage " + bar2.alchohalPercentage);
	System.out.println("Alchohal price is " + bar2.price);
    System.out.println("Alchohal containts..............");
	bar2.getContaint2() ; 
	System.out.println("...........................................................................................");
	
	System.out.println("Wine Brand name is " +  bar3.brandName);
	System.out.println("Alchohal type is " + bar3.alchohalType);
	System.out.println("Alchohal percentage " + bar3.alchohalPercentage);
	System.out.println("Alchohal price is " + bar3.price);
    System.out.println("Alchohal containts..............");
	bar3.getContaint3() ; 
	
	
  }
  
  public  void getContaint(){
   
	for(int i=0; i<containt.length; i++){
    System.out.println(containt[i]);
	}
  }
  
   public  void getContaint1(){
   
	for(int i=0; i<containt1.length; i++){
    System.out.println(containt1[i]);
	}
  }
  
    public  void getContaint2(){
   
	for(int i=0; i<containt2.length; i++){
    System.out.println(containt2[i]);
	}
  }
  
   public  void getContaint3(){
   
	for(int i=0; i<containt3.length; i++){
    System.out.println(containt3[i]);
	}
  }
  
 }