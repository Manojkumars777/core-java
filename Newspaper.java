
public class Newspaper{
	
	public Newspaper(){
		System.out.println("Newspaper object is created");
	}
	
	private String founderName;
	private String foundedIn;
	private String firstNewspaper;
	
	public String getFounderName(){
		return founderName;
	}
	public void setFounderName(String founderName){
		this.founderName = founderName;
	}
	public String getFoundedIn(){
		return foundedIn;
	}
	public void setFoundedIn(String foundedIn){
		this.foundedIn = foundedIn;
	}
	public String getFirstNewspaper(){
		return firstNewspaper;
	}
	public void setFirstNewspaper(String firstNewspaper){
		this.firstNewspaper = firstNewspaper;
	}
	
	
	public void NEWS(){
		System.out.println("NORTH----EAST-----WEST-----SOUTH updates");
	}
 












}