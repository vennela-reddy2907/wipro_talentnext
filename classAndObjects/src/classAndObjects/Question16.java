package classAndObjects;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String a=sc.next();
String b=sc.next();
StringBuilder sb=new StringBuilder();
int la=a.length();
int lb=b.length();
int max=Math.max(la, lb);
for(int i=0;i<max;i++) {
	
if(i<la) {
	sb.append(a.charAt(i));
}
if(i<lb) {
	sb.append(b.charAt(i));
}}
System.out.println(sb.toString());
	}

}
