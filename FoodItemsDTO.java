
public class FoodItemsDTO{
	
	public FoodItemsDTO(){
		System.out.println("Food items object is created");
	}
	private String vegOrNonVeg;
	private String name;
	private int price;
	
	public String getVegOrNonVeg(){
		return vegOrNonVeg;
	}
	public void setVegOrNonVeg(String vegOrNonVeg){
		this.vegOrNonVeg = vegOrNonVeg;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getPrice(){
		return price;
	}
	public void setprice(int price){
		this.price = price;
	}
	
}