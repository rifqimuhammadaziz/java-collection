package collection.legacy;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {

        /**
         * Stack (LIFO / Last In First Out)
         */
        Stack<String> stack = new Stack<>();
        stack.push("1Rifqi"); // first in
        stack.push("2Bagas");
        stack.push("3Bayu"); // last in

        stack.pop(); // remove last in
        for (var value : stack) {
            System.out.println(value);
        }
    }
}
