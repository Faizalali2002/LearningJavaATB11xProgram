package ex_05_Increment_Decrement_OP;

public class Lab062_inc_Dec_ex {
    public static void main(String[] args) {
        int a = 5;
        int b = a++ + a;
        System.out.println(b);
        System.out.println("------------------------------");

        int x = 10;
        int y = x++ + ++x;
        System.out.println("x: " + x + ", y: " + y);

        System.out.println("------------------------------");


        int c = 1;
        int d = c++ + c++ + ++c;
        System.out.println("c: " + c + ", d: " + d);

        System.out.println("------------------------------");
        int i = 0;
        i = i++ - --i + ++i;
        System.out.println(i);


        System.out.println("------------------------------");
        int m = 2, n = 3;
        int result = m++ * ++n;
        System.out.println("result: " + result + ", m: " + m + ", n: " + n);


        System.out.println("------------------------------");




    }
}
