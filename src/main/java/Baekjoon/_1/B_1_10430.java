package Baekjoon._1;

import java.util.Scanner;

public class B_1_10430 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();

        System.out.println((A + B) % C);
        System.out.println(((A % C) + (B % C)) % C);
        System.out.println((A * B)% C);
        System.out.println(((A % C) * (B % C)) % C);

    }
}

