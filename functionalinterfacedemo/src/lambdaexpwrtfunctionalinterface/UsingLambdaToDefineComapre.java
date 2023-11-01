package lambdaexpwrtfunctionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UsingLambdaToDefineComapre {

	public static void main(String[] args) {
		
		ArrayList<Integer>l=new ArrayList<>();
		l.add(20);
		l.add(10);
		l.add(25);
		l.add(5);
		l.add(0);
		l.add(15);
		
		System.out.println("Before ordering in ascending order: "+l);
		
		Comparator<Integer> cmp=(i1,i2)->{
			
			if(i1<i2) {
				return -1;
			}else if(i1>i2) {
				return 1;
			}else {
				return 0;
			}
		};
		
		Collections.sort(l,cmp);
		
		System.out.println("After ordering in acsending order: "+l);
	}
}
