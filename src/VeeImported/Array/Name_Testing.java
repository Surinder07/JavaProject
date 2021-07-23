package VeeImported.Array;

import java.util.Scanner;

public class Name_Testing 
{
	public static void main(String[] args) throws Exception
	
	{
		String name;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name:");
		name=s.nextLine();
		
		char ch[]=name.toCharArray();
	
		int i;
		
		
		for(i=0;i<name.length();i++)
		{	
			
			System.out.print(ch[i]);
		
		}
	
	}
}
