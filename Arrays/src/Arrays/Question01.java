package Arrays;
import java.util.*;
public class Question01 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int sum=0;
	for(int i=0;i<n;i++) {
		sum+=arr[i];
	}
	float avg=0;
	avg=sum/n;
	System.out.println("sum is :"+sum);
	System.out.println("avg is :"+avg);
}
}
