package VeeImported.OOPS;

import java.util.Scanner;

class Point
{
	private int x;
	private int y;
	
	public void insert_Record()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter  X    : ");
		x = scanner.nextInt();
		
		System.out.println("Enter  Y    : ");
		y = scanner.nextInt();
	}
	public void show_Record()
	{
		System.out.println("X          : "+x);
		System.out.println("Y          : "+y);
		
	}
}
public class PointTesting 
{	
	public static void main(String[] args)
	{
		
		Point p = new Point();
		
		p.insert_Record();
		p.show_Record();		
	}

}
