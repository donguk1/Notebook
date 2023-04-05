package Baekjoon._3_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_3_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());    //높이 값 입력

        for (int i = 1; i <= a; i++) {              //높이 만큼 반복
            for (int j = a; j > i; j--) {           //높이와 반비례 하는 공백
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {           //높이와 비례 하는 별 입력
                System.out.print("*");
            }
            System.out.println();                   //별 입력 후 줄 넘김
        }


    }
}
