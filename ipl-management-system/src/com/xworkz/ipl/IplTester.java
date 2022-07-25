package com.xworkz.ipl;

import com.xworkz.ipl.dto.IplDTO;

public class IplTester {
	
	public static void main(String a[]){
		IplDTO ipl = new IplDTO();
		    ipl.setFounder("BCCI");
			ipl.setNumberOfTeams(10);
			ipl.setRecentCamp("Gujarath--Titans");
			
			//ipl.habba();
	  System.out.println(ipl.getFounder()+" / "+ipl.getNumberOfTeams()+"/ "+ipl.getRecentCamp());
	  
	}
	
}


