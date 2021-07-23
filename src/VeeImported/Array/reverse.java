package VeeImported.Array;

import java.util.Scanner;


public class reverse {
	public static void main(String[] args) throws Exception 
	{
		String name;
		int i;
		Scanner inp=new Scanner(System.in);
		System.out.println("enter name	:");
		name=inp.nextLine();
		
		char name1[]=name.toCharArray();
		
		for(i=name1.length-1;i>=0;i--)
		{
			
			System.out.print(name1[i]);
		}
		/*for	(i=name.length();i>0;i--)
		{
			name2[i]=name1[i];
		}
		for(i=0;i<name.length();i++)
		{
			System.out.print(name2[i]);
		}*/
	}

}
