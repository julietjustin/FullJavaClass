package exception;

public class NestedTryCatchExample {
	public static void main(String[] args) {
		int a= 10, b=5;
		try {
			//int result = a/b;
			int result = Integer.parseInt(null);  /*executes the first try block, it encounters a NumberFormatException 
																and executes the corresponding main catch block. 
																Since the parent try block contains an exception, it does not execute the inner try block. 
																This is the reason that it did not print the ArithmeticException statement of the inner try block.*/
			System.out.println("Result: " + result);
		try {
	        b = 0;
	        int result1 = a/b;
	        System.out.println("Result: " + result1);
	      }
	      catch(ArrayIndexOutOfBoundsException e) {
	        System.out.println("Exception: " + e.getMessage());
	      }
		}
		catch(ArithmeticException e) {
		      System.out.println("Exception: " + e.getMessage());
		    }
		catch(NumberFormatException e) {
		      System.out.println("Exception: Number format exception");
		    }
	}

}
