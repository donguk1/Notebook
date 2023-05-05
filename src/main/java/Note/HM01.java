package Note;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HM01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> hm = new HashMap<>();
//        해쉬맵 선언. 키와 문자열 모두 문자열 선언

        for (int i = 0; i < 3; i++) {
            hm.put(String.valueOf(i), sc.next());
//            맵에 3개 추가
//            키 자료형은 반복문의 i+1 을
//            값 자료형은 Scanner 로 입력 받음
        }

        System.out.println(hm);
        for (int i = 0; i < 3; i++) {
            System.out.println(hm.get(String.valueOf(i)));
//            String.valueOf() 괄호 안의 값을 String으로 변환 즉, 문자열로 변환
        }
        
    }
}
