package VeeImported.Array;

import java.util.Scanner;


public class pattern6 {
	public static void main(String[] args) throws Exception {
		String name;
		int i;
		Scanner inp=new Scanner(System.in);
		System.out.println("enter name	:");
		name=inp.nextLine();
		char name1[]=name.toCharArray();
		for(i=0;i<name.length();i++)
		{
			if(i%2==0)
			{
				name1[i]=(char) (name1[i]-32);
			}
			System.out.print(name1[i]);	
		}
		
	}
}
