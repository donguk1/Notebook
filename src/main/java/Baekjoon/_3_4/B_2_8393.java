package Baekjoon._3_4;

import java.util.Scanner;

public class B_2_8393 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int a = 0;

        for (int i = 1; i <= n; i++) {
            a = a + i;
        }
        System.out.println(a);
    }
}
