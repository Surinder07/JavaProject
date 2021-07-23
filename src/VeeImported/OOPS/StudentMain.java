package VeeImported.OOPS;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Student
{
	private int id;
	private String name;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
}


public class StudentMain {

	public static void main(String[] args) {
		
		
		Student student[] = new Student[3];
	
		BufferedReader buf  = new BufferedReader
				(new InputStreamReader(System.in));
		
	int id;
	String name;
		int x;
int idcounter=100;		
	
for(x=0; x<2; x++)
{
	
	
	
	try
	{
	
	//System.out.println("Id : " + idcounter++);
		
	System.out.println("Id : ");
	id = Integer.parseInt(buf.readLine());
	
	System.out.println("Name  : ");
	name = buf.readLine();
	
	
	student[x] = new Student();
	
	student[x].setId(id);
	student[x].setName(name);
	
	
	
	
	
	}
	
	catch(NullPointerException exception)
	{
		exception.printStackTrace();
	}
	
	
	catch(Exception exception)
	{
		exception.printStackTrace();
	}
}


	for(x=0; x<2; x++)
	{
		System.out.println("Id : " + student[x].getId());
		
		System.out.println("Name  : " + student[x].getName());
	}	
		
		
	}
	
}
