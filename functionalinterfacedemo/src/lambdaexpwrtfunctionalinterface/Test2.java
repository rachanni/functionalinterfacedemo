package lambdaexpwrtfunctionalinterface;

interface Interf2{
	
	int add(int a,int b);
}
public class Test2 {

	public static void main(String[] args) {
		
		Interf2 i=(a,b)->a+b;
		System.out.println(i.add(5, 7));
		
		System.out.println(i.add(7, 14));
	}
}
