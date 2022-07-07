
class OrthopedicsDTOTester{

	public static void main(String a[]){
		
		OrthopedicsDTO or = new OrthopedicsDTO();
		            or.setName("Physician,Surgeon");
		            or.setSector("Medicine,Surgery");
		            or.setEmploymentField("Hospital,clinic");
		            or.setEducationReq("M.B.B.S , M.D");
		
		            //or.lifeLine();
		
		System.out.println(or.getName()+" / "+or.getSector()+" / "+or.getEmploymentField()+" / "+or.getEducationReq());
		
	}
	
	
}