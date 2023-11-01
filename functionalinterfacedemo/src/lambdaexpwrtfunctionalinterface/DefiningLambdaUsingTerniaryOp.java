package lambdaexpwrtfunctionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DefiningLambdaUsingTerniaryOp {

	public static void main(String[] args) {
		
		ArrayList<Integer>l=new ArrayList<>();
		l.add(20);
		l.add(10);
		l.add(25);
		l.add(5);
		l.add(0);
		l.add(15);
		
		System.out.println("Before ordering in ascending order: "+l);
		
//		As you can see here we have written the whole comaparator in just one line
		Comparator<Integer> cmp=(i1,i2)->(i1<i2)?-1:(i1>i2)?1:0;
			
			
		Collections.sort(l,cmp);
		
		System.out.println("After ordering in acsending order: "+l);
	}
}
