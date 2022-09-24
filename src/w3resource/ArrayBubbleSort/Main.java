package w3resource.ArrayBubbleSort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of array's length: ");
        int arraySize = input.nextInt();
        int[] array = fillArray(arraySize);


        bubbleSort(array);
    }



    public static int[] fillArray(int howMany) {
        int[] array = new int[howMany];
        Random random = new Random();


        for (int i = 0; i < howMany; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        return array;
    }

    public static void bubbleSort(int[] array) {
        System.out.println(Arrays.toString(array));
        int temp = 0;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j < array.length - 1) {
                    if (array[j] > array[j+1]) {
                        temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
