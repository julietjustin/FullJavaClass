package encapsulation2;

import encapsulation1.SetPin;

public class BankGetPin {
	public static void main(String[] args) {
		SetPin obj=new SetPin();
		obj.setterPin(1567);
		obj.getter();
		obj.valid();
	}

}
