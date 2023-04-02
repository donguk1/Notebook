package StudyGroup;

public class Star {
    public static void main(String[] args) {




        for (int i = 0; i < 5; i++) {
            for (int j = 5 - (i + 1); j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
