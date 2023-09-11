package Baekjoon._13;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;

public class B_13_2751_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        입력 방식 버퍼리더

        int n = Integer.parseInt(br.readLine());
//        입력 받을 횟수

        LinkedList<Integer> lli = new LinkedList<>();
//
        StringBuilder sb = new StringBuilder();
//        스트링빌더 : 내가 원하는 인자로

        for (int i = 0; i < n; i++) {
            lli.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(lli);
        for (int value :
                lli) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
//        bw.write(String.valueOf(sb));
        br.close();
//        bw.flush();
//        bw.close();


    }
}
