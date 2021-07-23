package VeeImported.OOPS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BankDet {

	private final static String BANKNAME = "State Bank Of Patiala";
	private final static String ADDRESS = "1616 Phase 7";
	private final static String CITY = "Mohali";

	int empId;
	String empName;
	
	private static BufferedReader buf = new BufferedReader
			(new InputStreamReader(System.in));
	
	
	
	public void showDetail()
	{
		
		
		try
		{
		
		System.out.println(BANKNAME);
		System.out.println(ADDRESS);
		System.out.println(CITY);
		
			
			// 1212 int 1212
			// 12,2 this is numberformatexception.... 
		System.out.println("Id : ");
		empId= Integer.parseInt(buf.readLine());
		
		
		System.out.println("Name : ");
		empName = buf.readLine();
		
		
		
		
		
		}
		catch(NumberFormatException exception)
		{
			exception.printStackTrace();
		}
		
		catch(IOException exception)
		{
			exception.printStackTrace();
		}
		
		catch(Exception exception)
		{
			exception.printStackTrace();
			
		}
		
		
	}
		
		public int sum(int x,int y)
		{
			return x+y;
		}

		
		public int div(int x,int y)
		{
			return x/y;
		}
	
	public static void main(String[] args)
	{
		
	
	BankDet bankDet = null;
	
	
	try
	{
			bankDet = new BankDet();
			bankDet.showDetail();
	}
	catch(NullPointerException exception)
	{
		
		System.out.println(exception);
		System.out.println(exception.getMessage());
		exception.printStackTrace();
	}
	

	System.out.println("Sum Of Two : " + bankDet.sum(2,2));
	
	
	try
	{
	
		System.out.println("X : ");
		int x = Integer.parseInt(buf.readLine());
		
		System.out.println("Y : ");
		int y = Integer.parseInt(buf.readLine());
		
	
System.out.println("Div Of Two : " + bankDet.div(x,y));

	
	}
	catch(ArithmeticException exception)
	{
		exception.printStackTrace();
	}

	catch(Exception exception)
	{
		exception.printStackTrace();
	}
		
	
	
	}
	
}
