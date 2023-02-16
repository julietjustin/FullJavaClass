package interfacesample;

public class ClassA {
	public void test() {
		System.out.println("InterfaceA");//inteface(abstract method definition)
	}
	public void test2() {
		System.out.println("InterfaceB");//inteface(abstract method definition)
	}
	
	public void normal() {
		System.out.println("ClassA");//class method
	}

	public static void main(String[] args) {
		ClassA obj=new ClassA();
		obj.test();
		obj.normal();
		obj.test2();
	}

}
