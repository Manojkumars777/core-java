class KotakMahendraBank extends Bank1
{
	 @Override
     public void getInterest(double interest) {

		System.out.print("The KotakMahendra bank ");
         interest = interest + 2.7 ;
   
        super.getInterest(interest);
        
      } 
}