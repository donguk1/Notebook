package Baekjoon._3_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_4_2562_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int []arr = new int[9];
        int max = 0;
        int b = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        for (int i = 0; i < 9; i++) {
            if (max < arr[i]) {
                max = arr[i];
                b = i+1;
            }
        }
        System.out.println(max + "\n" + b);
    }
}
