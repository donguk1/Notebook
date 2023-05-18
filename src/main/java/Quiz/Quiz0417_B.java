package Quiz;

import java.io.*;
import java.util.StringTokenizer;

public class Quiz0417_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();

        int[] aa = new int[5];
        int n = 5;
//        bb 배열의 크기를 위한 변수


        boolean bn;
//        참거짓 확인을 위한 boolean 선언

        for (int i = 0; i < 5; i++) {
            aa[i] = Integer.parseInt(st.nextToken());
            for (int j = 0; j < i; j++) {
//                입력시 마다 중복을 확인하고 중복일 경우 b 값이 1씩 감소
                if (aa[i] == aa[j]) {
                    n--;
                }
            }
        }
        int[] bb = new int[n];



        int b = 0;
//        bb 배열에 값을 입력하기 위한 변수

        for (int i = 0; i < aa.length; i++) {
            bn = true;
            for (int j = 0; j < i; j++) {
                if (aa[i] == aa[j]) {
//                    중복된 값이면 boolean 값을 false 로 변경하고 j 반복문 탈출  false 로 변경
//                    중복 확인을 확인을 위한 중첩된 반복문 안에 있는 if문
                    bn = false;
                    break;
                }
            }
            if (bn) {
//                bw.write(aa[i] + " ");  저장할 값 확인
//                위 반복문에서 boolean 값이 false 로 변경되지 않았으면 실행 하여
//                bb 반복문에 입력하고 bb 배열 index\값을 맡아줄 b값을 증가
                bb[b] = aa[i];
                b++;
            }

        }

        bw.write("중복되어 저장된 값은 ");

        for (int i = 0; i < n; i++) {
//            bb 배열의 0 ~ n 까지 출력하면서 출력시 마다 공백
            bw.write(bb[i] + " ");
        }
        bw.write("입니다.");

        bw.flush();
        bw.close();
    }
}