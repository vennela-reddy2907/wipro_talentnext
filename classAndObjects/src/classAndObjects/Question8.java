package classAndObjects;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
	  String s=sc.nextLine();
	  String rev="";
	  int l=s.length();
	  
  for(int i=l-1;i>=0;i--) {
	  rev+=s.charAt(i);
  }
  if(s.equals(rev)) {
	  System.out.println("Palindrome");
  }
  else {
	  System.out.println("Not a palindrome");
  }
	}

}
