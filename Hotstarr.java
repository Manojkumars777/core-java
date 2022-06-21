class Hotstarr
 {

static String kannadaMovies[] = { "Milana","Jocky","Vamshi","Yarekugadali","Thamasu","Zindagi","Bhanamati","Arakshaka","Drishya","Chaitra","Kavacha","Kaali","Charli","Machha","Bhahaddur"};
static String hindhiMovies[] = {"Chhichhore","Bhaag Milaka Bhagg","Drishyam","Manasa","Pink","Maqbool","Baby","Badhaai Ho","Super","My Name is Khan","Ankhon Dekhi","Sanju","Lootcase","Neerja","Stree"};
static String telguMovies[] = {"Orange","Uyyala Jampala","Prati Roju Pandage","Meeku Matrame Chepta","Karma","Anand","Okkadunnadu","Kanche","Dollar Dreams","Gaddalakonda","A Film by Aravind","Bhahubali","Alludu","Bhale Bhale Magadivoy","RRR"};
static String series[]  = {"Atrangi Re","Bhoot police","Shiddat","A Thursday","Bhuj The pride of india","Hum Do Hamare Do","The Big Bull","Hungama2","The Martian","Dil Bechara","Anbarivu",};

public static void main(String a [])
{
	System.out.println("Hotstar kannada movies ========");
	for(int i=0; i < kannadaMovies.length; i++)
	{
	System.out.println(kannadaMovies[i]);
    }
	
	
	System.out.println("Hotstar Hindhi Movies =========");
	for(int i=0; i<telguMovies.length; i++)
	{
    System.out.println(telguMovies[i]);
    }
	
	System.out.println("Hotstar Telgu Movies ==========");
	for(int i=0; i<telguMovies.length; i++)
	{
    System.out.println(telguMovies[i]);
	}
	
	System.out.println("Hotstar series ===========");
	for(int i=0; i<series.length; i++)
	{
	System.out.println(series[i]);
	}
	
}
}