package classAndObjects;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.next();
int n=sc.nextInt();
int l=s.length();
if(n<l) {
s=s.substring(l-n,l);
}
String s1="";
for(int i=0;i<n;i++) {
	s1+=s;
}
System.out.println(s1);
	}

}
