package encapsulation1;

public class NewTest {
	private int balance;
	private String name;
	public void bank(int balance,String name) {
		this.balance=balance;
		this.name=name;
	}
	public void getterBank() {
		System.out.println(name);
		System.out.println(balance);
		
	}

}
