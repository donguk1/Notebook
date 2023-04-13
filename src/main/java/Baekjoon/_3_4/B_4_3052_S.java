package Baekjoon._3_4;

import java.util.Scanner;

public class B_4_3052_S {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int []arr = new int[10];
        int []acc = new int[10];
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
            acc[i] = arr[i] % 42;
            System.out.print(acc[i]);
        }
        for (int i = 0; i < 1; i++) {
            a++;
            for (int j = 0; j < acc.length; j++) {
                if (acc[i] != acc[j]) {
                    a++;
                }
            }
        }
        System.out.print(a);
    }
}
