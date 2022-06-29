class AxsisBank  extends Bank1
{
	
     @Override
     public void getInterest(double interest) {
		System.out.print("The Axsis Bank ");

         interest = interest + 4.2 ;
   
         super.getInterest(interest);
        
      } 
}