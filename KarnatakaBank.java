class KarnatakaBank extends Bank1
{
	 @Override
     public void getInterest(double interest) {

		System.out.print("The Karnataka bank ");
         interest = interest + 4.0 ;
   
        super.getInterest(interest);
        
      } 
}