package Baekjoon._1;

import java.util.Scanner;

public class B_1_1008 {
    public static void main(String[] args) {
        int a, b;
        double result;

        Scanner s = new Scanner(System.in);

        a = s.nextInt();
        b = s.nextInt();

        result = (double) a / b;

        System.out.println(result);
    }
}