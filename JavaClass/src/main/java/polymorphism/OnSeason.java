package polymorphism;

public class OnSeason {
	double rate=5000;
	public void discount(){
		System.out.println("The Total price:"+rate);
		double discountprice=rate-(0.40*rate);
		System.out.println("The Total Amount To Pay After OnSeason Discount:"+discountprice);
	}

}
