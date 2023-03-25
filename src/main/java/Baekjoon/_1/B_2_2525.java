package Baekjoon._1;

import java.util.Scanner;

public class B_2_2525 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int h = s.nextInt();
        int m = s.nextInt();
        int r = s.nextInt();

        h += r / 60;
        m += r % 60;

        if (m >= 60) {
            h++;
            m -= 60;
        }
        if (h > 23) {
            h -= 24;
        }
        System.out.println(h + " " + m);

    }
}
