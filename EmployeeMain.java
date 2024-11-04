package com.example;

class Employee{
	int id;
	String name;
	static String address;
	
	public Employee( ){
		id=0;
		name="XXXXXX";
		System.out.println("in constrtor");
	}
	static {
		address="Hyderabd";
		System.out.println("in static block");
	}
	
	public void Show(Employee employee ) {
		System.out.println(employee.id+" : " + employee.name + " : " + Employee.address);
	}
//	public static void Show(Employee employee ) {
//		System.out.println(employee.id+" : " + employee.name + " : " + Employee.address);
//	}
	
}

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.id=12;
		e.name="Nick";
		Employee.address="Hyderabad";
		e.Show(e);
		
		Employee e1 = new Employee();
//		e1.id=2;
//		e1.name="Jack";
//		Employee.address="Banglore";
		e1.Show(e1);
//		
//		
//		Employee e2 = new Employee();
//		e2.id=3;
//		e2.name="Sam";
//		Employee.address="Chennai";
	
		
//		Employee.Show(e2);
//		Employee.Show(e1);
		
//		Employee emp[]=new Employee[3];
//		emp[0]=e;
//		emp[1]=e1;
//		emp[2]=e2;
		
//		for (int i=0;i<emp.length;i++) {
//			
//		}
		
//		for(Employee employee : emp) {
//			System.out.println(employee.id+" : " + employee.name + " : " + employee.address);
//		}
	}

}
