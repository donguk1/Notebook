package Quiz;

public class Quiz0405 {
    public static void main(String[] args) {
        int i = 2, k = 0;

        while (i != 10) {
            k++;
            System.out.printf("%d X %d = %d\t", i, k, i * k);
            if (k == 9) {
                System.out.println();
                k = 0;
                i++;
            }
        }
    }
}


