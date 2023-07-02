package Baekjoon._6;

import java.util.Scanner;

public class B_6_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int j = str.length();

        for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(j - i - 1)) {
                    System.out.println("0");
                    return;
                }

        }
        System.out.println("1");
    }
}
