package lambdaImple;

public class Testlambda {

	public static void main(String[] args) {

		// Creating the custom functional interface
		int a = 10;
		int b = 20;
		int c = 30;
		DataConverter dc = (e1, e2, e3) -> {

			return e1 + e2 + e3 + "";
		};
		System.out.println(dc.converter(a, b, c));

		DataConverter dc2 = (e1, e2, e3) -> {

			return e1 + e2 + "";
		};
		System.out.println(dc2.converter(a, b, c));
	}
}
