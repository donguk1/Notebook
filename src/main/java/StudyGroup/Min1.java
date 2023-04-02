package StudyGroup;

import java.util.Scanner;

public class Min1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int hap = 0;

        if (a < b) {
            for (; a <= b; a++) {
                hap += a;
            }
        }
        else if (a > b ){
                for (; b <= a; b++) {
                    hap += b;
            }

        }
        System.out.print(hap);
    }
}
