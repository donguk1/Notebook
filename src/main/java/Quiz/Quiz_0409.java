package Quiz;

import java.util.Scanner;

public class Quiz_0409 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int []arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    i--;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
