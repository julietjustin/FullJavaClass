package encapsulation1;

public class SetPin {
	//bank
		private int pin;
		public void setterPin(int pin) {
			this.pin=pin;
		}
		public void getter() {
			System.out.println("User Pin Number is:"+pin);
		}
		public void valid() {
			switch (pin)		
			{
				case 1001 : System.out.println("User Pin Is Valid,Please Enter The Amount To Withdraw");
		                   break;		   
				case 1234 : System.out.println("User Pin Is Valid,Please Enter The Amount To Withdraw");
		                   break;
				case 1212 : System.out.println("User Pin Is Valid,Please Enter The Amount To Withdraw");
		                   break;
				default  : System.out.println("Not A Valid Pin,Please Try Again Later");
					       break;
				
			
			}
		}

}
