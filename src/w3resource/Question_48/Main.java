package w3resource.Question_48;

public class Main {
    public static void main(String[] args) {

        int counter = 0;
        int number = 2;
        boolean isPrime = false;

        while (counter < 100) {

            for (int i = 2; i < number; i++) {

                if ((number % i)  == 0)  {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(number);
            }
            counter++;
            number++;
            isPrime = true;
        }
    }
}
