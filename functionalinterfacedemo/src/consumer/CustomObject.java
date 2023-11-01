package consumer;

import java.util.ArrayList;
import java.util.function.Consumer;



class Student {

	String name;
	int marks;

	Student(String name, int marks) {

		this.name = name;
		this.marks = marks;
	}
}
public class CustomObject {

	public static void main(String[] args) {
		
		Consumer<Student>c=s->System.out.println(s.name+" "+s.marks);
		
		ArrayList<Student> l = new ArrayList<>();
		l.add(new Student("Durga", 100));
		l.add(new Student("Sunny", 65));
		l.add(new Student("Bunny", 55));
		l.add(new Student("Chinny", 45));
		l.add(new Student("Vinny", 25));
		l.add(new Student("Pinny",99));
		
		for(Student x:l) {
			
			c.accept(x);
		}
	}
}
