class Library{                                                                                  

           int iD;
		   String libraryName;
		   String typeOfLib;                                                                                            /// Assignment
    static String availablesBooks = "All types of study books are available";
		   String location;
		   long conNum;
		   
	public Library(int ID , String NameofLibrary , String LibType , String Address , long MobileNum){
	   System.out.println("Library object created ...............");
	   
	   iD = ID;
	   libraryName = NameofLibrary;
	   typeOfLib = LibType;
	   location = Address;
	   conNum = MobileNum;
	 }
	 
	 
	public static void main( String a[]){
		Library lib = new Library(25 , "Kala kesari Udayakumar Library" , "Acadamic" , "Rajaji nagara Dr rajkumar road , Bangalore" , 8767453627L);
		System.out.println(lib.iD + " " + lib.libraryName + " " + lib.typeOfLib + " " + lib.location + " " + lib.conNum);
		System.out.println("Available books in Library are " + " " + availablesBooks);
		
		System.out.println("============================================================================================");
		
		Library lib1 = new Library(26 , "Manasare Library" , "Public" , "Halsur lake road Halsur , Bangalore" , 9934666666L);
		System.out.println(lib1.iD + " " + lib1.libraryName + " " + lib1.typeOfLib + " " + lib1.location + " " + lib1.conNum);
		System.out.println("Available books in Library are " + " " + availablesBooks);
		
		System.out.println("============================================================================================");
		
		Library lib2 = new Library(27 , "K S R  Library" , "Special" , "vijaya nagar , Bangalore" , 7777777777L);
		System.out.println(lib2.iD + " " + lib2.libraryName + " " + lib2.typeOfLib + " " + lib2.location + " " + lib2.conNum);
		System.out.println("Available books in Library are " + " " + availablesBooks);
		
		System.out.println("============================================================================================");
		
		Library lib3 = new Library(25 , "Manu Library" , "Private" , "Dollar's coloney , Bangalore" , 8877887788L);
		System.out.println(lib3.iD + " " + lib3.libraryName + " " + lib3.typeOfLib + " " + lib3.location + " " + lib3.conNum);
		System.out.println("Available books in Library are " + " " + availablesBooks);
		
	}

}