
class Division
{
public static void main(String a[])
{
   int divisionValue = div( 20,10);
   System.out.println( " Division of two no is " + divisionValue);
   
   int divisionValue1 = div( 30,10,10);
   System.out.println(" Division of three no is " + divisionValue1);
     
}

  public static int div( int a,int b)
{
 return a/b;
}

  public static int div( int a,int b,int c)
  {
   return a/b/c;
  }





}