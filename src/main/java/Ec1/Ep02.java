package Ec1;

import java.util.Scanner;

public class Ep02 {
    public static void main(String[] args) {

        int a, b;
        int result;
        int k;

        Scanner s = new Scanner(System.in);
        System.out.print("첫번째 계산할 값을 입력하세요 ==>");

        a = s.nextInt();
        System.out.print("<1>덧셈<2>뺄셈<3>곱셈<4>나눗셈 ==> ");
        k = s.nextInt();
        System.out.print("두번째 계산할 값을 입력하세요 ==>");
        b = s.nextInt();

        if (k == 1) {
            result = a + b;
            System.out.println(a + "+" + b + "=" + result);
        }
        if (k == 2) {
            result = a - b;
            System.out.println(a + "-" + b + "=" + result);
        }
        if (k == 3) {
            result = a * b;
            System.out.println(a + "*" + b + "=" + result);
        }
        if (k == 4) {
            result = a / b;
            System.out.println(a + "/" + b + "=" + result);
        }
    }
}
