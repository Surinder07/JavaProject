package VeeImported.Array;

import java.util.Scanner;


 

public class Search_Character 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner s = new Scanner(System.in);
		String name;
		int i;
		char search;
		boolean flag = false;
		
		System.out.println("Enter The Name");
		name=s.nextLine();
		
		char ch[]=name.toCharArray();
		
	
		System.out.println("Enter The Character you want to search");
		search=(char)(System.in.read());
		for(i=0;i<name.length();i++)
		{
			if(search==ch[i])
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println(search+" character is present in the string ");
		}
		else 
		{
			System.out.println(search+" character is not present in the string ");
			
		}
	}
}
