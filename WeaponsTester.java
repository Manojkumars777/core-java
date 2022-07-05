
class WeaponsTester{
	
	public static void main(String a[]){
		Weapons safety = new Weapons();
		        safety.setName("GL0007");
				safety.setType("Machien--Gun");
				safety.setBullets(35);
				
				safety.safety();
		System.out.println(safety.getName()+" / "+safety.getType()+" / "+safety.getBullets());
	}
	
}