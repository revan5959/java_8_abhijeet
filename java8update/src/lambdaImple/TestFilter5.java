package lambdaImple;

import java.util.ArrayList;
import java.util.List;

class Employee{
	
	private String name;
	
	private Integer id;
	
	private String email;
	
	private Double salary;

	public Employee(String name, Integer id, String email, Double salary) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", email=" + email + ", salary=" + salary + "]";
	}
	
	
}
public class TestFilter5 {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Revan", 1245, "siddurevan7@gmail.com", 9999.00));
		list.add(new Employee("Vijay", 9975, "Vijay@gmail.com", 1012.00));
		list.add(new Employee("Abhishek", 0123, "Abhishek7@gmail.com", 01245.00));
		list.add(new Employee("Vivek", 1111, "Vivek7@gmail.com", 5555.00));
		
		list.stream().filter(e->e.getName().contains("Rev")).forEach(e->System.out.println(e));;

	}

}
