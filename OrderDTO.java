
public class OrderDTO{
	
	public OrderDTO(){
		System.out.println("OrderDTO object is created");
	}
	
	    private int orderNum;
		private String name;
		private String itemDetails;
		private long conNum;
		
		public int getOrderNum(){
			return orderNum;
		}
		public void setOrderNum(int orderNum){
			this.orderNum = orderNum;
		}
		public String getName(){
			return name;
		}
		public void setName(String name){
			this.name = name;
		}
		public String getItemDetails(){
			return itemDetails;
		}
		public void setItemDetails(String itemDetails){
			this.itemDetails = itemDetails;
		}
		public long getConNum(){
			return conNum;
		}
		public void setConNum(long conNum){
			this.conNum = conNum;
		}
	
}