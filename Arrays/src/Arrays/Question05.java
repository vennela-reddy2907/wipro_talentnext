package Arrays;

import java.util.*;

public class Question05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        int l=arr.length;
        Arrays.sort(arr);
        int s1=arr[0];
        int s2=arr[1];
        int l2=arr[l-2];
        int l1=arr[l-1];
        System.out.println("Smallest 2 numbers: "+s1+" "+s2);
        System.out.println("largest 2 numbers: "+l2+" "+l1);
	}

}
