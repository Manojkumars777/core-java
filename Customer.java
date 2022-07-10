
public class Customer{
	
	OrderDTO[] dtos;
    int index;
 
    public Customer(int size){
		dtos = new OrderDTO[size];
		System.out.println("Customer constructor is called");
	} 
	
	public boolean createOrder(OrderDTO dto){
		System.out.println("inside create order method");
		boolean isAdded = false;
		if(dto != null && dto.getName() != null){
			this.dtos[index++] = dto;
			isAdded = true;
			System.out.println("Hello welcome to DUNZO 24/7 service");
			System.out.println("Order placed successfully....we ll reach u within 20min...Thank you ");
		}
		else{
			System.out.println("cannot serve booked items......Order 1st");
		}
		return isAdded;
	}
		
	public void getOrderDetails()
	{
	  System.out.println("inside getOrderDetails() ");
	 for(int i=0 ; i < dtos.length ; i++){
	  System.out.println(dtos[i].getOrderNum() +"/"+ dtos[i].getName() +"/"+ dtos[i].getItemDetails() +"/"+ dtos[i].getConNum()); 
	 }
	}
 }