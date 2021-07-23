package VeeImported.OOPS;

class Company
{
	private String name = "Vee Logic";
	
	public void showName()
	{
		System.out.println("Name : " + name);
		
	}
}



public class Com {

	public static void main(String[] args) {
		
		
		
		Company company = new Company();
		Company company2  = company;
		Company company3  = company;
		Company company4  = company;
		Company company5  = company;
		
		
		company.showName();
		company2.showName();
		company3.showName();
		company4.showName();
		company5.showName();
		
		
		
	}
	
}
