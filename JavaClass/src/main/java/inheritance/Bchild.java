package inheritance;

public class Bchild extends Aparent {
	int sum;
	public void sum(){
		sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Bchild obj=new Bchild();
		obj.sum();

	}

}
