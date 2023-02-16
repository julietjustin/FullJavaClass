package exception;

public class CustomException extends Exception {
	public void voting (int age) throws CustomException {
		if(age>=18) {
			System.out.println("Eligible To Vote");
		}
		else {
			//System.out.println("Not Eligible To Vote");
			throw new CustomException("Not Eligible For Voting");
		}
		
		
	}
	public CustomException() {
		super();
		
	}
	public CustomException(String s) {
		super(s);
		
	}

	public static void main(String[] args) throws CustomException {
		CustomException obj=new CustomException();
		obj.voting(17);
		

	}

}
