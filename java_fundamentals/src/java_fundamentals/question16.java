package java_fundamentals;

import java.util.Scanner;
public class question16 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    String s=Integer.toString(n);
    for(int i=0;i<s.length();i++) {
    	char c=s.charAt(i);
    	sum+=c-'0';
    }
    System.out.println(sum);

	}
	
}
