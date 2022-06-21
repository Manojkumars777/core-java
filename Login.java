class Login
{
  public static void main(String a[])
  {
   long userId = login(1234567881628L);
   String emailId = login("manunaik@gmail.com");
  }
  
  
  
  public static long login( long userId)
  {
  System.out.println("user ID is " + userId);
  return userId;
  }
  
   public static String  login( String emailId)
  {
  System.out.println(" email ID is " + emailId );
  return emailId;
  }
 
  
  }