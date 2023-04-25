package Baekjoon.Star;

import java.io.*;

public class S_2443 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {      //줄넘김용
            for (int j = 1; j < i; j++) {    //공백용
                bw.write(" ");
            }
            for (int j = n*2; j > i*2-1; j--) {
                bw.write("*");
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();

    }
}
