package inheritance;

public class SalaryClass3 extends SalaryClass2 {
	public void totalSalary() {
		double totalsalary=(basicpay+hra-pf-deduction+bonus);
		System.out.println("Salary Slip Of Employee:");
		System.out.println("-------------------------");
		System.out.println("Company Name:"+companyname);
		System.out.println("Name Of The Employee:"+name);
		System.out.println("Employee Id:"+empid);
		System.out.println("Mobile Number:"+mobileno);
		System.out.println("-----------------------------");
		System.out.println("Basic Pay Amount:Rs"+basicpay);
		System.out.println("Deduction Amount:Rs"+deduction);
		System.out.println("HRA Amount:Rs"+hra);
		System.out.println("PF Amount:Rs"+pf);
		System.out.println("Bonus Amount:Rs"+bonus);
		System.out.println("Total Salary To Be Paid:Rs"+totalsalary);	
	}

	public static void main(String[] args) {
		SalaryClass3 obj=new SalaryClass3();
		obj.calculate();
		obj.totalSalary();
		

	}

}
