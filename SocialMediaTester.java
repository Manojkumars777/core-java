class SocialMediaTester
{
   public static void main(String []a)
   {
	   Instagram app = new Instagram();
	             app.userName = "manu_naik07";
				 app.fallowers = 950;
				 app.fallowing = 507;
				 app.accountType = "Private";
				 app.noOfPosts = 130;
				 app.noOfReels = 15;
	             app.getSocialMedia();
				 
	    System.out.println("Instagram ID = " +app.userName);
		System.out.println("Account type = "+app.accountType);
		System.out.println("Number of fallowers = "+app.fallowers);
		System.out.println("Number of fallowing = "+app.fallowing);
		System.out.println("Number of posts = "+app.noOfPosts);
		System.out.println("Number of Reels posted = "+app.noOfReels);
	}
}