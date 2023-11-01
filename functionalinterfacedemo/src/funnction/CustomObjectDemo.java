package funnction;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

/*
     Disply the name of only those students 
     whose marks are greater than 60
     
     Condition Checking -> greater than 60 -> true else false
     So write a predicate

*/
class Student1 {

	String name;
	int marks;

	Student1(String name, int marks) {

		this.name = name;
		this.marks = marks;
	}
}

public class CustomObjectDemo {

	public static void main(String[] args) {

		Predicate<Student1> p = s -> s.marks > 60;

		Function<Student1, String> f = s -> {

			/*
			 * marks>=80 - A, marks>=60 -B, marks>=50 -C marks>=35 - D, marks<35 -E
			 */
			String grade = "";
			int marks = s.marks;

			if (marks >= 80) {
				grade = "A";
			} else if (marks >= 60) {
				grade = "B";
			} else if (marks >= 50) {
				grade = "C";
			} else if (marks >= 35) {
				grade = "D";
			} else {
				grade = "E";
			}
			return grade;
		};

		ArrayList<Student1> l = new ArrayList<>();
		l.add(new Student1("Durga", 100));
		l.add(new Student1("Sunny", 65));
		l.add(new Student1("Bunny", 55));
		l.add(new Student1("Chinny", 45));
		l.add(new Student1("Vinny", 25));
		l.add(new Student1("Pinny",99));

		for (Student1 x : l) {
			if (p.test(x)) {
				System.out.println(f.apply(x));
			}
		}
	}
}
