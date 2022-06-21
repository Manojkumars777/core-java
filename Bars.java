class Bars{

  String name;
  String type;                                              // Array old type ....
  int iD;
  String ownerName;
  int gstNumber;
  String availableBrands[] = {"KF & Tuburg Strong Bear , Odka , OMR , DSP Black , Signature , IB , Black & White , Red lable "};
  
  public Bars(){
	  System.out.println(" Bars are created ");
  }
  
  public static void main (String my[]){
  
  Bars bars = new Bars ();
       bars.name = "Madhuloka";
	   bars.type = "MRP";
	   bars.iD = 12;
	   bars.ownerName = "Madhavamurthy";
	   bars.gstNumber = 6753426;
	   
  System.out.println(" Bar name is " + "----" + bars.name);  
  System.out.println(" Bar type is " + "----" + bars.type);
  System.out.println(" Bar ID number is " + "----" + bars.iD);
  System.out.println(" Bar owner name  is " + "----" + bars.ownerName);
  System.out.println(" Bar GST number is " + "----" + bars.gstNumber);
  System.out.println("Available brands are ");
  bars.getAvailablebrands();
  
  System.out.println("...........................................................................................");
	   
  Bars bars1 = new Bars ();
       bars1.name = "18+";
	   bars1.type = "MSIL";
	   bars1.iD = 13;
	   bars1.ownerName = "krishna";
	   bars1.gstNumber = 2263736;
	   
  System.out.println(" Bar name is " + "----" + bars1.name);  
  System.out.println(" Bar type is " + "----" + bars1.type);
  System.out.println(" Bar ID number is " + "----" + bars1.iD);
  System.out.println(" Bar owner name  is " + "----" + bars1.ownerName);
  System.out.println(" Bar GST number is " + "----" + bars1.gstNumber);
  System.out.println("Available brands are ");
  bars.getAvailablebrands();
  
  System.out.println("...........................................................................................");
	   
  Bars bars2 = new Bars ();
       bars2.name = "Spirit";
	   bars2.type = "Bar and Restorant";
	   bars2.iD = 14;
	   bars2.ownerName = "Jhon";
	   bars2.gstNumber = 873826;
	   
  System.out.println(" Bar name is " + "----" + bars2.name);  
  System.out.println(" Bar type is " + "----" + bars2.type);
  System.out.println(" Bar ID number is " + "----" + bars2.iD);
  System.out.println(" Bar owner name  is " + "----" + bars2.ownerName);
  System.out.println(" Bar GST number is " + "----" + bars2.gstNumber);
  System.out.println("Available brands are ");
  bars.getAvailablebrands();
  
  System.out.println("...........................................................................................");
	   
  Bars bars3 = new Bars ();
       bars3.name = "Wine Place";
	   bars3.type = "MRP";
	   bars3.iD = 15;
	   bars3.ownerName = "Reeta";
	   bars3.gstNumber = 728628;
	   
  System.out.println(" Bar name is " + "----" + bars3.name);  
  System.out.println(" Bar type is " + "----" + bars3.type);
  System.out.println(" Bar ID number is " + "----" + bars3.iD);
  System.out.println(" Bar owner name  is " + "----" + bars3.ownerName);
  System.out.println(" Bar GST number is " + "----" + bars3.gstNumber);
  System.out.println("Available brands are ");
  bars.getAvailablebrands();
  
  }
  
  public void getAvailablebrands(){
  
  for(int i=0 ; i<availableBrands.length ; i++){
  System.out.println(availableBrands[i]);
  }
  
  }
}