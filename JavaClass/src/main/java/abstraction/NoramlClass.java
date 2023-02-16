package abstraction;

public class NoramlClass extends AbstractClass{
	public void abstractMethod() {
		System.out.println("Abstract Method");
	}

	public static void main(String[] args) {
		NoramlClass obj=new NoramlClass();
		obj.abstractMethod();
		obj.normalMethod();

	}


}
