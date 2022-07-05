
class OrthopedicsTester{

	public static void main(String a[]){
		
		Orthopedics or = new Orthopedics();
		            or.setName("Physician,Surgeon");
		            or.setSector("Medicine,Surgery");
		            or.setEmploymentField("Hospital,clinic");
		            or.setEducationReq("M.B.B.S , M.D");
		
		            or.lifeLine();
		
		System.out.println(or.getName()+" / "+or.getSector()+" / "+or.getEmploymentField()+" / "+or.getEducationReq());
		
	}
	
	
}