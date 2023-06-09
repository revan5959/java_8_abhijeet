package test;

import java.util.Comparator;

public class HelperCLasss implements Comparator<HelperCLasss> {

	public HelperCLasss() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "HelperCLasss [name=" + name + ", id=" + id + "]";
	}

	private String name;

	private Integer id;

	public HelperCLasss(String name, Integer id) {
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
	public int compare(HelperCLasss o1, HelperCLasss o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareToIgnoreCase(o2.getName());
	}
}
