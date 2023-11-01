package lambdaexpwrtfunctionalinterface;

//Writting a separate class to implement interface
//then creating an object of that class to call the method implemnted in class

interface interf{
	
	public void m1();
}

class Demo implements interf{
	
	public void m1() {
		
		System.out.println("Hello");
	}
}

public class Test {

	public static void main(String[] args) {
		
//		Object is of type Demo
//		Reference is of Demo
		Demo d =new Demo();
		d.m1();
		
		System.out.println("===============");
		
//		Object is of Demo 
//		Refrence is of interf so Parent can hold child object
//		Rememeber thsi valid and is very important
		interf i=new Demo();
		i.m1();
		
	}
}
