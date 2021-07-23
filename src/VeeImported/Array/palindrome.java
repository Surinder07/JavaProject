package VeeImported.Array;

import java.util.Scanner;


public class palindrome {
	public static void main(String[] args) throws Exception {
		String name;
		int i,j,flag=0;
		
		Scanner inp=new Scanner(System.in);
		
		System.out.println("enter name	:");
		name=inp.nextLine();
		
		
		char name1[]=name.toCharArray();
		
		
		for(i=0;i<name1.length;i++);
		
			for(j=0;j<name1.length;j++)
			{
				i--;
		     	
				if(name1[i]==name1[j])
		     	{
		     		flag=0;
		     		continue;
		     		
		     	}
			else
			{
				flag=1;
				break;
		     	
			}
		}
		if(flag==0)
		{
			System.out.println(" is palindrome");
		}
		else
		{
			System.out.println(" is not palindrome");
		}
		}

}
