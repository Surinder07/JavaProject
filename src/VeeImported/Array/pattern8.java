package VeeImported.Array;

import java.util.Scanner;


public class pattern8 {
public static void main(String[] args) {
	String name;
	int i;
	Scanner inp=new Scanner(System.in);
	System.out.println("enter name	:");
	name=inp.nextLine();
	char name1[]=name.toCharArray();
	if(name.toUpperCase()==inp.nextLine())
	{
		for(i=0;i<name.length();i++)
	
	{
		if(i==0)
		{
			name1[i]=(char) (name1[i]-32);
		}
		if(name1[i]==' ')
		{
			name1[i+1]=(char) (name1[i+1]-32);
		}
		
		System.out.print(name1[i]);
	}}
	else{
	for(i=0;i<name.length();i++)
	{
		if(i!=0&&i!=' ')
		{
			name1[i]=(char) (name1[i]+32);
		}
		if(name1[i]==' ')
		{
			name1[i+1]=(char) (name1[i+1]+32);
		}
		
		System.out.print(name1[i]);
	}}
}
}
