package Ec1;

import java.util.Scanner;

public class Ec01 {
    public static void main(String[] args) {

        int a, b, c, d;
        int result;

        Scanner s = new Scanner(System.in);
        System.out.print("첫번째 계산할 값을 입력하세요 ==>");
        a = s.nextInt();
        System.out.print("두번째 계산할 값을 입력하세요 ==>");
        b = s.nextInt();
        System.out.print("셋번째 계산할 값을 입력하세요 ==>");
        c = s.nextInt();
        System.out.print("넷번째 계산할 값을 입력하세요 ==>");
        d = s.nextInt();

        result = a + b + c + d;
        System.out.print(a + "+" + b + "+" + c + "+" + d + "=" + result);
    }
}
