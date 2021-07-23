package VeeImported.OOPS;

class STesting
{
	private static int counter;
	
	public static int getCounter()
	{
		return ++counter;
	}
}


class NonSTesting
{
	private int counter;
	
	public int getCounter()
	{
		return ++counter;
	}
}



public class StaticTesting {

	
	public static void main(String[] args) {
		
		
	System.out.println("Counter : " +  STesting.getCounter());	
	System.out.println("Counter : " +  STesting.getCounter());	
	System.out.println("Counter : " +  STesting.getCounter());	
	System.out.println("Counter : " +  STesting.getCounter());	
	System.out.println("Counter : " +  STesting.getCounter());	
	System.out.println("Counter : " +  STesting.getCounter());	
		
	
	
	NonSTesting nonSTesting1 = new NonSTesting();
	NonSTesting nonSTesting2 = new NonSTesting();
	NonSTesting nonSTesting3 = new NonSTesting();
	NonSTesting nonSTesting4 = new NonSTesting();
	
	System.out.println("\n\n");
	
	
	System.out.println("Counter : " + nonSTesting1.getCounter());
	System.out.println("Counter : " + nonSTesting2.getCounter());
	System.out.println("Counter : " + nonSTesting3.getCounter());
	System.out.println("Counter : " + nonSTesting4.getCounter());
	
	
	
	}
	
}
