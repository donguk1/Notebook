package Baekjoon._1;

import java.util.Scanner;

public class B_2_2884 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int h = s.nextInt();
        int m = s.nextInt();

        if (m < 45) { //45분 미만일 경우
            h--; //1시간 줄이기
            m = 60 - (45 - m);
            if (h < 0) { //현재 0시일 경우
                h = 23;
            }
            System.out.println(h + " " + m);

        } else {
            System.out.println(h + " " + (m - 45));
        }
    }
}
