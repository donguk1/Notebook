package Quiz;

public class Quiz_0331 {
    public static void main(String[] args) {
        int x, y;
        y = 0;

        for (x=1; x<=5; x++) {
            System.out.print("*");

            if (x > y) {
                y++;
                x = 0;
                System.out.println();
                if (y > 4)
                    break;
            }
        }

    }

}