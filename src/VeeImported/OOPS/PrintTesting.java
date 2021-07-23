package VeeImported.OOPS;

class PrintDemo
{
	
	public void print(int x)
	{
		System.out.println("X       : "+x);		
	}
	public void print(char letter)
	{
		System.out.println("Letter  : "+letter);
			
	}
	public void print(String name)
	{
		System.out.println("Name    : "+name);
	}
}

public class PrintTesting 
{
	public static void main(String[] args) 
	{
		PrintDemo pd = new PrintDemo();
		
		pd.print(5646);
		pd.print("Java");
		pd.print('a');
	
	}
}
