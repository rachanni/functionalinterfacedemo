package performance;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToDoubleFunction;

//calculate the square root of the given number
public class SquareRoot {

	public static void main(String[] args) {
		
		Function<Integer,Double>f=i->Math.sqrt(i);
		System.out.println(f.apply(27));
//		
//		As we already know return type is Double so go for ToDoubleFunction
//		here we have one more option IntToDoubleFunction
		ToDoubleFunction<Integer>f1=i->Math.sqrt(i);
		System.out.println(f1.applyAsDouble(16));
		
		IntToDoubleFunction f2=i->Math.sqrt(i);
		System.out.println(f2.applyAsDouble(100));
		
	}
}
