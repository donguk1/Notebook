package StudyGroup;

import java.util.Scanner;

public class Jun2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int[] arr = new int[n];//배열 선언
//        int[];
        int x, z;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            x = s.nextInt();
            arr[i]=x;
        }
        z = s.nextInt();
        for (int j = 0; j <arr.length; j++) {
            if (z == arr[j]) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
