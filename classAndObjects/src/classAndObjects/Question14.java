package classAndObjects;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.next().toLowerCase();
int l=s.length();
//if(s.charAt(0)=='x' || s.charAt(l-1)=='x') {
//	System.out.println(s.substring(1,l-1));
//}
//else {
//	System.out.println(s);
//}
if(s.startsWith("x")) {
	s=s.substring(1);
}
if(s.endsWith("x")) {
	s=s.substring(0,s.length()-1);
}

System.out.println(s);
	}

}
