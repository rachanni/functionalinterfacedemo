package supplier;

import java.util.function.Supplier;

public class SupplyOTPAsInt {

	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		Supplier<Integer>s=()->{
			int otp=0;
			
			for(int i=0;i<6;i++) {
				otp=otp*10+(int)(Math.random()*10);
			}
			return otp;
		};
		long endTime=System.currentTimeMillis();
		long timeElapsed=endTime-startTime;
		for(int i=0;i<1000;i++) {
		System.out.println(s.get());
		}
		System.out.println(timeElapsed);
	}
}
