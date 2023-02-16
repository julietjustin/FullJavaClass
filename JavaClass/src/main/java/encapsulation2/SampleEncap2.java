package encapsulation2;

import encapsulation1.SampleEncap1;

public class SampleEncap2 {
	public static void main(String[] args) {
		SampleEncap1 obj=new SampleEncap1();
		obj.setter("juliet",29);
		obj.getter();
		//System.out.println(obj.name); //we can't access private variable
	}

}
