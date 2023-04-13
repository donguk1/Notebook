package Baekjoon._3_4;

import java.io.*;
import java.util.StringTokenizer;

public class B_3_25304_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = 0;
        x = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());

        int a, b;


        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            x -= a * b;

        }

        if (x == 0) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }


        br.close();
        bw.flush();
        bw.close();
    }
}


