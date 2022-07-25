package com.xworkz.carrybag;

import com.xworkz.carrybag.dto.CarryBagDTO;

public class CarryBagTester {
	
	
	public static void main(String me[]){
		CarryBagDTO bag = new CarryBagDTO();
		            bag.setName("Zepto Bags");
		            bag.setPrice(6.00);
		
		
		System.out.println(bag.getName() + "/" + bag.getPrice());
		
		
	}

}
