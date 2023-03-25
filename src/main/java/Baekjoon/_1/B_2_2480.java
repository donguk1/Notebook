package Baekjoon._1;

import java.util.Scanner;

public class B_2_2480 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if (a != b && b != c && a != c) {//모든 변수가 다른 경우
            int m;
            if (a > b) {//a가 b보다 큰 경우
                if (c > a) {//c가 a보다 큰 경우
                    m = c;
                }
                else//c가 a보다 크지 못함
                    m = a;

            }
            else {//a가 b보다 작음(
                if (c > b) {//c가 b보다 큰 경우
                    m = c;
                }
                else//b가 c보다 큰 경우
                    m = b;
            }
            System.out.println(m * 100);
        }
        else {//최소 2개의 변수가 중복 되는 경우
            if (a == b && b == c) {//모든 변수가 같은 경우
                System.out.println(10000 + a * 1000);
            }
            else {//모든 변수가 같지 않은 경우 => 2개의 변수는 같은 경우
                if (a == b || a == c) {//a가 b혹은 c와 같은 경우
                    System.out.println(1000 + a * 100);
                }
                else {//a를 제외한 다른 두 변수는 같은 경우
                    System.out.println(1000 + b * 100);
                }

            }
        }
    }
}
