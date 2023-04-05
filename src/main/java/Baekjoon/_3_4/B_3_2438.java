package Baekjoon._3_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_3_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String s = "*";
        for (int i = 0; i < a; i++) {
            System.out.println(s);
            s += "*";

        }
    }
}
