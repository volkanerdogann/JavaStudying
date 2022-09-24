package w3resource.PerfectNumbers;

public class Main {
    public static void main(String[] args) {

        int numbersEntered = 10000;
        int total = 0;



        for (int i = numbersEntered; i > 0; i--) {
            total = 0;
            for (int j = 1; j < i; j++) {
                if ((i % j ) == 0) {
                    total += j;
                }
            }
            if (total == i) {
                System.out.println(i);
            }
        }

    }
}
