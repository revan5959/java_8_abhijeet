package interfaceUpdate2;

public class ImplClassInterface1 implements Interface1 {

	public static void main(String[] args) {

		ImplClassInterface1 i = new ImplClassInterface1();
		i.m1();
		i.m2();

	}

	@Override
	public void m2() {// I can override the default m2() of Interface through super() or just provide
						// implementation

		// Interface1.super.m2();

		System.out.println("Or just provide implementation");
	}
}
