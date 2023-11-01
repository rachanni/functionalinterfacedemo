package lambdademo;

import java.util.function.Predicate;

//Whenenver we need to do some conditional check, just import Predicate functional interface
//and define test method
public class EvenNumberDemoUsingLambda {

	public static void main(String[] args) {
		
		Predicate<Integer>p=n->n%2==0;
		System.out.println(p.test(5));
		System.out.println(p.test(11));
		System.out.println(p.test(6));
		System.out.println(p.test(10000001));
	}
}
