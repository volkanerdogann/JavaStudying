package w3resource.ArmstrongNumbers;

public class Main {
    public static void main(String[] args) {

        int numbersEntered = 9999;
        int total;
        int remainder;
        int temp;

        for (int i = numbersEntered; i > 0; i--) {
            total = 0;
            temp = i;

            while (temp > 0) {
                remainder = (temp % 10);
                total += cube(remainder);
                temp /= 10;
            }
            if (total == i) {
                System.out.println(i);
            }
        }

    }


    public static int cube(int n) {
        return (int) Math.pow(n,3);
    }
}
