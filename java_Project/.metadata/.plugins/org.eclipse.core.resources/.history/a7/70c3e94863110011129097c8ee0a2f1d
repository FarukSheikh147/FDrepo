package com.day2;

public class UseEmployee {
	
	public static void main(String[]args) {
		PermanantEmployee p1= new PermanantEmployee(101, "Alex", 3000, 2000 );
		System.out.println(p1.empId+p1.name+p1.salary+p1.bonus);
		
		p1.calculatePerk(30);
		p1.calculatePerk(26,30);
		
		ContractualEmployee c1=new ContractualEmployee (102, "Aman",4000,2);
		System.out.println(c1.empId+c1.name+c1.salary+c1.noOfHours);
		
		// Super class reference holding sub class object
		Employee e2= new PermanantEmployee(101, "Alex", 3000, 2000 );
		System.out.println("Calling Display using e2");
		e2.displayDetails();
		
		if(e2 instanceof PermanantEmployee) {
			PermanantEmployee p2=(PermanantEmployee)e2;
			p2.calculatePerk(30);
		}
			
		Employee e3= new ContractualEmployee(102, "Aman",4000,2);
		
	}

}
