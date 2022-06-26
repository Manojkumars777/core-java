class CricketPlayerTester
{
	public static void main(String a[])
	{
		MsDhoni legend = new MsDhoni();
		        legend.born = "7 july 1981,Ranchi,Bhihar,India";
				legend.nickName = "Mahi,Thala,Captain cool";
				legend.height = "5 ft 11 inch";
				legend.role = "WC & Batsman";
				legend.battingStyle = "Right handed Batsman";
				legend.debtYear = 2004;
				
				legend.maGuru();
				
		System.out.println("The birth palce of Dhoni is "+legend.born + " nick names are " + legend.nickName + "and height " + legend.height);
		System.out.println("Dhoni roles are "+ legend.role + " and batting style "+ legend.battingStyle + " debt year " + legend.debtYear);
	}
}

