class BeerTester
{
	public static void main(String a[])
	{
		Budweiser magnum = new Budweiser();
		          magnum.alcoholContent = "5%";
				  magnum.quantity = "330 ml can";
				  magnum. price = 200;
				  magnum.mfDate = "12/06/2022";
				  magnum.expDate = "Best before 12 months";
				  magnum.owner = "Anheuser Busch";
				  
				  magnum.getBeer();
				  
		System.out.println("Owner of Budweiser beer = " + magnum.owner);		  
		System.out.println("Alcohol content in budweiser beer = " + magnum.alcoholContent + " quantity = " + magnum.quantity + " and its costs of = " + magnum.price);
		System.out.println("Manufacture date = " + magnum.mfDate);
		System.out.println("Expeity date = " + magnum.expDate);
		
		
	}
}



