package Baekjoon._3_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_4_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int s = Integer.parseInt(br.readLine()); // 몇개의 정수를 작성할지
        int arr[] = new int[s]; //배열
        int b = Integer.parseInt(br.readLine());
        int c = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = b;

            if (s == b) {
                c++;
            }
        }
        System.out.print(c);
        br.close();
    }
}
