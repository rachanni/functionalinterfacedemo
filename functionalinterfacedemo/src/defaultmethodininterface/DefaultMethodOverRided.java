package defaultmethodininterface;

interface Interf1{
	
	default void m1() {
		
		System.out.println("Default method");
	}
}
public class DefaultMethodOverRided implements Interf1{

//	overridinf default method
	
	public void m1() {
		
		System.out.println("Default method is over rided");
	}
	public static void main(String[] args) {
		
		DefaultMethodOverRided d=new DefaultMethodOverRided();
		d.m1();
	}
}
