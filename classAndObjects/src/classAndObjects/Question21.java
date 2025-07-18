package classAndObjects;

import java.util.Optional;

public class Question21 {
	String a ="usa";
	String def = "INDIA";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Question21 q=new Question21();
		Optional<String> op=Optional.ofNullable(q.a);
		System.out.println(op.orElse(q.def));
	}

}
