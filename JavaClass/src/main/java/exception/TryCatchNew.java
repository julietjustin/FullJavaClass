package exception;

public class TryCatchNew {
	int a=10,b=5;
	public void add()
	{
		int c=a+b;
		System.out.println("Sum= "+c);
	}

	public void sub()
	{
		int c=a-b;
		System.out.println("Subtraction= "+c);
	}
	
	public void div()
	{
		int c=a/b;
		System.out.println("Division= "+c);
		try {
		System.out.println(a/0);
		}
		catch(Exception ae)
		{
			System.out.println(ae.getMessage());
			System.out.println(ae);
			 ae.printStackTrace();
		}
		finally
		{
			System.out.println("Must Excecute");
		}
	}

	public static void main(String[] args) {
		TryCatchNew ob=new TryCatchNew();
		ob.add();
		ob.sub();
		ob.div();
		

	}

}
