package lambdaexpwrtfunctionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//if you add public before this class DescendingComparator, then see the the magic it will give error
//like it must be defined in its own file.
class DescendingComparator implements Comparator<Integer>{
	
	public int compare(Integer i1,Integer i2) {
		
		if(i1<i2) {
			
			return 1;
		}else if(i1>i2) {
			return -1;
		}else {
			return 0;
		}
	}
}
public class ImplementingDesComparator {

	public static void main(String[] args) {
		
		ArrayList<Integer>l=new ArrayList<>();
		l.add(20);
		l.add(10);
		l.add(25);
		l.add(5);
		l.add(0);
		l.add(15);
		
		System.out.println("Before ordering in ascending order: "+l);
		
		Collections.sort(l,new DescendingComparator());
		
		System.out.println("After ordering in acsending order: "+l);
	}
}
