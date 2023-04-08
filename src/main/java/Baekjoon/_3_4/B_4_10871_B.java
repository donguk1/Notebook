package Baekjoon._3_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class B_4_10871_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");    //토큰화

        int a = Integer.parseInt(st.nextToken());        //배열의 크기
        int arr[] = new int[a];
        int b = Integer.parseInt(st.nextToken());        //비교할 수
        //int x = Integer.parseInt(br.readLine());        //배열에 입력할 변수

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int j = 0; j < arr.length; j++) {

            if (arr[j] < b) {
                System.out.print(arr[j] + " ");
            }
        }
        br.close();
    }
}