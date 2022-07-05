
class MusicPlayerTester{
	
	public static void main(String []a){
		MusicPlayer sound = new MusicPlayer();
		            sound.setBrand("Philips Audio");
					sound.setModelName("MMSS/8G65GF");
					sound.setSpeakerType("2.1 Channel speakers");
					
					sound.chillMadi();
		System.out.println(sound.getBrand()+" / "+sound.getModelName()+" / "+sound.getSpeakerType());
		
	}
}