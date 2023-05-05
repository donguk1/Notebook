package Note;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String, Integer> hm = new java.util.HashMap<>();
//        꺽쇠의 첫 번째 위치에는 키자료형을
//        두 번째 위치에는 값 자료형을
        hm.put("A", 100);
        hm.put("B", 101);
        hm.put("C", 102);
        hm.put("C", 103);
//        키가 중복시 값을 현재 것으로 업뎃
        if (!hm.containsKey("B")) {
            hm.put("B", 104);
//            !부정을 의미. 여기서는 "B"라는 키가 없을 경우를 뜻함
//            즉, "B"라는 키가 없을경우 "B"키를 가진 104 값을 입력
        }

        System.out.println(hm);
//        맵을 그냥 출력하게 되면 {} 중괄호로 묶여서
//        키와 값을 같이 출력함
        System.out.println(hm.get("A"));
//        hm.get("A") 은 A를 키로 가진 값을 가져옴
        System.out.println(hm.get("B"));
        System.out.println(hm.get("C"));


//        get은 출력
//        put은 입력


    }

}
