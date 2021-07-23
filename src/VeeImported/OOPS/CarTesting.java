package VeeImported.OOPS;

class MRF
{
	public void normal()
	{
		System.out.println("Normal Types");
	}
	
	public void radial()
	{
		System.out.println("Radial Tyres");
	}
	
	
	public void tubeless()
	{
		
		System.out.println("Tubeless Tyres");
	}
}


class Maruti
{
	private String engine = "1400 CC";
	private String bhp = "120 BHP";
	
	private MRF mrfTyres = new MRF();	
	
	
	public void showengine()
	{
		System.out.println("Engine   " + engine);
	}
	
	
	public void showBhp()
	{
		System.out.println("Power : " + bhp);
	}
	
	
	public void showCarDetail()
	{
		
		showengine();
		showBhp();
		mrfTyres.tubeless();
	}
	
	
}


public class CarTesting {

	public static void main(String[] args) {
		
		
		
		Maruti maruti  = new Maruti();
		maruti.showCarDetail();
		
		
	}
	
}
