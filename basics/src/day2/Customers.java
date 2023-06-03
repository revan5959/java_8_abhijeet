package day2;

import java.util.Comparator;

public class Customers implements Comparator<Customers>{

	private int id;
	
	private String name;
	
	private int age;

	public Customers(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customers [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compare(Customers o1, Customers o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
