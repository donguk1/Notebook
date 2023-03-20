package Star;

import java.util.Scanner;

public class QuizDiaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i + j <= 9 / 2 - 1)
                    System.out.print(" ");
                else if (j - i >= 9 / 2 + 1)
                    System.out.print(" ");
                else if (i - j >= 9 / 2 + 1)
                    System.out.print(" ");
                else if (i + j >= 9 / 2 * 2 + 1)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
