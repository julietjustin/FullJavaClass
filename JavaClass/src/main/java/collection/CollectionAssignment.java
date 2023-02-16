package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionAssignment {
	public static void main(String[] args) {
		ArrayList<String> obj=new ArrayList();
		obj.add("Red");
		obj.add("Orange");
		obj.add("Green");
		obj.add("Blue");
		System.out.println("Colours Are:");
		System.out.println("--------------");
		System.out.println(obj);
	    //obj.get(3);//retrieve element
		System.out.println("Retrieved Element Is");
		System.out.println("----------------------");
		System.out.println(obj.get(3));
		System.out.println("Iterated Element Are");
		System.out.println("----------------------");
		Iterator itr=obj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		obj.remove(2);//removed
		System.out.println(obj);
		obj.contains("Red");//contains
		System.out.println(obj.contains("Red"));
		}

}
