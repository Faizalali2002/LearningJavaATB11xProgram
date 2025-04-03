package ex_04_Ternary_Operator;

public class Lab054_TO {
    public static void main(String[] args) {

        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);



        int num = 18;

        String res = num > 15 ? "abc" : num > 5 ? "def" : "ghi";
        System.out.println(res);
    }
}
