
/*
2020112099 송민지
본인은 이 소스파일을 다른이의 소스코드를 복사하지 않고 직접 작성하였습니다.
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

