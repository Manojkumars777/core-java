
import java.util.Scanner;
public class CustomerTester{
	
	   public static void main(String a[]){
		
		   Scanner scan = new Scanner(System.in);
		   System.out.print("Enter the number of Orders : ");
		   int size = scan.nextInt();
		
		   Customer cm = new Customer(size);
		for(int i=0 ; i < size ; i++){
			System.out.print("Order Number : " );
			int orderNum = scan.nextInt();
			System.out.print("Person Name : " );
			String name = scan.next();
            System.out.print("Item details..... : " );
			String itemDetails = scan.next();
			System.out.print("contact Number.... : " );
			long conNum = scan.nextLong();
			
		    OrderDTO dto = new OrderDTO();
			         dto.setOrderNum(orderNum);
					 dto.setName(name);
					 dto.setItemDetails(itemDetails);
					 dto.setConNum(conNum);
					 cm.createOrder(dto);
			 }
			          cm.getOrderDetails();
		}
}