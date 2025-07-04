package java_fundamentals;
import java.util.*;
public class question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    char vc=sc.next().charAt(0);
    if((vc>='a' && vc <='z') ||(vc>='A' && vc<='Z')){
    	System.out.println("Alphabet");
    }
    else if(vc>='0' && vc<='9'){
    	System.out.println("Number");
    }
    else {
    	System.out.println("Special character");
    	
    }
	}

}
