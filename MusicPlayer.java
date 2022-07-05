

public class MusicPlayer{
	
	public MusicPlayer(){
		System.out.println("Music player object is created");
	}
	
	private String brand;
	private String modelName;
	private String speakerType;
	
	public String getBrand(){
		return brand;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getModelName(){
		return modelName;
	}
	public void setModelName(String modelName){
		this.modelName = modelName;
	}
	public String getSpeakerType(){
		return speakerType;
	}
	public void setSpeakerType(String speakerType){
		this.speakerType = speakerType;
	}
	
	public void chillMadi(){
		System.out.println("Inna ean yochne madtiya Guru...Play madu...*");
	}
}