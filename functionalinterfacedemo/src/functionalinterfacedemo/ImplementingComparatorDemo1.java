package functionalinterfacedemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee1{
	
	String name;
	Integer emp_id;
	
	public Employee1(String name,int emp_id) {
		
		this.name=name;
		this.emp_id=emp_id;
	}

	@Override
	public String toString() {
		return "name=" + name + " emp_id=" + emp_id ;
	}
	
	
	
}

public class ImplementingComparatorDemo1 {

	public static void main(String[] args) {
		
		
		ArrayList<Employee1>l=new ArrayList<>();
		l.add(new Employee1("Ravi",100525));
		l.add(new Employee1("Golu",100721));
		l.add(new Employee1("Shilpa",100121));
		l.add(new Employee1("Sriram",100099));
		l.add(new Employee1("Amit",100055));
		
		System.out.println("Before ordering: "+l);
		
//		Sort on the basis of the employee name
		
		Comparator<Employee1>cmp=(e1,e2)->(e1.name.compareTo(e2.name)<0)?-1:(e1.name.compareTo(e2.name)>0)?1:0;
		
		Collections.sort(l,cmp);
		System.out.println("After order on the basis of name:"+l);
	}
	
}
