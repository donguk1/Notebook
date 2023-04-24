package Baekjoon._13;

import java.io.*;

public class B_13_2587_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        int []aa = new int[5];

        int avg = 0;

        for (int i = 0; i < 5; i++) {
            aa[i] = Integer.parseInt(br.readLine());
            avg += aa[i];
        }

        int a;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                if (aa[i] < aa[j]) {
                    a = aa[i];
                    aa[i] = aa[j];
                    aa[j] = a;
                }
            }
        }
        bw.write(String.valueOf(avg/5) + "\n");
        bw.write(String.valueOf(aa[2]));

        br.close();
        bw.flush();
        bw.close();

    }
}
