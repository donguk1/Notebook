package Baekjoon._3_4;

import java.util.Scanner;

public class B_4_2562_S {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int []arr = new int[9];

        int max = 0;
        int b = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < 9; i++) {
            if (max < arr[i]) {
                max = arr[i];
                b = i+1;
            }
        }
        System.out.print(max + "\n" + b);



    }
}
