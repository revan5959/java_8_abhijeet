package test;

import java.util.Comparator;

public class SortByComprartorObject  {

	private String name;
	
	private Integer id;
	
	public SortByComprartorObject(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
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
	@Override
	public String toString() {
		return "SortByComprartorObject [name=" + name + ", id=" + id + "]";
	}

	

	

	
	
	
}
