package ex_13_StringBuilder_and_StringBuffer;

public class Lab096_StringBuilder {
    public static void main(String[] args) {

        // Create an empty StringBuilder with default capacity (16 chars)
        StringBuilder stringBuilder = new StringBuilder();

        // Append adds content to the end
        stringBuilder.append("Hello");
        stringBuilder.append(" World");
        System.out.println("After append: " + stringBuilder);  // Hello World

        // insert(index, value) - inserts a string at the given index
        stringBuilder.insert(5, ",");
        System.out.println("After insert: " + stringBuilder);  // Hello, World

        // replace(start, end, string) - replaces characters from start to end-1 with new string
        stringBuilder.replace(0, 5, "Hi");
        System.out.println("After replace: " + stringBuilder);  // Hi, World

        // delete(start, end) - removes characters from start to end-1
        stringBuilder.delete(2, 3);
        System.out.println("After delete: " + stringBuilder);  // Hi World

        // reverse() - reverses the entire string
        stringBuilder.reverse();
        System.out.println("After reverse: " + stringBuilder);  // dlroW iH

        // length() - gives the current length of the content
        System.out.println("Length: " + stringBuilder.length());

        // capacity() - shows current capacity of StringBuilder (space allocated)
        System.out.println("Capacity: " + stringBuilder.capacity());

        // setCharAt(index, char) - sets a character at a specific index
        stringBuilder.setCharAt(0, 'F');
        System.out.println("After setCharAt: " + stringBuilder);  // FlroW iH

        // toString() - converts StringBuilder back to regular String
        String finalString = stringBuilder.toString();
        System.out.println("Final String: " + finalString);
    }
}
