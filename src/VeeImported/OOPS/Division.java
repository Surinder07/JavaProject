package VeeImported.OOPS;

class DMath
{
	public static int div(int x,int y)
	{
		return x/y;
	}
	public static float div(float x, float y)
	{
		return x/y;
	}
}
public class Division {
	public static void main(String[] args) {
		
		System.out.println("Div "+DMath.div(15, 5));
		System.out.println("Div "+DMath.div(15.5f, 5.5f));
		
	}

}
