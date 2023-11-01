package funnction;

import java.util.function.Function;

public class ToUpperCase {

	public static void main(String[] args) {
		
		Function<String,String>f=s->s.toUpperCase();
		String[] s = { "Nag", "Chiranjeevi", "Venkatesth", "Balaiah", "Sunny", "Katrina" };
		
		for(String x:s) {
			
			System.out.println(f.apply(x));
		}
	}
}
