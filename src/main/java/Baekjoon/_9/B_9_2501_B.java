package Baekjoon._9;

import java.io.*;
import java.util.StringTokenizer;

public class B_9_2501_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
//        a는 반복 횟수를 위한 값
        int a = 1;
        int i = 0;

        while (true) {
//            약수의 수를  찾을 if문
            if (n % a == 0) {
                i++;
//            k번째 약수를 찾았을 경우 몇번째 값을 반환하고 반복문 탈출
                if (k == i) {
                    i = a;
                    bw.write(String.valueOf(i));
                    break;
                }
            }
//            n ~ 0 까지 비교 했는데도 불구하고 k번째 약수가 존재하지 않을시
//            0을 출력하고 반복문 탈출
            if (a == n) {
                bw.write(String.valueOf("0"));
                break;
            }
            a++;
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
