package superkeyword;

public class SuperParent {
	int a=10;
	int b=20;
	public void add() {
		int sum=a+b;
		System.out.println(sum);
	}
	public SuperParent(){
		System.out.println("Parent Class Constructor");
	}

}
