package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionSample {
	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add(8);//generalised array list(any data type can be given)
		obj.add("Apple");
		obj.add(7.8f);
		obj.add('c');
		//obj.remove(1);//removes that particular data that belongs to the given index
		obj.isEmpty();
		System.out.println(obj.isEmpty());
		//obj.clear();//clear all data from that
		obj.clone();//generate duplicate
		System.out.println(obj.clone());
		obj.contains("Apple");
		System.out.println(obj.contains("Apple"));
		obj.contains(0);
		System.out.println(obj.contains(0));
		System.out.println(obj);
		ArrayList<Integer> objj=new ArrayList();//empty array
		System.out.println(objj.isEmpty());//so it prints true
		ArrayList<Integer> obj1=new ArrayList();
		obj1.add(1);//only integer data type can be given
		obj1.add(6);
		obj1.add(8);
		obj1.add(9);
		obj1.add(9);
		//obj1.add("Hello");
		System.out.println(obj1);
		ArrayList<String> obj2=new ArrayList();
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
