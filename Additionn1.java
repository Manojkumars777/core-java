class Additionn1
 {
    public static void main(String[] args)
	{
      int finalValue = add(56,56);
	  System.out.println(finalValue);                                                      // 10;06;22
	  
	  
       int finalValue1 = add(67,65 ,90);                                                // Method over loading    
	   System.out.println(finalValue1);                                             
   }                                                                                  // 1 number of parameter
                                                                                      // 2 type of parameter
     public static int add(int a,int b)
	{
     return a+b;
    }
     public static int add(int a , int b , int c)
	{
		 
	 return a+b+c;
	}
	
  }