package superkeyword;

public class SuperChild extends SuperParent {
	int a=50,b=60;
	public void Print() {
		//super();
		System.out.println(super.a);
		System.out.println(super.b);
		System.out.println(a);
		System.out.println(b);
		super.add();//super used to calling method from parent class
		this.add();//this is used to call method from same class
	}
	public void add() {
		int sum=a+b;
		System.out.println(sum);
	}
	public SuperChild() {
		super();//super used in constructor 
		System.out.println("child Class Constructor");
	}

	public static void main(String[] args) {
		SuperChild obj=new SuperChild();
		obj.Print();
		obj.add();//used to print same class method

	}


}
