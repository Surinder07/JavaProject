package VeeImported.OOPS;

import java.util.Scanner;

class Area
{
	private float r;
	private float area;
	private float pie=3.14f;
	
	public void setdata()
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the value of r =");
		r=scanner.nextFloat(); 
		
		area=pie*r*r;

	
	}
	public void showdata()
	{
		System.out.println("r   ="+r);
		System.out.println("area ="+area);
	}
}

public class AreaOfCircle {
	public static void main(String[] args) 
	{
		Area a = new Area();
		a.setdata();
		a.showdata();
	}

}
