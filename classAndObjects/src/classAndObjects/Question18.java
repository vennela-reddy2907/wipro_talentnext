package classAndObjects;

import java.util.*;
import java.util.StringJoiner;

public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
StringJoiner sj=new StringJoiner(",","{","}");
      ArrayList <String> li=new ArrayList <>();
      for(int i=0;i<n;i++) {
    	  li.add(sc.next());
    	  sj.add(li.get(i));
      }
      System.out.print(sj);
      
	}

}
