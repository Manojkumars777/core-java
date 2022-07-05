class BigBasketTester{

	public static void main(String a[]){
		
		BigBasket bab = new BigBasket();
		          bab.setOwnedBy("Tata PTD Limited");
		          bab.setType("Online and offline");
		          bab.setStartedIn(2015);
		          bab.setOrigin("Mumbai");
		
		          bab.bigbas();
		
		
		System.out.println(bab.getOwnedBy()+" / "+bab.getType()+" / "+bab.getStartedIn()+" / "+bab.getOrigin());
		
	}
	
	
}