package java_fundamentals;
import java.util.*;
import java.util.Scanner;
public class question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     char ch=sc.next().charAt(0);
     if(ch>='A' && ch<='Z') {
    	 char ch1=Character.toLowerCase(ch);
    	 System.out.println(ch+"->"+ch1);
     }
     else if(ch>='a' && ch<='z') {
    	 char ch1=Character.toUpperCase(ch);
    	 System.out.println(ch+"->"+ch1);
     }
     else {
    	 System.out.println(" ");
     }
	}

}
