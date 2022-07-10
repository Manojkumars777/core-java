
public class Hotel
{
	FoodItemsDTO[] dtos ;
	
	int index ;
	
	public Hotel(int size)
	{
		dtos = new FoodItemsDTO[size];
		System.out.println("Hotel constructor is called");
	}
	
	public boolean createFoodItems(FoodItemsDTO dto)
	{
		
		System.out.println("inside create Food items method");
		boolean isAdded = false;
		if(dto != null && dto.getName() != null){
			this.dtos[index++] = dto;
			isAdded = true;
			System.out.println("Hi welcome 2 Taj palace Hotel ***************************");
			System.out.println("Food order taken successfully");
			
			}
		else{
			System.out.println("cannot serve food .....order 1st");
		}
		return isAdded;
	}
	
	
	public void getFoodItemsDetails()
	{
		System.out.println("inside getFoodItemsDetails()");
		for(int i=0 ; i < dtos.length ; i++){
			System.out.println(dtos[i].getVegOrNonVeg() +"/" + dtos[i].getName() + "/" + dtos[i].getPrice());
		}
	}
	
	
}