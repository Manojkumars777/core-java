
public class Container
{
	public Container()
	{
		System.out.println("Container object is created");
	}
	
	private String name;
    private String typeOfContainer;
	private int cost ;
	private String color;
	private String capacity;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getTypeOfContainer(){
		return typeOfContainer;
	}
	public void setTypeOfContainer(String typeOfContainer){
		this.typeOfContainer = typeOfContainer;
	}
	
	public int getCost(){
		return cost;
	}
	public void setCost( int cost){
		this.cost = cost;
	}
	
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	
	public String getCapacity(){
		return capacity;
	}
	public void setCapacity(String capacity){
		this.capacity = capacity;
	}
	
	void storage(){
		System.out.println("Main purpose iz to store items");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}