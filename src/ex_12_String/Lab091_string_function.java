package ex_12_String;

public class Lab091_string_function {
    public static void main(String[] args) {

        String name = "Faizal ali  ";
        String message = "Java is Awesome";

        // 1. length()
        System.out.println("Length: " + name.length());

        // 2. trim()
        System.out.println("Trimmed: '" + name.trim() + "'");

        // 3. toUpperCase() & toLowerCase()
        System.out.println("Upper: " + name.toUpperCase());
        System.out.println("Lower: " + name.toLowerCase());

        // 4. charAt()
        System.out.println("Char at 3: " + name.charAt(3));

        // 5. substring()
        System.out.println("Substring(2, 7): " + name.substring(2, 9));

        // 6. equals() & equalsIgnoreCase()
        System.out.println("Equals 'Faizal ali'? " + name.equals("Faizal ali"));
        System.out.println("EqualsIgnoreCase 'faizal ali'? " + name.trim().equalsIgnoreCase("faizal ali"));

        // 7. contains()
        System.out.println("Contains 'ali'? " + name.contains("ali"));

        // 8. replace()
        System.out.println("Replace 'Ali' with 'Khan': " + name.replace("ali", "Khan"));

        // 9. startsWith() & endsWith()
        System.out.println("Starts with '  F'? " + name.startsWith("F"));
        System.out.println("Ends with 'Ali  '? " + name.endsWith("ali  "));

        // 10. indexOf() & lastIndexOf()
        System.out.println("Index of 'a': " + name.indexOf('a'));
        System.out.println("Last index of 'a': " + name.lastIndexOf('a'));

        // 11. isEmpty() & isBlank()
        String empty = "";
        String blank = "   ";
        System.out.println("Is empty: " + empty.isEmpty());
        System.out.println("Is blank: " + blank.isBlank());

        // 12. split()
        String[] words = message.split(" ");
        System.out.print("Split: ");
        for (String word : words) {
            System.out.print(word + " | ");
        }
        System.out.println();

        // 13. join()
        String joined = String.join("-", words);
        System.out.println("Joined: " + joined);

        // 14. compareTo()
        System.out.println("CompareTo 'Zebra': " + name.compareTo("Zebra"));

        // 15. intern()
        String poolStr = new String("Java").intern();
        System.out.println("Interned: " + poolStr);

        // 16. concat()
        System.out.println("Concat: " + name.concat(" is a Java Dev"));

        // 17. matches() - regex match
        System.out.println("Does name match regex '.*Ali.*'? " + name.matches(".*Ali.*"));
    }
}
