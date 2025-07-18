package classAndObjects;
import java.util.*;
public class Question22 {
String a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
          Question22 q=new Question22();
          Optional<String>op=Optional.ofNullable(q.a);
          System.out.println(op.orElseThrow(InvalidEmployeeException::new));
	}

}
class InvalidEmployeeException extends RuntimeException {
    public InvalidEmployeeException() {
        super("Invalid employee: value is null");
    }
}
