package exception;

public class NestedTryCatch {
	int a=8,b=2;
	public void divide() {
		int div1=a/b;
		System.out.println("First Division Is:"+div1);
		//try {
			try {
			System.out.println(a/0);
			}
		catch(ArithmeticException ae1)
		{
			System.out.println(ae1.getMessage());
			System.out.println(ae1);
			 ae1.printStackTrace();
		}
			
	}

	public static void main(String[] args) {
		NestedTryCatch obj=new NestedTryCatch();
		obj.divide();

	}

}
