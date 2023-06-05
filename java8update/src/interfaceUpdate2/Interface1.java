package interfaceUpdate2;

public interface Interface1 {

	 default void m1() {
		
		System.out.println("m1() default of Interface1");
	}
	
 default void m2() {
		
		System.out.println("m2() default of Interface1");

	}
}
