
public class TerminalDTO{
	
	public TerminalDTO(){
		System.out.println("TerminalDTO object is created");
	}
	
	private int id;
	private String type;
	private String airportName;
	private String location;
	private int numOfEntry;
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
	public String getAirportName(){
		return airportName;
	}
	public void setAirportName(String airportName){
	    this.airportName = airportName;
	}
	public String getLocation(){
		return location;
	}
	public void setLocation(String location){
		this.location = location;
	}
	public int getNumOfEntry(){
		return numOfEntry;
	}
	public void setNumOfEntry(int numOfEntry){
		this.numOfEntry = numOfEntry;
	}
	
}