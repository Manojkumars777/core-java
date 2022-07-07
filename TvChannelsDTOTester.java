
class TvChannelsDTOTester{
	
	public static void main(String a[]){
		TvChannelsDTO tv = new TvChannelsDTO();
		           tv.setBrand("TATA-SKY");
				   tv.setAvailableChannels("All kannada and Hindhi channels");
				   tv.setMonthlyCharges("300");
				   
				   tv.entertainment();
		System.out.println(tv.getBrand()+" / "+tv.getAvailableChannels()+" / "+tv.getMonthlyCharges());
	}
	
}