package stringbufferbuiler;

public class StringBuilderClassSample {
	public static void main(String[] args) {
		StringBuilder obj=new StringBuilder("Hello World"); 
		System.out.println(obj); 
		obj.insert( 11,"New");
		System.out.println(obj);
		obj.delete(6, 11);
		System.out.println(obj);
		obj.append(" Test d ");
		System.out.println(obj);
		obj.reverse();
		System.out.println(obj);
		obj.reverse();
		System.out.println(obj);
		obj.replace(10,14,"java");
		System.out.println(obj);
		obj.append("java");
		System.out.println(obj);
		obj.capacity();
		System.out.println(obj.capacity());
		obj.ensureCapacity(28);
		System.out.println(obj.capacity());
		obj.length();
		System.out.println(obj.length());
		obj.charAt(0);
		System.out.println(obj.charAt(4));
		obj.deleteCharAt(15);
		System.out.println(obj);
		obj.codePointAt(0);//ask
		System.out.println(obj.codePointAt(4));
		obj.codePointBefore(1);//ask
		System.out.println(obj.codePointBefore(5));
		obj.trimToSize();
		System.out.println(obj.capacity());
		obj.setLength(15);
		System.out.println(obj);
		obj.codePointCount(0,1);//ask
		System.out.println(obj.codePointCount(10, 11));
		obj.substring(0);//ask
		System.out.println(obj.substring(0));
		obj.subSequence(0, 1);
		System.out.println(obj.subSequence(1,2 ));
		obj.indexOf("");
		System.out.println(obj.indexOf("e"));
		obj.lastIndexOf("a");
		System.out.println(obj.lastIndexOf("a"));			

	}


}
