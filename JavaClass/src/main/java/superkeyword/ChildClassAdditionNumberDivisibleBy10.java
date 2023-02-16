package superkeyword;

public class ChildClassAdditionNumberDivisibleBy10 extends AdditionNumberDivisibleBy10{
	int c;
	public void CheckDivisible() {
		this.c=super.sum;
		if(c%10==0) {
			System.out.println("The Sum Is Divisible by 10");
		}
		else {
			System.out.println("The Sum Is Not Divisible by 10");
		}
	}

	public static void main(String[] args) {
		ChildClassAdditionNumberDivisibleBy10 obj=new ChildClassAdditionNumberDivisibleBy10();
		int s=AdditionNumberDivisibleBy10.add();
		System.out.println(s);
		obj.CheckDivisible();

	}

}
