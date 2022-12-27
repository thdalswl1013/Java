
/*
2020112099 송민지
본인은 이 소스파일을 다른이의 소스코드를 복사하지 않고 직접 작성하였습니다.
*/

public class EmployeeTest {

	public static void main(String[] args) {
	
	
	Employee employee1 = new Employee("Bob", "Jones",34500.00 );
	Employee employee2 = new Employee("Susan", "Baker", 37809.00);

	
		System.out.printf("Employee 1: %s %s; %f%n",employee1.getFirstName(),employee1.getLastName(),employee1.getSalary());
		System.out.printf("Employee 2: %s %s; %f%n%n",employee2.getFirstName(),employee2.getLastName(),employee2.getSalary());
		System.out.println("Increasing employee salaries by 10%");
		System.out.printf("%nEmployee 1: %s %s; %f%n",employee1.getFirstName(),employee1.getLastName(),employee1.getSalary() * (1.1));
		System.out.printf("Employee 2: %s %s; %f%n",employee2.getFirstName(),employee2.getLastName(),employee2.getSalary() * (1.1));
	
	}
	
}
