
class TvChannelsTester{
	
	public static void main(String a[]){
		TvChannels tv = new TvChannels();
		           tv.setBrand("TATA-SKY");
				   tv.setAvailableChannels("All kannada and Hindhi channels");
				   tv.setMonthlyCharges("300");
				   
				   tv.entertainment();
		System.out.println(tv.getBrand()+" / "+tv.getAvailableChannels()+" / "+tv.getMonthlyCharges());
	}
	
}