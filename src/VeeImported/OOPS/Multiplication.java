package VeeImported.OOPS;

class MMath
{
	public static int multi(int x, int y)
	{
		return x*y;
	}
	public static float multi(float x,float y)
	{
		return x*y;
	}
}
public class Multiplication {
	public static void main(String[] args) {
		
		System.out.println("multi  " +MMath.multi(5,6));
		System.out.println("multi  " +MMath.multi(5.5f,6.51f));
	}

}
