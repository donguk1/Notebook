package Baekjoon._3_4;

import java.util.Scanner;

public class B_3_25304_S {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int n = s.nextInt();

        int a, b;

        for (int i = 0; i < n; i++) {
            a = s.nextInt();
            b = s.nextInt();

            x -= a*b;
        }

        if (x == 0)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
