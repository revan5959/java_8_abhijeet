package interfaceUpdate2;

public interface Interface2 {

	/*
	 * default boolean equals(Object o) {// we cannot override the default methods
	 * of Object class
	 * 
	 * return true; }
	 */
	
	public static void main(String[] args) {
		
//		What is the use of Interface:
//			1.	Achieve abstraction (can achieve abstraction)
//			2.	Loose coupling
//			3.	Multiple inheritance
//			4.	Generalization
//			5.	To declare method (By default method is public and abstract + concrete method/default method)
//
//			Why we can achieve 100% abstraction for the Abstract class?
//			-	Because Abstract class extends Object class which has 11 methods 
//			-	Hence, we can’t achieve 100% abstraction by Abstract class
//			We can achieve 100% abstraction through the Interface.
//
//			In interface we cannot create a default method of the Object class. 
//			Ex: default Boolean equals (Object o) { } is not possible because the interface will get confusion
//
//
//			JAVA 8 UPDATE: 
//
//			Interface update:
//			-	In java 8 update we started getting two types of concrete methods in interface.
//			-	These concrete methods are static and default.
//			-	In the implementing class when it implements more than one interface, there is possibility of having default methods in these parent interface
//			-	To overcome this situation of ambiguity it is compulsory to override common default method in implementing child class.
//
//			Rule of creating default method in an interface:
//			-	While creating default methods in interface the default methods signature should be different from Object class methods.

	}
}
