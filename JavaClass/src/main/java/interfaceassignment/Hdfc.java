package interfaceassignment;

public class Hdfc implements Rbi{
	double depositedamount=500000;
	int duration=5;
	double amount,simpleinterest;
	public void recurringDeposit() {
		System.out.println("The Principal Amount is:"+depositedamount);
		System.out.println("Duration is:"+duration);
		simpleinterest=(depositedamount*interestrate*duration)/100;
		amount=depositedamount+simpleinterest;
	}
	public void interest() {
		System.out.println("The Interest Rate is:"+interestrate);
		System.out.println("The Interest Credited For The Period is:"+simpleinterest);
		System.out.println("The Total Amount With Interest For A Period Of Time is:"+amount);
	}

	public static void main(String[] args) {
		Hdfc obj=new Hdfc();
		obj.recurringDeposit();
		obj.interest();

	}


}
