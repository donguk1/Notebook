package Quiz;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Quiz0502_S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        입력 방식 스캐너
        LinkedList<Integer> lli = new LinkedList<Integer>();
//        링크드리스트 선언. 형식은 정수형
        for (int i = 0; i < 5; i++) {
            lli.add(sc.nextInt());
//            입력 횟수가 5개로 정해져 있음
//            정수형으로 입력 받을 때마다 리스트에 추가(add)
        }

        Collections.sort(lli, Collections.reverseOrder());
//        sort : 오름차순 정렬
//        reverseOrder : 현재 리스트를 역순으로 정렬
        System.out.println(lli);
    }
}
