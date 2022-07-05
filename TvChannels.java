
public class TvChannels{
	
	public TvChannels(){
		System.out.println("Tv channel object is created");
	}
	
	private String brand;
	private String availableChannels;
	private String monthlyCharges;
	
	public String getBrand(){
		return brand;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getAvailableChannels(){
		return availableChannels;
	}
	public void setAvailableChannels(String availableChannels){
		this.availableChannels = availableChannels;
	}
	public String getMonthlyCharges(){
		return monthlyCharges;
	}
	public void setMonthlyCharges(String monthlyCharges){
		this.monthlyCharges = monthlyCharges;
	}
	
	
	public void entertainment(){
		System.out.println("Waste of time");
	}

}