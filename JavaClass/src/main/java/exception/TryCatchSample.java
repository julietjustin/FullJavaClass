package exception;

public class TryCatchSample {
	int a=10;
	int b=5;
	int c=8,d=4;
	public void add() {
		int sum=a+b;
		System.out.println(sum);
	}
	public void diff() {
		int sub=a-b;
		System.out.println(sub);
	}
public void division() {
	int div=a/b;
	System.out.println(div);
	try {
		System.out.println(a/0);//
	}
	catch(Exception ae){
		System.out.println(ae.getMessage());
		System.out.println(ae);
		ae.printStackTrace();
	}
	finally{
		System.out.println("Hello");
	}
	//finally{//we want to create another try catch exception
		//System.out.println("Apple");
	//}
}
	public void division1() {//try catch finally should be in one method 
		int div1=c/d;
		System.out.println(div1);
	try {
		System.out.println(c/0);//
	}
	catch(Exception ae){
		System.out.println(ae.getMessage());
		System.out.println(ae);
		ae.printStackTrace();
	}
	finally{
		System.out.println("Apple");
	}
	try {
		System.out.println(c/0);//
	}
	
	catch(Exception ae){
		System.out.println(ae.getMessage());
		System.out.println(ae);
		ae.printStackTrace();
	}
	
	finally{
		System.out.println("Apple");
	}	
}
	public void display() {//we can create another method after final
		System.out.println("Orange");
	}

	public static void main(String[] args) {
		TryCatchSample obj=new TryCatchSample();
		obj.add();
		obj.division();
		obj.diff();
		obj.division1();
		obj.display();
	

	}

}
