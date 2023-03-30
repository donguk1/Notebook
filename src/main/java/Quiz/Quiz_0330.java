package Quiz;

public class Quiz_0330 {
    public static void main(String[] args) {

        int i, k;
        k = 2;

        for (i = 1; i < 10; i++)
        {
            System.out.printf("%d * %d = %d \n", k, i, k*i);
            if (i == 9){
                k++;
                i = 0;
                System.out.println();
            }
            if (k == 10)
                break;

        }
    }

}