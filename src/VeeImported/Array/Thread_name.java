package VeeImported.Array;

import java.util.Scanner;


public class Thread_name {
public static void main(String[] args) throws Exception {
	String name;
	int i;
	Scanner inp=new Scanner(System.in);
	System.out.println("enter name	:");
	name=inp.nextLine();
	char name1[]=name.toCharArray();
	for(i=0;i<name.length();i++)
	{
		System.out.print(name1[i]);
		Thread.sleep(200);
	}
	
}
}
