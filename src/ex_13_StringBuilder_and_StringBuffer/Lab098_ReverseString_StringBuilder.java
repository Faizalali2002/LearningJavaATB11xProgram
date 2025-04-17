package ex_13_StringBuilder_and_StringBuffer;

import java.util.Scanner;



public class Lab098_ReverseString_StringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input to check the Palindrome : ");
        String userInput = sc.next();
        String newString = reverseString(userInput);
        if(newString.equalsIgnoreCase(userInput)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
    }

    private static String reverseString(String userInput) {
        StringBuilder sb = new StringBuilder(userInput);
        return sb.reverse().toString();
    }
}
