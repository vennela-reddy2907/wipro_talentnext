package java_fundamentals;
import java.util.*;
public class question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     char c=sc.next().toUpperCase().charAt(0);
     if(c=='R') {
    	 System.out.println(c+"->Red");
     }
     else  if(c=='B') {
    	 System.out.println(c+"->Blue");
     }
     else  if(c=='G') {
    	 System.out.println(c+"->Green");
     }
     else  if(c=='O') {
    	 System.out.println(c+"->Orange");
     }
     else  if(c=='Y') {
    	 System.out.println(c+"->yellow");
     }
     else  if(c=='W') {
    	 System.out.println(c+"->White");
     }
     else {
    	 System.out.println("Invalid code");
     }
	}

}
