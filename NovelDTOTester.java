
class NovelDTOTester{
	
	public static void main(String a[]){
		NovelDTO novel = new NovelDTO();
		      novel.setNovelName("To Kill a MockingBird");
			  novel.setAuthorName("Harper Lee");
			  novel.setPublishedIn("11 july 1960");
			  novel.setAwards("Pulitzer prize for fiction");
			  
			  //novel.kavana();
	  System.out.println(novel.getNovelName()+" / "+novel.getAuthorName()+" / "+novel.getPublishedIn()+" / "+novel.getAwards());
	}
	
}