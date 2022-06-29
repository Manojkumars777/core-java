class SbiBank extends Bank1
{
     @Override
     public void getInterest(double interest) {

		System.out.print("The State Bank of India ");
         interest = interest + 3.9;
   
        super.getInterest(interest);
        
      }
}