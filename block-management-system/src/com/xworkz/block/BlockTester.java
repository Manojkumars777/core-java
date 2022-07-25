package com.xworkz.block;

public class BlockTester {
	
	public BlockTester() {
		System.out.println(this.getClass().getSimpleName()+ "object is created");
	}
	
	  int blockInit;                          /* 1st static block will execute next inside main method after object
	                                              creating instance block will execute*/
	{
		System.out.println("block is executed");
		blockInit = 10;
	}
	
	static int blockInit1;
	static{
		System.out.println("static block is executed");
		blockInit1 = 15;
	}
	
	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Block blocktester = new Block();
		BlockTester blocktester1 = new BlockTester();
	
		
		//System.out.println(blocktester1.blockInit);
	    System.out.println(blocktester1.blockInit1);
		
		System.out.println("Main method ended");
	}

}
