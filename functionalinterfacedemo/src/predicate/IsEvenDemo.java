package predicate;

import java.util.function.Predicate;

public class IsEvenDemo {

	public static void main(String[] args) {
		
		Predicate<Integer>p=n->n%2==0;
		System.out.println(p.test(4));
		System.out.println(p.test(7));
	}
}
