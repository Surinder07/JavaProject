package VeeImported.OOPS;

class CMath
{
	public static int sum(int x , int y)	
	{
		return x+y;
	}
	 public static float sum(float x, float y)
	{
		return x+y;
	}	
}
public class MathTesting 
{
	public static void main(String[] args) 
	{
		System.out.println("Sum     : "+CMath.sum(5,5));
		System.out.println("Sum     : "+CMath.sum(5.1f,5.1f));
	}
}

/*
 *    
 *    void date(int ,int ,int)
 *    void date(String ,int ,int)
 *    void date(String ,String,int)
 * 
 *    void time(int,int)
 *    void time(int,int,int)
 *    void time(int,int,int,String); 
 * 
 */
 