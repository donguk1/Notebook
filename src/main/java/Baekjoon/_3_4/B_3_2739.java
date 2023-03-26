package Baekjoon._3_4;

import java.util.Scanner;

public class B_3_2739 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, result;
        a = s.nextInt();

        for (b = 1; b <= 9; b++) {
            result = a * b;
            System.out.printf("%d * %d = %d \n",a ,b, result);
        }
    }
}
