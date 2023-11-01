package performance.functionpredicate;
//return the length of String
import java.util.function.Function;
import java.util.function.ToIntFunction;
public class LengthOfString {

	public static void main(String[] args) {
		
		Function<String,Integer>f=s->s.length();
		
//		As we already know Return type is int so go for ToIntFunction 
		ToIntFunction<String>f1=s->s.length();
		System.out.println(f.apply("RaviLal"));
		System.out.println(f1.applyAsInt("Sam"));
	}
}
