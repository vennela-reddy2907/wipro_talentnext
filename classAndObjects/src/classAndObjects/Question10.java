package classAndObjects;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n=sc.nextInt();
		String sub =s.length()>=2? s.substring(0, 2):s;
		String t="";
		
		for(int i=0;i<n;i++) {
			t+=sub;
		}
		System.out.println(t);
	}

}
