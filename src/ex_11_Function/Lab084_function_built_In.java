package ex_11_Function;

import java.util.Arrays;

public class Lab084_function_built_In {
    public static void main(String[] args) {

        // 🔢 Math Class – Math is Math, and Math is POWER
        System.out.println("🔢 Math Functions:");
        System.out.println("Max of 3 and 4: " + Math.max(3, 4));
        System.out.println("Min of 10 and 5: " + Math.min(10, 5));
        System.out.println("Absolute of -7: " + Math.abs(-7));
        System.out.println("Square root of 25: " + Math.sqrt(25));
        System.out.println("2 power 3: " + Math.pow(2, 3));
        System.out.println("Random number: " + Math.random()); // between 0.0 and 1.0
        System.out.println("Ceil of 4.2: " + Math.ceil(4.2));
        System.out.println("Floor of 4.8: " + Math.floor(4.8));
        System.out.println("Round of 4.5: " + Math.round(4.5));
        System.out.println();

        // 🧵 String Class – Strings are life in Java
        System.out.println("🧵 String Functions:");
        String str = "   Hello Java  ";
        System.out.println("Original: '" + str + "'");
        System.out.println("Trimmed: '" + str.trim() + "'");
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Char at 1: " + str.charAt(1));
        System.out.println("Substring (2 to 7): " + str.substring(2, 7));
        System.out.println("Length: " + str.length());
        System.out.println("Starts with 'He': " + str.trim().startsWith("He"));
        System.out.println("Ends with 'va': " + str.trim().endsWith("va"));
        System.out.println("Contains 'Java': " + str.contains("Java"));
        System.out.println("Replace 'Java' with 'World': " + str.replace("Java", "World"));
        System.out.println();

        // 🔢 Arrays Class – Managing arrays like a boss
        System.out.println("🔢 Array Functions:");
        int[] arr = {4, 2, 9, 1};
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        int[] filled = new int[5];
        Arrays.fill(filled, 7);
        System.out.println("Filled Array with 7s: " + Arrays.toString(filled));
        int[] copy = Arrays.copyOf(arr, 6);
        System.out.println("Copy with extra space: " + Arrays.toString(copy));
        System.out.println("Is arr equals copy: " + Arrays.equals(arr, copy));
        System.out.println();

        // 📅 Wrapper Class Methods (Integer, Double etc.)
        System.out.println("📅 Wrapper Methods:");
        int x = Integer.parseInt("123");
        System.out.println("Parsed int: " + x);
        String numStr = Integer.toString(456);
        System.out.println("Int to String: " + numStr);
        double d = Double.parseDouble("3.14");
        System.out.println("Parsed double: " + d);
        boolean bool = Boolean.parseBoolean("true");
        System.out.println("Parsed boolean: " + bool);
        System.out.println();

        // 🔐 Character Class
        System.out.println("🔐 Character Functions:");
        char ch = 'A';
        System.out.println("Is Digit: " + Character.isDigit(ch));
        System.out.println("Is Letter: " + Character.isLetter(ch));
        System.out.println("Is Lowercase: " + Character.isLowerCase(ch));
        System.out.println("Is Uppercase: " + Character.isUpperCase(ch));
        System.out.println("To Lower: " + Character.toLowerCase(ch));
        System.out.println();

        // 📏 System Class
        System.out.println("📏 System Class:");
        System.out.println("Current Time in millis: " + System.currentTimeMillis());
        System.out.println("Nano time: " + System.nanoTime());

        // 🔄 Math round-trip
        System.out.println("\n🔄 Bonus Math:");
        double angle = 45;
        System.out.println("Sin(45): " + Math.sin(Math.toRadians(angle)));
        System.out.println("Cos(45): " + Math.cos(Math.toRadians(angle)));
        System.out.println("Tan(45): " + Math.tan(Math.toRadians(angle)));
    }
}
