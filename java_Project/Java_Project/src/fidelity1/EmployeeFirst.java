package fidelity1;

import java.util.Scanner;

public class EmployeeFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Employee e = new Employee();
		int ch;
		
		do {
			System.out.println("\n1.Accept 2.Display 3. Increment 4.Exit");
			System.out.println("Choice: ");
			ch=sc.nextInt();
			
	   switch(ch) {
	   case 1:e.acceptdata();
	   break;
	   case 2:e.displaydata();
	   break;
	   case 3:e.incrementSalary();
	   break;
	   case 4:System.out.println("Thank You");
	   break;
	   default:System.out.println("Invalid Choice");
	   
	   }
	}while(ch!=4);

	}

}





   
   
   
   
   
   
   
   