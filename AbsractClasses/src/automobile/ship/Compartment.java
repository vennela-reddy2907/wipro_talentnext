package automobile.ship;

import java.util.*;

public class Compartment {
	double ht;
	double wdth;
	double bdth;

	public Compartment(double ht, double wdth, double bdth) {
		this.ht = ht;
		this.wdth = wdth;
		this.bdth = bdth;
		
		
	}
	public void Display() {
		System.out.println("height :"+ht);
		System.out.println("width :"+wdth);
		System.out.println("breadth :"+bdth);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		 Compartment cp=new Compartment(a,b,c);
		 cp.Display();
	}
   
}
