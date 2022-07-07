
class AirportDTOTester{
	
	public static void main(String a[]){
		AirportDTO bird = new AirportDTO();
		        bird.setName("Habibi-777 jet***King");
				bird.setLocation("Dollar's coloney BANGALORE");
				bird.setType("Private");
				bird.setOwnerName("KasabUlla");
				bird.setContactNo(9998887777L);
				
				//bird.flyInSky();
	  System.out.println(bird.getName()+" / "+bird.getLocation()+" / "+bird.getType()+" / "+bird.getOwnerName()+" / "+bird.getContactNo());
	}

}