package abstraction;

public class Interview2 extends Interview {
	public void print() {
		System.out.println(super.x);//if we give different method name then no need to use super keyword
	}

	public static void main(String[] args) {
		Interview2 obj=new Interview2();
		obj.print();//child class value from parent class
		Interview obj2=new Interview(5);//parent class values
		obj2.print();//parent class values

	}

}
