package Arrays;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tar = sc.nextInt();
		int arr[] = new int[n];
		
		boolean saw = true;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		
		for (int i = 0; i < n; i++) {
			if (arr[i] == tar) {
				System.out.println("found at " + i);

				saw = false;
			}
		}
		if(saw) {
			System.out.println("-1");

		}
	}

}
