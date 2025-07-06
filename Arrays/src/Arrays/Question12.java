package Arrays;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int arr2[] = new int[n2];
		int arr1[] = new int[n1];
		for (int i = 0; i < n1; i++) {
			arr1[i] = sc.nextInt();
		}
		for(int i=0;i<n2;i++) {
			arr2[i]=sc.nextInt();
		}
		int m1=arr1.length/2;
		int m2=arr2.length/2;
		int arr3[]=new int[2];
		arr3[0]=arr1[m1];
		arr3[1]=arr2[m2];
		
		
			System.out.print(arr3[0]+" ");
			System.out.print(arr3[1]+" ");
		
	}

}
