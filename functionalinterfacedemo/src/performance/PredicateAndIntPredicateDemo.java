package performance;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/*
 * 
   Write a Predicate and IntPredicate to check and compare the time taken 
   difference

*/

public class PredicateAndIntPredicateDemo {

	public static void main(String[] args) {
		
		Predicate<Integer>p1=n->n%2==0;
		IntPredicate p2=n->n%2==0;
		
		int arr[]=new int[100000];
		
		for(int i=0;i<100000;i++) {
			
			arr[i]=i;
		}
		
		long startTime1 = System.currentTimeMillis() ;
		for(int x:arr) {
			System.out.println(x+" : "+p1.test(x));
		}
		
		long endTime1 = System.currentTimeMillis() ;
		
		
		long elapsedTime1=endTime1-startTime1;
		
		System.out.println("Time taken by Predicate:"+elapsedTime1);
		
		System.out.println("=================================");
		
		long startTime2 = System.currentTimeMillis() ;
		for(int x:arr) {
			System.out.println(x+" : "+p2.test(x));
		}
		
		long endTime2 = System.currentTimeMillis() ;
		long elapsedTime2=endTime2-startTime2;
		System.out.println("Time taken by IntPredicate:"+elapsedTime2);
		
		System.out.println("========================");
		
		System.out.println(elapsedTime1-elapsedTime2);
	}
}
