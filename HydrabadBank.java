class HydrabadBank extends Bank1
{
  
    @Override
     public void getInterest(double interest) {

		System.out.print("The Hydrabad Bank ");
         interest = interest + 2.22 ;
   
        super.getInterest(interest);
        
      }
}