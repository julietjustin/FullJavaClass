package encapsulation1;

public class Student {
	private String name;
	private int rollnumber;
	public void setterStudent(String name,int rollnumber) {
		this.name=name;
		this.rollnumber=rollnumber;
	}
	public void getterStudent() {
		System.out.println("Student Details");
		System.out.println("-------------------");
		System.out.println("Name Of The Student:"+name);
		System.out.println("Roll Number Of Student:"+rollnumber);
	}

}
