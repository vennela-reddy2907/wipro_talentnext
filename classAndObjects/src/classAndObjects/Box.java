package classAndObjects;
import java.util.*;
public class Box {
     int w;
     int h;
     int d;
     public Box(int w,int h,int d) {
    	 this.w=w;
    	 this.h=h;
    	 this.d=d;
     }
     public int volume() {
    	 int v=w*h*d;
    	 return v;
     }
	
	

}class second{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt();
		int h=sc.nextInt();
		int d=sc.nextInt();
		Box box1=new Box(w,h,d);
		int r=box1.volume();
		System.out.println(r);
	}
}
