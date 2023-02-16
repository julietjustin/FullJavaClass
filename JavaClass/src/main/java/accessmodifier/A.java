package accessmodifier;

public class A {
	public void publicMethod(){
		System.out.println("Public Method");
	}
	private void privateMethod(){
		System.out.println("Private Method");
	}
	void defaultMethod(){
		System.out.println("Default Method");
	}
	protected void protectedMethod(){
		System.out.println("Protected Method");
	}


}
