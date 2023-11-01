package staticmethodininterface;

interface Interf{
	
	public static void m1() {
		
		System.out.println("Interface static method");
	}
	
	public static int add(int a, int b) {
		
		return a+b;
	}
}
public class Demo1 {

	public static void main(String[] args) {
		
		Interf.m1();
		System.out.println(Interf.add(5, 3));
	}
}
