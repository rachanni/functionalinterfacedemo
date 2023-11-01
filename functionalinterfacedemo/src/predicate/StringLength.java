package predicate;

//write a predicate to check string length is greater than 5 or not.

import java.util.function.Predicate;

public class StringLength {

	public static void main(String[] args) {

		Predicate<String> p = s -> s.length() > 5;

		String[] s = { "Nag", "Chiranjeevi", "Venkatesth", "Balaiah", "Sunny", "Katrina" };

		for (String x : s) {
			if(p.test(x)) {
				System.out.println(x);
			}
		}
	}
}
