class Subtraction1
{
public static void main(String a[])
{
   int subfinalvalue = sub( 20,10);
   System.out.println( " Subtraction of two no is " + subfinalvalue);
   
   int subfinalvalue1 = sub( 30,10,10);
   System.out.println(" Subtraction of three no is " + subfinalvalue1);
     
}

  public static int sub( int a,int b)
{
 return a-b;
}

  public static int sub( int a,int b,int c)
  {
   return a-b-c;
  }





}