package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListSample {
	public static void main(String[] args) {
		List obj=new ArrayList();//Generalized array list(any data type can be given)
		obj.add(1);
		obj.add('e');
		obj.add("Apple");
		obj.add(99.8d);
		System.out.println("Generalized List:"+obj);
		List<Integer> obj1=new ArrayList();
		obj1.add(1);//only integer data type can be given
		obj1.add(6);
		obj1.add(8);
		obj1.add(9);
		obj1.add(9);
		//obj1.add("Hello");
		System.out.println(obj1);
		List<String> obj2=new ArrayList();
		obj2.add("Apple");//only String data type can be given
		obj2.add("Orange");
		obj2.add("Dove");
		obj2.add("Dove");
		//obj2.add(9);//integer
		System.out.println(obj2);
		Iterator itr=obj2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
