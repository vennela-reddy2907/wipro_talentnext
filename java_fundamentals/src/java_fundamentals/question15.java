package java_fundamentals;
import java.util.*;
public class question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
// int count=0;
 for(int i=10;i<=99;i++) {
	 if(isPrime(i)) {
		 System.out.println(i);
//		 count++;
	 }
 }
// System.out.println(count);
	}
  public static boolean isPrime(int n) {
	  if(n<2) {
		  return false;
	  }
	  for(int i=2;i<=Math.sqrt(n);i++) {
		  if(n%i==0) {
			  return false;
		  }
		 
	  }
	  return true;
  }
}
