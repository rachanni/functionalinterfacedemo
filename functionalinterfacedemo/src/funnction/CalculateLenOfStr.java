package funnction;

import java.util.function.Function;

public class CalculateLenOfStr {

	public static void main(String[] args) {
		
		Function<String,Integer>f=s->s.length();
		String[] s = { "Nag", "Chiranjeevi", "Venkatesth", "Balaiah", "Sunny", "Katrina" };
		
		for(String x:s) {
			
			System.out.println(f.apply(x));
		}
	}
}
