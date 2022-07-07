
 public class OrthopedicsDTO{
 
	public OrthopedicsDTO(){

	}
	
  private String name;
  private String educationReq;
  private String employmentField;  
  private String sector;

     public String getName(){
	  return name;
     }
     public void setName(String name){ 
	   this.name = name;
	 }
	 
	 public String getSector(){
		 return sector;
	 }
	 public void setSector(String sector){
		 this.sector = sector;
	 }
	 
	 public String getEmploymentField (){
		 return employmentField;
	 }
	 public void setEmploymentField(String employmentField){
		 this.employmentField = employmentField;
	 }
	 
	 public String getEducationReq(){
		 return educationReq;
	 }
	 public void setEducationReq(String educationReq){
		 this.educationReq = educationReq;
	 }
	 
	 
  /*public void lifeLine(){
	  System.out.println("Condition involving musculoskeletal structure ");
  }*/
	
}