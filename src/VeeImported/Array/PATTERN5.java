package VeeImported.Array;

import java.util.Scanner;


public class PATTERN5 {
	public static void main(String[] args) throws Exception {
		String name;
		int i,count=0;
		Scanner inp=new Scanner(System.in);
		System.out.println("enter name	:");
		name=inp.nextLine();
		char name1[]=name.toCharArray();
		for(i=0;i<name.length();i++)
		{
			
			count++;
		}
		System.out.println(count);
	}

}
