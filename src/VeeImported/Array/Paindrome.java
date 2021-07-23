package VeeImported.Array;

import java.util.Scanner;


public class Paindrome 
{
	public static void main(String[] args) 
	{
		
		String name;
		String reverse="";
		Scanner s = new Scanner(System.in);
		int i;
		
		
		System.out.println("Enter The name");
		name=s.nextLine(); 
		
		for(i=name.length()-1;i>=0;i--)
		{
			reverse=reverse+name.charAt(i);
		}
		
		if(name.equals(reverse))
		{
			System.out.println(name +" is palindrome");
		}
		else
		{
			System.out.println(name +" is not palindrome");
					
		}
		
		
	}
}
