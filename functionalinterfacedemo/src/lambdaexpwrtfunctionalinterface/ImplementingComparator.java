package lambdaexpwrtfunctionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// here <Integer> is very very very important otherwise remove it and see the magic
//you will get error like add unimplemented method compare(Object o1, Object o2)
//but you are passing integer so better to make it generic
//<Integer>
class AscendingComapartor implements Comparator<Integer>{
	
	public int compare(Integer i1, Integer i2) {
		
		if(i1<i2) {
			
			return -1;
		}else if(i1>i2) {
			
			return 1;
		}else {
			
			return 0;
		}
		
		
		
	}
	
}
public class ImplementingComparator {

	
	public static void main(String[] args) {
		
		ArrayList<Integer>l=new ArrayList<>();
		l.add(20);
		l.add(10);
		l.add(25);
		l.add(5);
		l.add(0);
		l.add(15);
		
		System.out.println("Before ordering in ascending order: "+l);
		
		Collections.sort(l,new AscendingComapartor());
		
		System.out.println("After ordering in acsending order: "+l);
	}
}
