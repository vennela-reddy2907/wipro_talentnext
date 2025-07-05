package java_fundamentals;
import java.util.*;
public class question07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    char a=sc.next().charAt(0);
    char b=sc.next().charAt(0);
    if((int)a>(int)b) {
    	System.out.println(b+" "+a);
    }
    else {
    	System.out.println(a+" "+b);
    }
	}

}
