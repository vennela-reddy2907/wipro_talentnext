package classAndObjects;
import java.util.*;
class Person{
	String name;
	  Person(String name) {
		this.name=name;
	}
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name=name;
	 }
}
 class Employee extends Person{
	double annualSalary;
	int year;
	String insuranceNo;
	Employee(String name,double annualSalary,int year,String insuranceNo){
		super(name);
		this.annualSalary=annualSalary;
		this.year=year;
		this.insuranceNo=insuranceNo;
	}
	 public double getAnnualSalary() {
		 return annualSalary;
	 }
	 public void setAnnualSalary(double annualSalary) {
		 this.annualSalary=annualSalary;
	 }
	 public int getYear() {
		 return year;
	 }
	 public void setYear(int year) {
		 this.year=year;
	 }
	 public String getInsuranceNo() {
		 return insuranceNo;
	 }
	 public void setInsuranceNo(String insuranceNo) {
		 this.insuranceNo=insuranceNo;
	 }
}

public class TestEmployee{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		double annualSalary=sc.nextDouble();
		int year=sc.nextInt();
		sc.nextLine();
		String InsuranceNo=sc.nextLine();
		Employee emp=new Employee(name,annualSalary,year,InsuranceNo);
		System.out.println("name: "+emp.getName());
		System.out.println("annualSalary: "+emp.getAnnualSalary());
		System.out.println("year: "+emp.getYear());
		System.out.println("InsuranceNo: "+emp.getInsuranceNo());
	}

}
