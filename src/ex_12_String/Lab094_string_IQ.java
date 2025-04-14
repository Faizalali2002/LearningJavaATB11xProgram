package ex_12_String;

public class Lab094_string_IQ {
    public static void main(String[] args) {
        // String literal - stored in String Constant Pool
        String str1 = "Hello";
        String str2 = "Hello";

        // 'new' keyword creates a new String object in the heap (not in String Pool)
        String str3 = new String("Hello");

        // true - both str1 and str2 refer to the same object in the String Pool
        System.out.println(str1 == str2);

        // false - str1 (from pool) and str3 (from heap) are different objects, even though they have the same content
        System.out.println(str1 == str3);

        // true - .equals() checks for value/content equality, not memory location
        System.out.println(str1.equals(str3));
    }
    }

