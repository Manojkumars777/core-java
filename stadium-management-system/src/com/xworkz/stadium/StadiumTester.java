package com.xworkz.stadium;

import com.xworkz.stadium.dto.StadiumDTO;

public class StadiumTester {
	
	public static void main(String me[]){
		StadiumDTO crazy = new StadiumDTO();
		        crazy.setName("Kanteerava Stadium");
				crazy.setLocation("Palace ground road Bangalore");
				crazy.setCapacity(5500);
				crazy.setType("Indore");
				
				
				
		System.out.println(crazy.getName()+" / "+ crazy.getLocation()+" / "+ crazy.getCapacity()+" / "+ crazy.getType());
	}
}


