package VeeImported.Array;

import java.util.Scanner;


public class Initcap 
{
	public static void main(String[] args) throws Exception 
	{
		
		Scanner s = new Scanner(System.in);
		int i;
		String name;
	
		System.out.println("Enter the name");
		name=s.nextLine();
		
	
		//System.out.println("Upper Case"+name.toUpperCase());
		
		
		
		char ch[]=name.toCharArray();
		
		
		if(ch[0]>='a' && ch[0]<='z')
		{
			ch[0]=(char) (ch[0]-32);
			System.out.print(ch[0]);
		}
		else
		{
			System.out.print(ch[0]);
		}
		
		
		for(i=1;i<name.length();i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
			}
			System.out.print(ch[i]);
			Thread.sleep(200);
		}
		}
	}

