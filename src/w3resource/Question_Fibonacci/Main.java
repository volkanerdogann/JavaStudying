package w3resource.Question_Fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number how many columns you want: ");
        int enteredNumber = input.nextInt();
        fibonacci(enteredNumber);
    }


    public static void fibonacci(int enteredNumber) {

        int oldNumber = 0;
        int currentNumber = 1;
        int newNumber;

        System.out.print(oldNumber+","+currentNumber+",");

        for (int i = 0; i < enteredNumber; i++) {


            newNumber = oldNumber + currentNumber;
            System.out.print(newNumber + ",");

            oldNumber = currentNumber;
            currentNumber = newNumber;
        }
    }
}
