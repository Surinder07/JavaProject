package VeeImported.Array;

import java.util.Scanner;


public class pattern7 {
	public static void main(String[] args) throws Exception {
		String name;
		int i,count=0;
		Scanner inp=new Scanner(System.in);
		System.out.println("enter name	:");
		name=inp.nextLine();
		char name1[]=name.toCharArray();
		for(i=0;i<name.length();i++)
		{
			if(name1[i]=='a'||name1[i]=='e'||name1[i]=='i'||name1[i]=='o'||name1[i]=='u')
			{
				count++;
			}
			 
				
		}
		System.out.print(count);
	}
}
