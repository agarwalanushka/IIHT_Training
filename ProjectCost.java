package assignmentSep23;

import java.util.Scanner;

class Employee{
	int emp;
	
	Employee(int emp){
		this.emp = emp;
	}
	int[] sal = new int[emp];
	
	void setSal(int[] sal) {
		this.sal = sal;
	}
	int sum=0;
	int existingCost() {
		for(int i = 0;i <emp;i++) {
			sum = sum+sal[i];
		}
		return sum;
	}
}

class Project {
	
	int projectcost;
	int newEmp;
	Project(int cost,int newEmp){
		this.projectcost = cost;
		this.newEmp = newEmp;
	}
	
	void canHire(Employee obj) {
		System.out.println("Project Cost "+projectcost);
		if((projectcost-obj.sum-newEmp)<0) {
			System.out.println("Cannot Hire employee at this salary");
		}
		else {
			System.out.println("employee can be hired at this salary");
			System.out.println("Savings at project are "+(projectcost-obj.sum));
		}
	}
}
public class ProjectCost {
	public static void main(String[] args) {
		Employee emp = new Employee(2);
		int[] setSalary = {200,300};
		emp.setSal(setSalary);
		emp.existingCost();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the expected salary");
		int expectedSal = sc.nextInt();
		Project pro = new Project(1000,expectedSal);
		
		pro.canHire(emp);
	}
}
