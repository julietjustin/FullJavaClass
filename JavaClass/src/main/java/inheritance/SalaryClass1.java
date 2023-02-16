package inheritance;

import java.util.Scanner;

public class SalaryClass1 {
	String companyname="obsqura";
	String name="Juliet Rose Kurian";
	int empid=2345;
	long mobileno=987654666;
	//int basicpay=10000;
	//int deduction=2000;
	//int bonus=10000;
	int basicpay;
	int deduction;
	int bonus;{
	Scanner s= new Scanner(System.in);
	System.out.println("\n Enter Basic Pay");  
	basicpay=s.nextInt();
	System.out.println("\n Enter Deduction Amount");  
	deduction=s.nextInt();
	System.out.println("\n Enter Bonus Amount");  
	bonus=s.nextInt();
	}

}
