package Note;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AL01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Map<String, String>>  list = new ArrayList<>();

        Map<String, String> map = null;


        for (int i = 0; i < 3; i++) {
            map.put("시.도", sc.nextLine());
            map.put("시.군.구", sc.nextLine());
            list.add(0, map);
            map.clear();
        }

        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

    }
}
