package com.xworkz.weapons;

import com.xworkz.weapons.dto.WeaponsDTO;

public class WeaponsTester {
	
	public static void main(String a[]){
		WeaponsDTO safety = new WeaponsDTO();
		        safety.setName("GL0007");
				safety.setType("Machien--Gun");
				safety.setBullets(350);
				
				//safety.safety();
		System.out.println(safety.getName()+" / "+safety.getType()+" / "+safety.getBullets());
	}

}
