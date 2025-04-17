package ex_13_StringBuilder_and_StringBuffer;

import java.util.Scanner;

public class Lab099_ReverseString_StringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input to check the Palindrome : ");
        String userInput = sc.next();

        String newString = reverseString(userInput);

        if (newString.equalsIgnoreCase(userInput)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    private static String reverseString(String userInput) {
        StringBuffer sb = new StringBuffer(userInput); // Just changed to StringBuffer here
        return sb.reverse().toString();
    }
}
