package finalkeyword;

public class A extends B {
	final int a=50;
	public void test() {
		//a=50;//we can't assign as a variable used final keyword
		System.out.println(a);
	}

	public static void main(String[] args) {
		A obj=new A();
		obj.test();

	}

}
