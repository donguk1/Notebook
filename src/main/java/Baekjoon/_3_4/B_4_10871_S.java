package Baekjoon._3_4;

import java.util.Scanner;

public class B_4_10871_S {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();        //배열의 크기
        int arr[] = new int [n];    //배열
        int x = s.nextInt();        //비교 하기 위한 수
        //int a = s.nextInt();        //배열에 입력할 변수

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();             //배열의 자리에 변수 입력
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < x) {
                System.out.print(arr[j]+" ");

            }

        }

    }
}