package accessmodifier;

public class B extends A {
	public static void main(String[] args) {
		B obj=new B();
		obj.publicMethod();
		//obj.privateMethod();//cannot visible to other class and package as it is private
		obj.defaultMethod();
		obj.protectedMethod();
		

	}

}
