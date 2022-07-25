package com.xworkz.Container;

import com.xworkz.Container.dto.ContainerDTO;

public class ContainerTester {
	
	public static void main(String a[]){
		  ContainerDTO box = new ContainerDTO();
		               box.setName("A1");
					   box.setTypeOfContainer("Plastic");
					   box.setCost(1500);
					   box.setColor("Blue");
					   box.setCapacity("1000ml");
					
	    System.out.println(box.getName() + " " + box.getTypeOfContainer() + " " + box.getCost() + " " + box.getColor() + " " + box.getCapacity());
	  }

}
