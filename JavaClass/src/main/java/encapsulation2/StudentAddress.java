package encapsulation2;

import encapsulation1.Student;

public class StudentAddress {
	private String address;
	public void setterAddress(String address) {
		this.address=address;
	}
	public void getterAddress() {
		System.out.println("Address Of The Student:"+address);
	}

	public static void main(String[] args) {
		Student obj=new Student();
		obj.setterStudent("juliet",11044);
		obj.getterStudent();
		StudentAddress obj1=new StudentAddress();
		obj1.setterAddress("Puthenpurackal House,Alappuzha");
		obj1.getterAddress();
	}

}
