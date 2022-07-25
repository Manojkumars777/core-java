package com.xworkz.bigbasket;

import com.xworkz.bigbasket.dto.BigBasketDTO;

public class BigBasketTester {
	
public static void main(String a[]){
		
		BigBasketDTO bab = new BigBasketDTO();
		          bab.setOwnedBy("Tata PTD Limited");
		          bab.setType("Online and offline");
		          bab.setStartedIn(2015);
		          bab.setOrigin("Mumbai");
		
		          //bab.bigbas();
		
		
		System.out.println(bab.getOwnedBy()+" / "+bab.getType()+" / "+bab.getStartedIn()+" / "+bab.getOrigin());
		
	}

}
