package StudyGroup;

import java.util.Scanner;

public class Jun3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int i, j, x, max = 0, index = 0;

        for (i = 0; i < arr.length; i++) {
            x=s.nextInt();
            arr[i]=x;
        }
        for (j = 0; j <arr.length; j++) {
            if (arr[j] > max) { //만약 이전에 비교한 값보다 크면 실행
                max = arr[j]; //현재 배열의 위치해 있는 값을 max에 비교
                index = j + 1;
            }
        }
        System.out.print(index);
    }
}
