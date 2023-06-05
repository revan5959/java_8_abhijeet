package interfaceUpdate;

public interface Interface1 {

	int a = 10;
	
	default void m1() {
		System.out.println("Default method");
	}

	public static void display() {

		System.out.println("static () in interface");

	}

	public static void main(String[] args) {

		display();
	}
}
