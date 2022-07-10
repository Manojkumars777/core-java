
import java.util.Scanner;
public class HotelTester{
	
	public static void main(String a[]){
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the number of FOOD ITEMS to be order : ");
		int size = sc.nextInt();
		
		Hotel hh = new Hotel(size);
		for(int i=0 ; i < size ; i++){
			System.out.print("Veg Or Non-Veg : ");
			String vegOrNonVeg = sc.next();
			System.out.print("Food name : ");
			String name = sc.next();
			System.out.print("Food price : ");
			int price = sc.nextInt();
			  
	    FoodItemsDTO dto = new FoodItemsDTO();
		            dto.setVegOrNonVeg(vegOrNonVeg);
		            dto.setName(name);
			        dto.setprice(price);
					hh.createFoodItems(dto);
					
		}
		            hh.getFoodItemsDetails();
	}
}