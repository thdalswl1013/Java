
/*
2020112099 �۹���
������ �� �ҽ������� �ٸ����� �ҽ��ڵ带 �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.
*/

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String firstName, lastName;
		double monthlySalary;
		
		System.out.print("Enter first name: ");
		firstName = input.next();

		System.out.print("Enter last name: ");
		lastName = input.next();
		
		System.out.print("Enter monthly salary: ");
		monthlySalary = input.nextDouble();
		
		Employee employee1 = new Employee(firstName, lastName, monthlySalary);
		System.out.printf("%n");
		
		System.out.print("Enter first name: ");
		firstName = input.next();
		
		System.out.print("Enter last name: ");
		lastName = input.next();
		
		System.out.print("Enter monthly salary: ");
		monthlySalary = input.nextDouble();
		
		Employee employee2 = new Employee(firstName, lastName, monthlySalary);
		System.out.printf("%n");

		
		System.out.printf("Employee 1: %s %s; %f%n",employee1.getFirstName(),employee1.getLastName(),employee1.getSalary());
		System.out.printf("Employee 2: %s %s; %f%n%n",employee2.getFirstName(),employee2.getLastName(),employee2.getSalary());
		System.out.println("Increasing employee salaries by 10%");
		System.out.printf("%nEmployee 1: %s %s; %f%n",employee1.getFirstName(),employee1.getLastName(),employee1.getSalary() * (1.1));
		System.out.printf("Employee 2: %s %s; %f%n",employee2.getFirstName(),employee2.getLastName(),employee2.getSalary() * (1.1));
	
	}

}
