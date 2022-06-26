class ModeOfTransportTester
{
	public static void main(String a[])
	 {
		 Train train = new Train();
		       train.route = "Chennai to Mangalore";
			   train.sbcArrival = "14:30";
			   train.sbcDeparture = "14:40";
			   train.seatingCapacity = 3500;
			   
			   train.getModeOfTransport();
			   
	    System.out.println("Train route = " + train.route);
		System.out.println("SBC arrival @ = " + train.sbcArrival);
	    System.out.println("SBC departure @ = " + train.sbcDeparture);
	    System.out.println("Seating capacity of train = " + train.seatingCapacity);
	 }
}