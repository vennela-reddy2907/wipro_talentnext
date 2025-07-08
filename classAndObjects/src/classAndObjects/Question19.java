package classAndObjects;
import java.util.*;
import java.util.StringJoiner;
public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
      StringJoiner s1=new StringJoiner("-");
      for(int i=0;i<n;i++) {
    	  s1.add(sc.next());
      }
      StringJoiner s2=new StringJoiner("-");
      for(int i=0;i<n1;i++) {
    	  s2.add(sc.next());
      }

      StringJoiner ss1=s1.merge(s2);
      StringJoiner ss2=s2.merge(s2);
      
      System.out.println(ss1);
      System.out.println(ss2);
      }

}
