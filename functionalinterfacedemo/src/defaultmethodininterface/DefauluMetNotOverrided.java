package defaultmethodininterface;

interface Interf{
	
	default void m1() {
		
		System.out.println("Default Method");
	}
}

public class DefauluMetNotOverrided implements Interf{

	
	
	public static void main(String[] args) {
		
		DefauluMetNotOverrided d=new DefauluMetNotOverrided();
		d.m1();
	}
}
