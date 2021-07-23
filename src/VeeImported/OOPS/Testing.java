package VeeImported.OOPS;

class Point1
{
	private int x;
	private int y;

	public Point1() // Default Const
	{
		this.x = 1;
		this.y = 1;
	}
	public Point1(int x, int y) // parameterized const
	{
		this.x = x;
		this.y = y;

	}
	public void show()
	{
		System.out.println("X        : "+this.x);
		System.out.println("Y        : "+this.y);		
	}	
}


public class Testing 
{
	public static void main(String[] args) 
	{
		Point1 p = new Point1();
		Point1 p1 = new Point1(43,3);
		
		p.show();
				
		System.out.println();
		
		p1.show();
	}
}
 