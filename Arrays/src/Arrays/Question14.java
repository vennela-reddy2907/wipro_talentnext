package Arrays;

import java.util.*;

public class Question14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		

		int[][] arr = new int[n][m];
		int max=0;

		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
				
			}
		}

		
		
		System.out.println("The given array is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " "); 
            }
            System.out.println();
        }

		
		System.out.println("\nThe biggest number in the given array is " + max);

	}

}
