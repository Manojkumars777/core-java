
 public class BigBasket{
	 
	public BigBasket(){
		System.out.println("Bigbasket object is created");
	}
	
  private String ownedBy;
  private double startedIn;
  private String type;
  private String origin;

     public String getOwnedBy(){
	  return ownedBy;
     }
     public void setOwnedBy(String ownedBy){ 
	   this.ownedBy = ownedBy;
	 }
	 
	 public String getType(){
		 return type;
	 }
	 public void setType(String type){
		 this.type = type;
	 }
	 
	 public double getStartedIn(){
		 return startedIn;
	 }
	 public void setStartedIn(double startedIn){
		 this.startedIn = startedIn;
	 }
	 
	 public String getOrigin(){
		 return origin;
	 }
	 public void setOrigin(String origin){
		 this.origin = origin;
	 }
	 
	 
  public void bigbas(){
	  System.out.println("Order items online");
  }
	
}