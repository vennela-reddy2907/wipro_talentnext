package classAndObjects;

public class Calculator {
   static int powerInt(int num1,int num2) {
	   return (int)Math.pow(num1,num2);
   }
   static double powerDouble(double num1,int num2) {
	    return Math.pow(num1, num2);
   }
}
class Second{
	public static void main(String[] args) {
		int l1=Calculator.powerInt(2,3);
		System.out.println(l1);
		double l2=Calculator.powerDouble(3.1,2);
		System.out.println(l2);
		
	
}

}
