
/*
2020112099 �۹���
������ �� �ҽ������� �ٸ����� �ҽ��ڵ带 �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.
*/

public class Employee {


	private String firstname;
	private String lastname;
	private double salary;
	
	public Employee(String firstname, String lastname, double salary) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		if(salary > 0.0) {
		this.salary = salary;
		}
	}
	
	public void setFirstName(String name){
		this.firstname = name;
	}
	
	public String getFirstName(){
		return firstname;
	}
	
	public void setLastName(String name){
		this.lastname = name;
	}
	
	public String getLastName(){
		return lastname;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	public double getSalary(){
		return salary;
	}
	
	
	
	
}

