package LeetCode.RomantoInteger_13;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }


    public static int romanToInt(String string) {

        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);


        string = string.replace("IV", "IIII");
        string = string.replace("IX", "VIIII");
        string = string.replace("XL", "XXXX");
        string = string.replace("XC", "LXXXX");
        string = string.replace("CD", "CCCC");
        string = string.replace("CM", "DCCCC");
        int total = 0;

        for (int i = 0; i < string.length() ; i++) {
            total += hashMap.get(string.charAt(i));
        }
    return total;
    }
}
