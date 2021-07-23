package VeeImported.OOPS;

class BMath
{
	public static int sub(int x, int y)
	{
		return x-y;
	}
	public static float sub(float x, float y)
	{
		return x-y;
	}
}
public class Subtraction {
	public static void main(String[] args) {
		System.out.println("sub     "+BMath.sub(154, 54));
		System.out.println("sub     "+BMath.sub(154.34f, 54.36f));	
	}

}
