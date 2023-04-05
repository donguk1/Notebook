package Star;

public class Starblank {
    public static void main(String[] args) {

        int i, k = 4;
        String c = "*";

        for (i = 4; i < 4; i++) {
                for ( ; i < 0; ) {
                    System.out.print(" ");
                }
                for (k = 1; k < 4; k++) {
                    System.out.print(c);
                    c += "*";
                }
                System.out.println();
        }
    }
}
