package lambdaexpwrtfunctionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//sort employee on the basis name, alphabetically

class Employee1{
	
	String name;
	int id;
	
	Employee1(String name,int id){
		this.name=name;
		this.id=id;
	}

	@Override
	public String toString() {
		return "name=" + name + " id=" + id ;
	}
	
	
}
public class SortingCustomObjectUsingComp1 {

public static void main(String[] args) {
		
		ArrayList<Employee1>l1=new ArrayList<>();
		
		l1.add(new Employee1("Ravi",100525));
		l1.add(new Employee1("Golu",100721));
		l1.add(new Employee1("Shilpa",100121));
		l1.add(new Employee1("Shri Ram",100099));
		l1.add(new Employee1("Amit Raj",100055));
		
		System.out.println("Before sorting: "+l1);
		
		System.out.println("===================");
//		<Employee> ensure parameter is of type Employee
		Comparator<Employee1>cmp1=(emp1,emp2)->(emp1.name.compareTo(emp2.name));
//		
//		Can you write the compare method in slightly diffrent way.
//		s1 = "Akshat" s2=" Ravi"
//		s1.compareTo(s2) -> -1
//		if s1 comes alphabetically before s2 then compareTo() returns -1
//		if s1 comes alphabetically after s2 then compareTo() returns 1
//		if s1 equals to s2 then it returns 0
		
//		so using the above logic sort in descending order
		
		/*
		 * try to understand compare(Object obj1,Object obj2) in simple way 
		 * 
		 * compare(3,5)
		 * 
		 */
		Comparator<Employee1>cmp2=(emp1,emp2)->(emp1.name.compareTo(emp2.name)<0)?1:(emp1.name.compareTo(emp2.name)>0)?-1:0;
		Collections.sort(l1,cmp1);
		
		System.out.println("After sorting in alphabteical order : "+l1);
		
		System.out.println("===================");
		
		Collections.sort(l1,cmp2);
		System.out.println("After sorting in reverse alphabetical order : "+l1);
		
	}
}
