package StudyGroup;

public class Jun1_1 {
    public static void main(String[] args) {

        int n =5;
        String s = "*";

        for (int i = 0; i < n; i++) {
            for (int j = n - (i + 1); j > 0; j--) {
                System.out.print(" ");
            } System.out.println(s);
            s+="*";
        }

    }
}
