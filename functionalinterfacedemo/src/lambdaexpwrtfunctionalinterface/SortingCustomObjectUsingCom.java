package lambdaexpwrtfunctionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Sort employee on the basis of id in Ascending order

class Employee{
	
	String name;
	int id;
	
	Employee(String name,int id){
		this.name=name;
		this.id=id;
	}

	@Override
	public String toString() {
		return "name=" + name + " id=" + id ;
	}
	
	
}
public class SortingCustomObjectUsingCom {

	public static void main(String[] args) {
		
		ArrayList<Employee>l=new ArrayList<>();
		
		l.add(new Employee("Ravi",100525));
		l.add(new Employee("Golu",100721));
		l.add(new Employee("Shilpa",100121));
		l.add(new Employee("Shi Ram",100099));
		l.add(new Employee("Amit Raj",100055));
		
		System.out.println("Before sorting: "+l);
		
//		<Employee> ensure parameter is of type Employee
		Comparator<Employee>cmp=(emp1,emp2)->(emp1.id<emp2.id)?-1:(emp1.id>emp2.id)?1:0;
		
		Collections.sort(l,cmp);
		System.out.println("After sorting: "+l);
	}
}
