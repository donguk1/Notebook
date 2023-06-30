package Baekjoon._13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B_13_10890_B {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<Integer> li = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            li.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(li);



        for (int i = 0; i < n; i++) {
            bw.write(li.get(i) + "\n");
        }

        bw.flush();
        bw.close();

    }
}
