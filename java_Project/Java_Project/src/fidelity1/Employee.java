package fidelity1;
import java.util.Scanner;
public class Employee {
	private int empid;
	private String name;
	private double salary;
	private static int counter=1000;
	
    Employee(){
		empid= ++counter;
	}
	
	void employee(String n, double s){
		empid=++counter;
		name=n;
		salary=s;
	}
	void acceptdata() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your name: ");
		name=sc.nextLine();
		System.out.println("Enter Salary: ");
		salary=sc.nextDouble();
	}
	void displaydata() {
			System.out.println("ID:"+empid);
			System.out.println("Name:"+name);
			System.out.println("Salary:"+salary);
	}
	void incrementSalary() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Increment:");
		salary +=sc.nextDouble();
		System.out.println("Salary Updated");
	}
}
	


	