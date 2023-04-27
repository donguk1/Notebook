package Baekjoon._9;

import java.io.*;

public class B_9_9506_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 0;

        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }
            bw.write(n + " ");
//            입력값 출력
            int hap = 0;
//            n 과 비교할 변수
            int m = 0;
//            약수의 갯수, 배열의 위치에 대입 가능하게끔 할 변수
            int []aa = new int[n/2];
            for (int i = 1; i <= n/2; i++) {
                if (n % i == 0) {
                    hap += i;
                    aa[m] = i;
                    m++;
                    if (n < hap) {
                        break;
                    }

                }
            }
            if (n == hap) {
                bw.write("= ");
                for (int i = 0; i < m; i++) {
                    bw.write(aa[i] + " ");
                    if (m-1 != i) {
                        bw.write("+ ");
                    }
                }
                bw.write("\n");
//                줄바꿈
            }else {
                bw.write("is NOT perfect.\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
