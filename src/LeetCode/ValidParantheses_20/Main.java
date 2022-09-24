package LeetCode.ValidParantheses_20;


import java.util.HashMap;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        System.out.println(isValid("(]"));
    }

    public static boolean isValid(String string) {

        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        Stack<Integer> stack = new Stack<Integer>();


        hashMap.put('(', 1);
        hashMap.put(')', 2);
        hashMap.put('{', 3);
        hashMap.put('}', 4);
        hashMap.put('[', 5);
        hashMap.put(']', 6);

        for (int i = 0; i < string.length(); i++) {
            if (isOdd(hashMap, string.charAt(i))) {
                stack.push(hashMap.get(string.charAt(i)));
            }


            if (!isOdd(hashMap, string.charAt(i))) {
                if (stack.peek() != hashMap.get(string.charAt(i)) - 1) {
                    return false;
                }
                stack.pop();
            }
        }


        return (stack.isEmpty() && string.length() > 0);
    }

    public static boolean isOdd(HashMap hashMap, char character) {

        int value = (int) hashMap.get(character);

        if (value % 2 == 1)
            return true;

        return false;
    }
}
