package classAndObjects;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int l=s.length();
int h=l/2;
if(l%2==0) {
	System.out.println(s.substring(0,h));
}
else {
	System.out.println("null");
}
	}

}
