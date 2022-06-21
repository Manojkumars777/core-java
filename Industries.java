class Industries{
       
	   int iD;
       String industryName;
	   String productionType;
	   long gstNumber;
	   String address;                                                                                                                             /// Assignment
	   long conNum;
	   
	   public Industries(int ID , String NameofIndustry , String TypeofProduction , long GSTnum , String Location ,  long mobNum ){
		   System.out.println("Industries object created .......................");
		   
		   iD = ID;
		   industryName = NameofIndustry;
		   productionType = TypeofProduction;
		   gstNumber = GSTnum;
		   address =  Location;
		   conNum = mobNum;
	  }
	  
	  public static void main(String me[]){
		  Industries industry = new Industries(77 , "Crazy Rice Mill", "Rice" , 8867457564L , "100 feet road , Davanagere" , 6666666666L);
		  System.out.println(industry.iD + "/" + industry.industryName + "/" + industry.productionType + "/" + industry.gstNumber + "/" + industry.address + "/" + industry.conNum);
		  
		  System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		  
		  Industries industry1 = new Industries(78 , "MSR Industries", "Small Scale" , 990055667L , "outer ring road , Davanagere" , 7777777777L);
		  System.out.println(industry1.iD + "/" + industry1.industryName + "/" + industry1.productionType + "/" + industry1.gstNumber + "/" + industry1.address + "/" + industry1.conNum);
		  
		  System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		  
		  Industries industry2 = new Industries(79 , "Power Mill", "Rice and Maze" , 8823142324L , "Nittuvalli , Davanagere" , 5555555555L);
		  System.out.println(industry2.iD + "/" + industry2.industryName + "/" + industry2.productionType + "/" + industry2.gstNumber + "/" + industry2.address + "/" + industry2.conNum);
		  
		  System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		  
		  Industries industry3 = new Industries(80 , "Manu Industries", "Cotton" , 6476374563L , " Shamanur , Davanagere" , 8888888888L);
		  System.out.println(industry3.iD + "/" + industry3.industryName + "/" + industry3.productionType + "/" + industry3.gstNumber + "/" + industry3.address + "/" + industry3.conNum);
		  
		  System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		  
		  Industries industry4 = new Industries(81 , "Priyapoora Industries", "Food Industry" , 8867457564L , "100 feet road , Davanagere" , 6666666666L);
		  System.out.println(industry4.iD + "/" + industry4.industryName + "/" + industry4.productionType + "/" + industry4.gstNumber + "/" + industry4.address + "/" + industry4.conNum);
		  
		 }
	   
}