package classAndObjects;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.next();
StringBuilder sb=new StringBuilder();
int n=s.length();
for(int i=0;i<n;i++) {
	
	char c=s.charAt(i);
	if(c=='*') {
		if(sb.length()>0) {
			sb.deleteCharAt(sb.length()-1);
		}
		i++;
	}else {
		sb.append(s.charAt(i));
	}

	}
System.out.println(sb.toString());
	}

}
