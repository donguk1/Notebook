package Baekjoon._13;

import java.io.*;
import java.util.StringTokenizer;

public class B_13_25305_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        int n = Integer.parseInt(st.nextToken());
        int []aa = new int[n];
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            aa[i] = Integer.parseInt(st.nextToken());
        }

        int t;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (aa[j] > aa[j+1]) {
                    t = aa[j];
                    aa[j] = aa[j+1];
                    aa[j+1] = t;
                }
            }
        }


        bw.write(String.valueOf(aa[n-k]));
        br.close();
        bw.flush();
        bw.close();

    }
}
