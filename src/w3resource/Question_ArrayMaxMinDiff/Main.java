package w3resource.Question_ArrayMaxMinDiff;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of array's length: ");
        int arraySize = input.nextInt();
        int[] array = fillArray(arraySize);


        findDifference(array);


    }

    public static int[] fillArray(int howMany) {
        int[] array = new int[howMany];
        Random random = new Random();


        for (int i = 0; i < howMany; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        return array;
    }


    public static void findDifference(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int min = array[i];
                if (array[j] < array[i]) {
                    array[i] = array[j];
                    array[j] = min;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        int difference =array[array.length - 1] - array[0];
        System.out.println("The difference is: " + difference);

    }
}
