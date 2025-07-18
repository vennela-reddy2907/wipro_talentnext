package AbsractClasses;
import java.util.*;
abstract class Compartment
{

	public abstract String notice();

}

class FirstClass extends Compartment {
	public String notice() {
		return "First class";
	}



}

class Ladies extends Compartment {

	@Override
	 public String notice() {
		return "Ladies class";

	}

}

class Luggage extends Compartment {

	@Override
	 public String notice() {
		return "Luggage class";

	}

}

class General extends Compartment {

	@Override
	 public String notice() {
		return "General class";

	}

}

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Compartment[] Cmpt=new Compartment[10];
		 for(int i=0;i<Cmpt.length;i++) {
			 int rtype=(int)(Math.random()*4)+1;
			 if(rtype==1) {
				 FirstClass fc=new FirstClass();
				 Cmpt[i]=fc;
			 }
			 else if(rtype==2) {
				Ladies l=new Ladies();
				 Cmpt[i]=l;
			 }
			 else if(rtype==3) {
					Luggage lg=new Luggage();
					 Cmpt[i]=lg;
				 }
			 else {
				 General g=new General();
				 Cmpt[i]=g;
			 }
			 
		 }
		 for(int i=0;i<Cmpt.length;i++) {
			 System.out.println("Compartment"+ (i+1)+" : "+Cmpt[i].notice());
		 }
	}

}
