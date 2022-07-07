
class MusicPlayerDTOTester{
	
	public static void main(String []a){
		MusicPlayerDTO sound = new MusicPlayerDTO();
		            sound.setBrand("Philips Audio");
					sound.setModelName("MMSS/8G65GF");
					sound.setSpeakerType("2.1 Channel speakers");
					
					//sound.chillMadi();
		System.out.println(sound.getBrand()+" / "+sound.getModelName()+" / "+sound.getSpeakerType());
		
	}
}