package Baekjoon._3_4;

import java.io.*;
import java.util.StringTokenizer;

public class B_3_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int b = Integer.parseInt(br.readLine());

        for (int i = 0; i < b; i++) {
            st = new StringTokenizer(br.readLine());
            bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n"));
        }
        bw.close();
    }
}
