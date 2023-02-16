package polymorphism;

public class OffSeason extends OnSeason {
	public void discount(){
		super.discount();
		double discountprice=rate-(0.15*rate);
		System.out.println("The Total Amount To Pay After OffSeason Discount:"+discountprice);
	}

	public static void main(String[] args) {
		OffSeason obj=new OffSeason();
		obj.discount();
	}

}
