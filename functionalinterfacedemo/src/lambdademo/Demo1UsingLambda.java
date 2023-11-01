package lambdademo;

//here we are calculating square of integer using Lmbda expression 
//as you can see how concise this code is
//1. There is no need to write separate method
//2. Just import Function interface 

import java.util.function.Function;

public class Demo1UsingLambda {

	public static void main(String[] args) {
		
		Function<Integer,Integer>f=n->n*n;
		
		System.out.println(f.apply(6));
		System.out.println(f.apply(7));
	}
}
