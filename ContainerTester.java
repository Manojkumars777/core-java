
class ContainerTester{
	
  public static void main(String a[]){
	  Container box = new Container();
	            box.setName("A1");
				box.setTypeOfContainer("Plastic");
				box.setCost(1500);
				box.setColor("Blue");
				box.setCapacity("1000ml");
				
				box.storage();
    System.out.println(box.getName() + " " + box.getTypeOfContainer() + " " + box.getCost() + " " + box.getColor() + " " + box.getCapacity());
  }	
	
	
	
	
	
}