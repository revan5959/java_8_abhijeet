package staticInnerClass;

public class OuterClass {

	public static String message = "message from outer class";
	
	public static void outer() {
		
		class LocalClass{//it is like the local member variable
			
			
		}
		System.out.println("Outer() in outer classs");
	}
	

	public static class InnerClass{//since it is static it is loaded at the begining stage 
		
		public static void inn() {
			System.out.println("inn() fro  m inner class");
		}
		
		public void nonStatic() {
			System.out.println("non static inner()");
		}
	}
	
	
	
	//In non-static inner class we cannot have static member
	//In static inner class we can have non-static member
	
//	when is inner constructor is called :
//	new OuterClass.InnerClass();s
}




