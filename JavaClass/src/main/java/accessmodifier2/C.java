package accessmodifier2;
import accessmodifier.A;
public class C extends A {
	public static void main(String[] args) {
		C obj=new C();
		obj.publicMethod();
		//obj.privateMethod();//cannot visible to other package
		//obj.defaultMethod();
		obj.protectedMethod();//using importX
		

	}

}
