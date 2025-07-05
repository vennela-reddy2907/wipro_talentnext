package java_fundamentals;
import java.util.*;
public class question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String n=sc.next();

String sb=new StringBuilder(n).reverse().toString();
if(n.equals(sb)) {
	System.out.println("Palindrome");
}
else {
	System.out.println("Invalid palindrome");
}
	}

}
			