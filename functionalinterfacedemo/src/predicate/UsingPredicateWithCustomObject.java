package predicate;


import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {

	String name;
	double salary;
	boolean isHavingGf;

	Employee(String name, double salary, boolean isHavingGf) {

		this.name = name;
		this.salary=salary;
		this.isHavingGf = isHavingGf;
	}

	@Override
	public String toString() {
		return  name ;
	}
	
	
}

public class UsingPredicateWithCustomObject {

	public static void main(String[] args) {

		
		Predicate<Employee> p = e -> (e.salary > 10000) && (e.isHavingGf == true);

		ArrayList<Employee> l = new ArrayList<>();

		l.add(new Employee("Ravi", 5000, false));
		l.add(new Employee("Gulshan", 700000, true));
		l.add(new Employee("Chonar", 5000000, false));
		l.add(new Employee("Foanr", 10001, true));
		l.add(new Employee("Goanr", 5000, false));
		l.add(new Employee("Sonar", 700, true));
		l.add(new Employee("Tonar", 5000, false));
		l.add(new Employee("Konar", 7, true));

		for (Employee x : l) {
			if (p.test(x)) {
				System.out.println(x+":"+"Have fun!");
			} else {
				System.out.println(x+":"+"Work hard!");
			}

		}
	}
}
