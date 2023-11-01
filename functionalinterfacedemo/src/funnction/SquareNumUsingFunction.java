package funnction;

//Taking some input then performing some operation and then returning output

import java.util.function.Function;

public class SquareNumUsingFunction {

	public static void main(String[] args) {
		
		Function<Integer,Integer>f=n->n*n;
		
		System.out.println(f.apply(4));
		System.out.println(f.apply(5));
	}
}
