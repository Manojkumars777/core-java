class EngineerTester
{
  public static void main(String []me)
  {
	  CivilEngineer civil = new CivilEngineer();
	                civil.civilians();
					
	  System.out.println("************************************************************");

	  MechEngineer royal = new MechEngineer();
	               royal.royalMech();
				   
	  System.out.println("************************************************************");
				   
	  CsEngineer coding = new CsEngineer();
	             coding.codingChamps();
				 
	  System.out.println("************************************************************");
				 
	  EcEngineer circuit = new EcEngineer();
	             circuit.circuitAttack();
		
  }


}