package supplier;
import java.time.LocalDateTime;

import java.util.function.Supplier;

public class Demo {

	public static void main(String[] args) {
		
		Supplier<LocalDateTime>s=()->LocalDateTime.now();
		System.out.println(s.get());
	}
}
