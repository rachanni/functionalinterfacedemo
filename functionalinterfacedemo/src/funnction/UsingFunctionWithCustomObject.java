package funnction;
import java.util.function.Function;
import java.util.ArrayList;

class Student{
	
	String name;
	int marks;
	
	Student(String name,int marks){
		
		this.name=name;
		this.marks=marks;
	}
}
public class UsingFunctionWithCustomObject {

	public static void main(String[] args) {
		
		Function<Student,String>f=s->{
			
			/*
			 * marks>=80 - A, marks>=60 -B, marks>=50 -C marks>=35 - D, marks<35 -E
			 */
			String grade="";
			int marks=s.marks;
			
			if(marks>=80) {
				grade= "A";
			}else if(marks>=60) {
				grade= "B";
			}else if(marks>=50) {
				grade= "C";
			}else if(marks >=35) {
				grade= "D";
			}else {
				grade= "E";
			}
			return grade;
		};
		
		ArrayList<Student>l=new ArrayList<>();
		l.add(new Student("Durga",100));
		l.add(new Student("Sunny",65));
		l.add(new Student("Bunny",55));
		l.add(new Student("Chinny",45));
		l.add(new Student("Vinny",25));
		
		for(Student x:l) {
			System.out.println(f.apply(x));
		}
	}
}
