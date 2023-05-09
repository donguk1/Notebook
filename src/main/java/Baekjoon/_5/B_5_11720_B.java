package Baekjoon._5;

import java.io.*;

public class B_5_11720_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] str = br.readLine().split("");
//        입력값을 split("") 으로 한글자 단위로 문자열 형식의 배열에 입력

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(str[i]);
//            Integer.parseInt()로 문자형식을 정수형으로 변환
        }
        bw.write(String.valueOf(sum));
//        String.valueOf()로 정수형을 문자형으로 변환

        br.close();
        bw.flush();
        bw.close();
    }
}