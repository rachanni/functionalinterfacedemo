package funnction;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;

class Student2 {

	String name;
	int marks;

	Student2(String name, int marks) {

		this.name = name;
		this.marks = marks;
	}
}

public class CustomObjectUsingTerniary {

	public static void main(String[] args) {

//		Writting a predicate to filter student having marks greater than 60
//		conditional checking >60 true else false
		
		Predicate<Student2> p = s -> s.marks > 60;
		
		
		


//		Taking Student as parameter(Input type - Student) doing some operation then returning 
//		grade(return type - String)
		
		Function<Student2, String> f = s -> {

			 /*
			 * marks>=80 - A, marks>=60 -B, marks>=50 -C marks>=35 - D, marks<35 -E
			 * 
			 * Use terniary operator
			 */
			String grade = "";
			int marks = s.marks;

			grade=(marks>=80)?"A[Distinction]":(marks>=60)?"B[First Class]":(marks>=50)?"C[Second Class]":(marks>=35)?"D[Third Class]":"E[Failed]";
			return grade;
		};
		
//		Taking input type Student and printing 
		Consumer<Student2>c=s->System.out.println("name - "+s.name+" "+"marks - "+s.marks+" "+"grade - "+f.apply(s));

		ArrayList<Student2> l = new ArrayList<>();
		l.add(new Student2("Durga", 100));
		l.add(new Student2("Sunny", 65));
		l.add(new Student2("Bunny", 55));
		l.add(new Student2("Chinny", 45));
		l.add(new Student2("Vinny", 25));
		l.add(new Student2("Pinny",99));

		for (Student2 x : l) {
			if (p.test(x)) {
				c.accept(x);
			}
		}
	}
}
