package exception;

public class ThrowAndThrowExample {
	public void vote(int age) throws InterruptedException {
		if(age>=18) {
			System.out.println("Eligible To Vote");
			Thread.sleep(2000);//giving waiting period
			System.out.println("After Sleep");
			
		}
		else {//custom made messages mainly used in negative conditions,user can make it as exception using the throw keyword
			throw new ArithmeticException("Not Eligible For Voting");
		}
	
	}

	public static void main(String[] args) throws InterruptedException {
		ThrowAndThrowExample obj=new ThrowAndThrowExample();
		obj.vote(44);

	}

}
