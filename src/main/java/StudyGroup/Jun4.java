package StudyGroup;

import java.util.Scanner;

public class Jun4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int i, j, x;
        int min = arr[0];
        int index = 0;

        for (i = 0; i < arr.length; i++) {
            x=s.nextInt();
            arr[i]=x;
        }
        for (j = 0; j <arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
                index = j + 1;
            }
        }
        System.out.print(index);
    }
}
