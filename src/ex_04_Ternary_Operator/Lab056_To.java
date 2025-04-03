package ex_04_Ternary_Operator;

public class Lab056_To {
    public static void main(String[] args) {
        int a = 2, b = 9, c = -11;


        // Logic Building formula

        // Step 1 : Find inputs /outputs
        // I/O -> n1,n2,n3 - int
        // O/P -> String ->  max number

        // Step 2 - Rough Logic, Think about it.
        // n1 > n2 and n1  > n3 -> n1
        // n2 > n3 and n2>  n1 ->  n2
        // n3

        int max = a > b ? a > c ? a : c : b > c ? b : c;
        System.out.println(max);

    }
}
