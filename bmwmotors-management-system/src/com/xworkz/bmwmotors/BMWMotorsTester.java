package com.xworkz.bmwmotors;
import java.util.Scanner;
public class BMWMotorsTester {
	
	public static void main(String a[]) {
		
		Scanner sc = new Scanner(System.in);
		
		BMWMotors bmw = new BMWMotors();
		BMWMotors1 bb = new BMWMotors1();
		
		System.out.print("Enter the ID : ");
		int id=sc.nextInt();
		System.out.print("Enter the founder Name :");
		String founderName=sc.next();
		System.out.print("Founded in : ");
		int foundedIn=sc.nextInt();
		System.out.print("Recent model : ");
		int recentModel=sc.nextInt();
		System.out.print("Enter horse power : ");
		String horsePower=sc.next();
		System.out.print("Enter oil type : ");
		String oilType=sc.next();
		System.out.print("Enter mailage : ");
		String mailage=sc.next();
		System.out.print("Enter features : ");
		String features=sc.next();
		System.out.print("Enter cost : ");
		int cost=sc.nextInt();
		System.out.print("Manager Num : ");
		long manegerNum=sc.nextLong();
		
		bmw.setId(id);
		bmw.setFounderName(founderName);
		bmw.setFoundedIn(foundedIn);
		bmw.setRecentModel(recentModel);
		bmw.setHorePower(horsePower);
		bmw.setOilType(oilType);
		bmw.setMailage(mailage);
		bmw.setFeatures(features);
		bmw.setCost(cost);
		bmw.setManegerNum(manegerNum);
		
		System.out.println(bmw);
		
		bb.move();
		bb.sportsMode();
		bb.interior();
		bb.normalMode();
		
		
		
		
		
		
		
		
		
	}
	

}
