package Arrays;

import java.util.*;

public class Question04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		char ch[] = new char[n];
		for (int i = 0; i < n; i++) {
			ch[i] = (char)arr[i];
			System.out.print(ch[i] + " ");
		}
		// System.out.println(arr);

	}

}
