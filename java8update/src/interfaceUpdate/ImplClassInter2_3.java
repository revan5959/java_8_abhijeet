package interfaceUpdate;

public class ImplClassInter2_3 implements Interface2, Interface3{

	public static void main(String[] args) {
		
		Interface2 i2 = new ImplClassInter2_3();
		i2.m2();
		
		Interface3 i3 = new ImplClassInter2_3();
		i3.m3();
			
		
	}
}
