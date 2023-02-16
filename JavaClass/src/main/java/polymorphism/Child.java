package polymorphism;

public class Child extends  Parent{
	@Override
	public void test() {
		System.out.println("Child Class");//overriding so child class only prints 
	}

	public static void main(String[] args) {
		Child obj=new Child();
		obj.test();

	}

}
