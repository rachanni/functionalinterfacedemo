package bipredicate;
import java.util.function.BiPredicate;

/*write a program to check sum of two number is 
even or not*/

public class EvenNumber {

	public static void main(String[] args) {
		
		BiPredicate<Integer,Integer>p=(a,b)->(a+b)%2==0;
		System.out.println(p.test(10, 20));
		System.out.println(p.test(10, 5));
	}
}
