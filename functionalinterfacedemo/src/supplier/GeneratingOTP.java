package supplier;

import java.util.function.Supplier;

/*
 * 
here we are returning otp as String 
write another program to return otp as int
*/
public class GeneratingOTP {

	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		Supplier<String>s=()->{
			String otp="";
			for(int i=0;i<6;i++) {
				otp=otp+(int)(Math.random()*10);
				
			}
			return otp;
		};
		long endTime=System.currentTimeMillis();
		long timeElapsed=endTime-startTime;
		for(int i=0;i<10000000;i++) {
		System.out.println(s.get());
		}
		System.out.println("==================");
		System.out.println(timeElapsed);
	}
}
