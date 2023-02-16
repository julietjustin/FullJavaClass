package constructor;

public class ConstructorReverse {
	int n,rev=0,remi;
	public ConstructorReverse(int n){
		this.n=n;
		System.out.println("The Number Before Reversing:"+n);
		while(n!=0){
		remi=n%10;
		rev=rev*10+remi;
		n=n/10;
		}
	}
	public ConstructorReverse(){
		this(1234);
		System.out.println("The Number After Reversing:"+rev);
	}

	public static void main(String[] args) {
		ConstructorReverse obj=new ConstructorReverse();
		//new ConstructorReverse();
		
	}

}
