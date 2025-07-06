package Arrays;

import java.util.*;

public class Question08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int n = sc.nextInt();
        int[] arr = new int[n];

        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] == 6) {
                
                int j;
                for (j = i + 1; j < n; j++) {
                    if (arr[j] == 7) {
                        break;
                    }
                }

                if (j < n && arr[j] == 7) {
                    
                    i = j; 
                } else {
                    
                    sum += arr[i];
                }

            } else {
                sum += arr[i];
            }
        }

        System.out.println("Sum = " + sum);
    }
}
