package functionalinterfacedemo;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

class Employee{
	
	String name;
	Integer emp_id;
	
	public Employee(String name,int emp_id) {
		
		this.name=name;
		this.emp_id=emp_id;
	}

	@Override
	public String toString() {
		return "name=" + name + " emp_id=" + emp_id ;
	}
	
	
	
}
public class ImplementingComparartorDemo {

	public static void main(String[] args) {
		
		ArrayList<Employee>l=new ArrayList<>();
		l.add(new Employee("Ravi",100525));
		l.add(new Employee("Golu",100721));
		l.add(new Employee("Shilpa",100121));
		l.add(new Employee("Sriram",100099));
		l.add(new Employee("Amit",100055));
		
		System.out.println("Before ordering: "+l);
		
		
//		Ascending order on the basis of emp_id
		Comparator<Employee> cmp=(e1,e2)->
			
			(e1.emp_id<e2.emp_id)?-1:(e1.emp_id>e2.emp_id)?1:0;
			
			Collections.sort(l,cmp);
			
			System.out.println("After ordering: "+l);
		
	}
	
}
