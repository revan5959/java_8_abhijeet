package staticInnerClass;

import annonymousClass.Person;

public class Test {

	public static void main(String[] args) {

		OuterClass.outer();
		System.out.println(OuterClass.message);
		OuterClass.InnerClass.inn();

		OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
		innerClass.nonStatic();
		
		Comparable<Person> compTypePersonObjec = new Person();
	}

	
}
