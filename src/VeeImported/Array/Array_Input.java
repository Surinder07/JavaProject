package VeeImported.Array;

import java.util.Scanner;


public class Array_Input 
{
	public static void main(String[] args) 
	{
		final int SIZE=10;
		int a[]= new  int [SIZE];
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the element in an array");
		for(i=0;i<SIZE;i++)
		{
			a[i]=scanner.nextInt();
		}

		System.out.println("Elements in an array are  ");
		
		
		for(i=0;i<SIZE;i++)
		{
			System.out.println(a[i]);
		}

	}
}
