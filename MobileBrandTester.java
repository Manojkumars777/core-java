class MobileBrandTester
{
	public static void main(String me[])
	{
		OnePlus topbrand = new OnePlus();
		        topbrand.cost = 25000;
				topbrand.os = "Android";
				topbrand.color = "Black beatle";
				topbrand.features = "104 mp camera with ultra zooming,fast charging";
				
				topbrand.getMobileBrand();
	
	System.out.println("Mobile cost is "+ topbrand.cost +" OS is " + topbrand.os + " and color " + topbrand.color);
	System.out.println("Features of oneplus mobile = " + topbrand.features);
	}
}