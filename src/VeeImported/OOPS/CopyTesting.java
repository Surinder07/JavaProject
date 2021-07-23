package VeeImported.OOPS;

class Copy
{
	private int x;
	private int y;
	
	public Copy()
	{
		this.x = 2;
		this.y = 1;
	}
	public Copy(Copy c)
	{
		this.x = c.x;
		this.y = c.y;
	}
	public void show()
	{
		System.out.println("X      : "+x);
		System.out.println("Y      : "+y);
	}
}
public class CopyTesting 
{
	public static void main(String[] args) 
	{
		Copy c = new Copy();
		Copy c1 = new Copy(c);		
	
		c.show();
		
		System.out.println();

		c1.show();
		
		System.out.println();
		
		
	}
}
