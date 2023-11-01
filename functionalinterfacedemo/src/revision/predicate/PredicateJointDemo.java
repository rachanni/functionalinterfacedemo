package revision.predicate;

import java.util.function.Predicate;

public class PredicateJointDemo {

	public static void main(String[] args) {
		
		int[]x= {0,5,10,15,20,25,30,35};
		
		System.out.print("Given number : ");
		for(int y:x) {
			System.out.print(y+",");
		}
		System.out.println();
		Predicate<Integer>p1=m->m%2==0;
		Predicate<Integer>p2=m->m>10;
		
		System.out.print("Number is even and greater than 10 : ");
		for(int y:x) {
			if(p1.and(p2).test(y)) {
				System.out.print(y+",");
			}
		}
		
		System.out.println();
		System.out.print("Number is even or gretaer than 10 : ");
		for(int y:x) {
			if(p1.or(p2).test(y)) {
				System.out.print(y+",");
			}
//			if(p1.negate(p2).test(y)) {
//				System.out.println("Number is neither even nor greater than 10"+y);
//			}
		}
	}
}
