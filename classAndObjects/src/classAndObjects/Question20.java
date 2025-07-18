package classAndObjects;
import java.util.*;

import java.util.Optional;

public class Question20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Question20 ob = new Question20();
		String names[] = new String[5]; // All elements are initially null
		
		Optional<String> op = Optional.ofNullable(names[0]); // same as ob.names[0], but ob has no names field
		
		if (op.isPresent()) { // Fix: use isPresent(), not ifPresent()
			System.out.print(names[0].length());
		} else {
			System.out.print("Null value");
		}
	}
}
