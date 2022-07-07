
public class NovelDTO
{
   public NovelDTO(){
	 
   }
   
   private String novelName;
   private String authorName;
   private String publishedIn;
   private String awards;
   
   public String getNovelName(){
	   return novelName;
   }
   public void setNovelName(String novelName){
	   this.novelName = novelName;
   }
   public String getAuthorName(){
	   return authorName;
   }
   public void setAuthorName(String authorName){
	   this.authorName = authorName;
   }
   public String getPublishedIn(){
	   return publishedIn;
   }
   public void setPublishedIn(String publishedIn){
	   this.publishedIn = publishedIn;
   }
   public String getAwards(){
	   return awards;
   }
   public void setAwards(String awards){
	   this.awards = awards;
   }
   
  /* public void kavana(){
	   System.out.println("Kate inna mugdilla ....Ega praramba");
   }*/
}