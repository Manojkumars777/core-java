class CanaraBank extends Bank1
{
	
     @Override
     public void getInterest(double interest) {

        System.out.print("The Canara bank ");
         interest = interest + 3.3 ;
   
        super.getInterest(interest);
      } 
}