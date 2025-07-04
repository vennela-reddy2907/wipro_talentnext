package java_fundamentals;
import java.util.*;
public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
   String[] values=s.trim().split("\\s+");
   if(values.length==1 && values[0].isEmpty()) {
	   System.out.println("No Values");
   }
   else {
	   for(int i=0;i<values.length;i++) {
		   System.out.print(values[i]);
		   if(i<values.length-1) {
			   System.out.print(",");
		   }
	   }
   }
    
	}

}
