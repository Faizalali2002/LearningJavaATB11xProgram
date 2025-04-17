package Task;

public class Count_Vowels_And_consonants {
    public static void main(String[] args) {
        String str = "Java is powerful and poetic, just like your code!";
        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase();
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u'){
                vowels++;
            }
            else{
                consonants++;
            }


        }

        System.out.println(vowels);
        System.out.println(consonants );
    }







}
