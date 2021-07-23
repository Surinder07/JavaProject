package VeeImported.OOPS;

class Date
{
	private int date; // 0 
	private int month;  // 0
	private int year; // 0
	
	
	// if this is c++  any random value
	// 100/4500/3000
	
	public Date()  // default constructor no argument. 
	{
		date  = 1;
		month = 1;
		year = 2001;
	}
	
	// local variables / parameters.
	// this operator cannot be used with parameters.
	// parameterized constructor.
	public Date(int date , int  month , int year)
	{
		this.date   = date;
		this.month  = month;
		this.year   = year;
		// this operator use wid instance variable.
	}
	
	
	
	public void showDate()
	{
		//int date=40;
		System.out.println("Date : " + 
	this.date + "/" + this.month +"/"+this.year);
	}
	
}

public class DateTesting 
{

	public static void main(String[] args)
	{
		
		Date date = new Date();
			date.showDate();
		
		
		Date date1 = new Date(21,7,2015);

		date1.showDate();
				
			
	/*
	 * 
	 * when new operator allocate new memory
	 * to the object at that time constructor
	 * will call and automatically initialize the class
	 * data members .
	 */
			
			
			
		
	}
	
}
