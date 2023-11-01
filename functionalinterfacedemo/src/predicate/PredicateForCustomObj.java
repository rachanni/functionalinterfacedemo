package predicate;
import java.util.function.Predicate;
import java.util.ArrayList;
//write a predicate to find all the employee whose slary is greater than 5000
class Employee1{
	
	String name;
	double salary;
	
	Employee1(String name,double salary){
		
		this.name=name;
		this.salary=salary;
	}

	
}
public class PredicateForCustomObj {

	public static void main(String[] args) {
		
		Predicate<Employee1>p=e->e.salary>3000;
		
		ArrayList<Employee1>l=new ArrayList<>();
		l.add(new Employee1("Durga",1000));
		l.add(new Employee1("Ravi",2000));
		l.add(new Employee1("Shiva",3000));
		l.add(new Employee1("Mahesh",4000));
		l.add(new Employee1("Adarsh",5000));
		l.add(new Employee1("Sagar",6000));
		
		for(Employee1 x:l) {
			if(p.test(x)) {
				System.out.println(x.name+" "+x.salary);
			}
		}
		
		
	}
}
