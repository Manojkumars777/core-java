package com.xworkz.games;

import java.util.Scanner;

import com.xworkz.games.dto.GamesDTO;

public class GamesTester {
	
	public static void main(String a[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Game name : ");
		String name = sc.next();
		System.out.println("Enter the game version : ");
		String version = sc.next();
		System.out.println("Enter the size of game : ");
		String size = sc.next();
		
		
		
		GamesDTO play = new GamesDTO();
		      play.setName(name);
			  play.setVersion(version);
			  play.setSize(size);
			  
			
			  
	 System.out.println(play);
	 
	 sc.close();
	}
	

}
