
public class Airport
{
	public Airport(){
		System.out.println("Airpotrt object is created");
	}
	
	 private String name;
	 private String location;
	 private String type;
	 private String ownerName;
	 private long contactNo;
	 
	 public String getName(){
		 return name;
	 }
	 public void setName(String name){
		 this.name = name;
	 }
	 public String getLocation(){
		 return location;
	 }
	 public void setLocation(String location){
		 this.location = location;
	 }
	 public String getType(){
		 return type;
	 }
	 public void setType(String type){
		 this.type = type;
	 }
	 public String getOwnerName(){
		 return ownerName;
	 }
	 public void setOwnerName(String ownerName){
		 this.ownerName = ownerName;
	 }
	 public long getContactNo(){
		 return contactNo;
	 }
	 public void setContactNo(long contactNo){
		 this.contactNo = contactNo;
	 }
	 
	 public void flyInSky(){
		 System.out.println("Habibi come to Dubai......");
	 }
	
}