package revision;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Employee{
	
	String name;
	int id;
	
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return name + ":" + id ;
	}
	
	
}
public class ComparatorCustomObject {

	public static void main(String[] args) {
		
		ArrayList<Employee>l=new ArrayList<>();
		l.add(new Employee(100525,"Ravi"));
		l.add(new Employee(100721,"Golu"));
		l.add(new Employee(100121,"Shilpa"));
		l.add(new Employee(100099,"Sri Ram"));
		l.add(new Employee(100055,"Amit Raj"));
		System.out.println(l);
		
		Comparator<Employee>cmp=(e1,e2)->(e1.id<e2.id)?-1:(e1.id>e2.id)?1:0;
		Comparator<Employee>cmp1=(e1,e2)->(e1.name.compareTo(e2.name));
		Comparator<Employee>cmp2=(e1,e2)->(e1.name.compareTo(e2.name)>0)?-1:(e1.name.compareTo(e2.name)<0)?1:0;
		Collections.sort(l,cmp2);
//		Collections.sort(l,cmp);
//		Collections.sort(l,cmp1);
//		System.out.println(l);
		Collections.sort(l,cmp2);
		System.out.println(l);
	}
}
