package Baekjoon._3_4;

import java.io.*;
import java.util.StringTokenizer;

public class B_3_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int h = Integer.parseInt(br.readLine());
        int a, b;
        StringTokenizer st;

        for (int i = 1; i <= h; i++) {
            st = new StringTokenizer(br.readLine()," ");

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            bw.write("Case #"+i+": ");
            bw.write(a + " + " + b + " = ");
            bw.write((a + b) + "\n");

        }
        br.close();
        bw.flush();
        bw.close();
    }
}
