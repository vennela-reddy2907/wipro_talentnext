package Arrays;

import java.util.Scanner;

public class ArrayProject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
      int[] EmpNo= {1001,1002,1003,1004,1005,1006,1007};
      String[] EmpName= {"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
      String[] Dept= {"R&D","PM","Acct","Front Desk","Engg","Manufacturinng","PM"};
      char[] dgCode= {'e','c','k','r','m','e','c'};
      int[] Basic= {20000,30000,10000,12000,50000,23000,29000};
      int[] HRA= {8000,12000,8000,6000,20000,9000,12000};
//      int[] DA= {20000,32000,12000,15000,40000};
      int[] It= {3000,9000,1000,2000,20000,4400,10000};
      int empid=sc.nextInt();
      boolean found=false;
      for(int i=0;i<EmpNo.length;i++){
    	if(empid==EmpNo[i]) {
    		found=true;
    		String dsign=" ";
    		int da=0;
    		switch(dgCode[i]) {
    		case 'e' :
    			dsign="Engineer";
    			da=20000;
    			break;
    		case 'c' :
    			dsign="Consultant";
    			da=32000;
    			break;
    		case 'k' :
    			dsign="Clerk";
    			da=12000;
    			break;
    		case 'r' :
    			dsign="Receptionist";
    			da=15000;
    			break;
    		case 'm' :
    			dsign="Manager";
    			da=40000;
    			break;
    			
    		}
    		int sal=Basic[i]+HRA[i]+da-It[i];
    		System.out.println("Emp No\t Emp Name\tDepartment\tDeignation\tSalary");
    		System.out.println(EmpNo[i] + "\t" + EmpName[i] + "\t\t" + Dept[i] + "\t "+ dsign + "\t"+sal);
    	}
      }
      if(!found) {
    	  System.out.println("There is no employee with empid: "+empid);
      }
	}

}
