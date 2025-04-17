package ex_13_StringBuilder_and_StringBuffer;

public class Lab097_StringBuffer {
    public static void main(String[] args) {

        // Creating an empty StringBuffer with default capacity (16)
        StringBuffer stringBuffer = new StringBuffer();

        // Append: Adds text at the end
        stringBuffer.append("Hello");
        stringBuffer.append(" World");
        System.out.println("After append: " + stringBuffer);  // Hello World

        // Insert: Inserts a string at specified index
        stringBuffer.insert(5, ",");
        System.out.println("After insert: " + stringBuffer);  // Hello, World

        // Replace: Replaces characters from start to end-1 with new string
        stringBuffer.replace(0, 5, "Hi");
        System.out.println("After replace: " + stringBuffer);  // Hi, World

        // Delete: Deletes characters between start (inclusive) and end (exclusive)
        stringBuffer.delete(2, 3);
        System.out.println("After delete: " + stringBuffer);  // Hi World

        // Reverse: Reverses the sequence of characters
        stringBuffer.reverse();
        System.out.println("After reverse: " + stringBuffer);  // dlroW iH

        // Length: Returns number of characters
        System.out.println("Length: " + stringBuffer.length());

        // Capacity: Returns current capacity of the buffer
        System.out.println("Capacity: " + stringBuffer.capacity());

        // Set character at a specific index
        stringBuffer.setCharAt(0, 'F');
        System.out.println("After setCharAt: " + stringBuffer);  // FlroW iH

        // Convert to string using toString()
        String finalStr = stringBuffer.toString();
        System.out.println("Final String: " + finalStr);
    }
}
