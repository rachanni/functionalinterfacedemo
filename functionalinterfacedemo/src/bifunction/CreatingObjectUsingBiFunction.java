package bifunction;
import java.util.function.BiFunction;
import java.util.ArrayList;

class Employee{
	
	int id;
	String name;
	
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	
}
public class CreatingObjectUsingBiFunction {

	public static void main(String[] args) {
		
//		here we are defining a bi-function taking id and name as two param
//		and creating an object of Employee class.
		BiFunction<Integer,String,Employee>f=(id,name)-> new Employee(id,name);
		ArrayList<Employee>l=new ArrayList<>();
		l.add(f.apply(100, "Durga"));
		l.add(f.apply(200, "Ravi"));
		l.add(f.apply(300, "Shiva"));
		l.add(f.apply(400, "Pavan"));
		
		for(Employee e:l) {
			System.out.print("Employee Number: "+e.id+",");
			System.out.print("Employee Name: "+e.name);
			System.out.println();
		}
		

					
	}
}
