package lambdaexpwrtfunctionalinterface;

interface interf1{
	
	public void m1();
}
public class Test1 {

	public static void main(String[] args) {
		
		interf1 i=()->System.out.println("Hello");
		i.m1();
	}
}
