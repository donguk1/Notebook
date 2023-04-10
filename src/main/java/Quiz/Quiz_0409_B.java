package Quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz_0409_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());   //배열의 크기를 위한 변수
        int []arr = new int[n];                     //배열 선언

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i <arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());  //배열에 들어갈 수 입력
            for (int j = 0; j < i; j++) {
                if ( arr[i] == arr[j]) {                //중복 제거
                    i--;                                //중복시 다시 작성
                }
            }
        }
        br.close();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {      //배열의 다른 위치와 비교 하기 위한 반복문
                if (arr[i] < arr[j]) {                  //배열 정렬
                    int a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
