
class GamesTester{
	
	public static void main(String a[]){
		Games play = new Games();
		      play.setName("Stick cricket");
			  play.setVersion("2.0VVN");
			  play.setSize("31.Mb");
			  
			  play.relaxin();
			  
	  System.out.println(play.getName()+" / "+play.getVersion()+" / "+play.getSize());
	}
}