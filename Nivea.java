class Nivea
{
         String brandName;                       
         String itemForm;                        
         String usedFor;                         
         String specialIngredients;            
         int cost;
		 
		 
		 public Nivea()
		 {
			 System.out.println(" Nivea object is created ");
		 }
		 
		 public Nivea(String brandName,String itemForm,String usedFor,String specialIngredients,int cost)
		 {
			 this();
			    this.brandName = brandName;
				this.itemForm = itemForm;
				this.usedFor = usedFor;
				this.specialIngredients = specialIngredients;
				this.cost = cost;
		 }
		 
		 public static void main(String a[])
		 {
            Nivea nivea = new Nivea("Nivea","Cream","Face","Coconut oil",900);
			System.out.println(" Cream brand name is " + nivea.brandName + " it is in the form of " + nivea.itemForm + " and used for " + nivea.usedFor 
			+ " it contains " + nivea.specialIngredients + " it costs " + nivea.cost);
		 }














}