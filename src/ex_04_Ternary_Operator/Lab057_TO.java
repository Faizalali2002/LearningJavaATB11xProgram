package ex_04_Ternary_Operator;

public class Lab057_TO {
    public static void main(String[] args) {
        // age = 23 -> Adult  ( age > 18) , Minor (age  <18), Senior ( age > 65)

        int age = 4;
        String res = age > 18 ? age > 65 ? "Senior" : "Adult" : "Minor" ;
        System.out.println(res);
    }
}
