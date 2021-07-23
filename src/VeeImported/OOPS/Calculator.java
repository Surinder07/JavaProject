package VeeImported.OOPS;

import java.util.Scanner;

class calci
{
	private float a;
	private float b;
	private float c;
	private  int choice;
	
	
	Scanner scanner =new Scanner(System.in);
	public void setdata()
	{
		
	

		
 
       System.out.println("1.Addition");
       System.out.println("2.Subtraction");
       System.out.println("3.Multiplication");
       System.out.println("4.Division");
      
       System.out.println("enter choice ");
       choice=scanner.nextInt();
	}
       public void value()
       {

    		
		
		System.out.println("enter the value of a=");
		a=scanner.nextFloat();
		System.out.println("enter the value of b=");
        b=scanner.nextFloat();
       
	
		if(choice==1)
		{
			c=a+b;
		
		}
	
	else if(choice==2)
	{
		c=a-b;
	}
	else if(choice==3)
	{
		c=a*b;
	}
	else if(choice==4)
	{
		c=a/b;
	}
	
       }
		
public void showdata()
{
System.out.println("c  ="+c);	

}
}
public class Calculator 
{
	public static void main(String[] args) 
	{
	System.out.println(" CALCULATOR MENU");
		calci c= new calci();
		
		c.setdata();
		c.value();
		c.showdata();
		
	}

}
	
