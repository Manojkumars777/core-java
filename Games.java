
public class Games{
	
	public Games(){
		System.out.println("Games object is created");
	}
	
	private String name;
	private String version;
	private String size;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getVersion(){
		return version;
	}
	public void setVersion(String version){
		this.version = version;
	}
	public String getSize(){
		return size;
	}
	public void setSize(String size){
		this.size = size;
	}
	
	public void relaxin(){
		System.out.println("CAUSTION... Too much addiction iz Dangareous to ...");
	}
	
}