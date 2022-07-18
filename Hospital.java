import java.util.Arrays ;
class Hospital{
     
	 // Has many patients
     PatientDTO dtos[] ;
	 
	 int index;
	 
	 public Hospital(int size){
		 dtos = new PatientDTO[size];
	    System.out.println("The Hospital object is created");
	 }
	 
	 public boolean createPatient(PatientDTO dto){
		  
		  System.out.println("The inside createPatient()");
		  boolean isAdded = false;
		  if(dto != null && dto.getName()!= null){
			  this.dtos[index++] = dto;
			  isAdded = true;
			  System.out.println("The patient details is saved");
		  }
		  
		  else{
			  System.out.println("Please Enter patient correct details");
		  }
		 
		 return isAdded;
	 }
	 
	 public void getPatientDetails(){
		 
		 System.out.println("Inside the getPatientDetails()");
		 for(int i=0; i<dtos.length; i++){
			 
			System.out.println(dtos[i]);
		 }
	 }
	 
	 public boolean updatePatientAddressById(int id, String address){
		 
		 System.out.println("Inside updatePatientAddressById ");
		 boolean updateAddress = false;
		 
		 for(int i=0; i<dtos.length;i++){
			 if(dtos[i].getId() == id ){
				 dtos[i].setAddress(address);
				 updateAddress = true;
				 
			 }
			 else{
				 System.out.println("The patient id is not found");
			 }
		 }
		 return updateAddress;
	 }
	 
	 
	 public boolean updatePatientContactNoByName(String name, long contactNo){
		 
		 System.out.println("Inside updatePatientContactNoByName ");
		 boolean updateContactNo = false;
		 for(int i=0; i<dtos.length;i++){
			 if(dtos[i].getName().equals(name)){
				 dtos[i].setContactNo(contactNo);
				 updateContactNo = true;
				 
			 }
			 else{
				 System.out.println("The patient name is not found");
			 }
		 }
		 return updateContactNo;
	 }
	 
	 public boolean deletePatientDetailsByName(String name){
		 boolean patientDeleted=false;
		 System.out.println("enter deletePatientDetailsByName() ");
		 int i,j; 
		 for(i=0,j=0;j<dtos.length;j++){
			 if(!dtos[j].getName().equals(name)){
				 dtos[i++]=dtos[j];
				 patientDeleted=true;
				
			 }
			 
			 else{
				
				 System.out.println("the patient is not available");
				
			 }
		 }
		 dtos = Arrays.copyOf(dtos, i);
		 return patientDeleted;
	 }
	 
	 public boolean deletePatientByContactNo(long contactNo){
		 System.out.println("inside deletePatientByContactNo()");
		 boolean patientDeletedContatc=false;
		 int i,j;
		 for(i=0,j=0;j<dtos.length;j++){
			 if(dtos[j].getContactNo()!=contactNo){
				 dtos[i++]=dtos[j];
				 patientDeletedContatc=true;
			 }
			 else{
				 System.out.println("The patient not found");
			 }
		 }
		 dtos = Arrays.copyOf(dtos, i);
		 return patientDeletedContatc;
	 }
	 
	 public String getPatientNameById(int id){
		 String patientName = null;
		 for(int i=0; i<dtos.length;i++){
			 if(dtos[i].getId()==id){
				patientName = dtos[i].getName();
				 
			 }
			 else{
				 System.out.println("The Patient id not matched");
			 }
			 
		 }
		 return patientName;
	 }
	 
	 public long getPatientContactNoByName(String name){
		 long patientContactNo = 0;
		 for(int i=0;i<dtos.length;i++){
			 if(dtos[i].getName().equals(name)){
				patientContactNo = dtos[i].getContactNo();
				 
			 }
			 else{
				 System.out.println("The patient name not matched");
			 }
		 }
		 return patientContactNo;
	 } 
	 
	 public boolean deletePatientDetailsByGender(Gender gender){
		 boolean patientDeleted=false;
		 System.out.println("Inside deletePatientDetailsByGender() ");
		 int i,j; 
		 for(i=0,j=0;j<dtos.length;j++){
			 if(dtos[j].getGender() != gender){
				 dtos[i++]=dtos[j];
				 patientDeleted=true;
				
			 }
			 
			 else{
				
				 System.out.println("the patient is not available");
				
			 }
		 }
		 dtos = Arrays.copyOf(dtos, i);
		 return patientDeleted;
	 }


}