package Baekjoon._3_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_3_10952_F {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for ( ; ; ) {

            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());

            System.out.println(a+b);

            if ((a == 0) && (b == 0)){
                break;
            }
        }


        br.close();
    }
}
